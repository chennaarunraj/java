import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Updatedemo{
 

	public static void main(String[] args) {
        try{
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "Chenna@67732");
        PreparedStatement ps=conn.prepareStatement("update customers set cust_name=?,amount=? where cust_id=?");
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);
        System.out.println("enter the customer id ");
        int custid=s1.nextInt();

        System.out.println("enter the name of customer");
        String cust_name=s2.nextLine();

        System.out.println("enter the amount ");
        int amount =s3.nextInt();

        ps.setInt(3,custid);
        ps.setString(1, cust_name);
        ps.setInt(2, amount);
       
        int RowsUpdated=ps.executeUpdate();
        System.out.println("rows updated"+RowsUpdated);

        ps.close();
        conn.close();

    }catch(SQLException e){
        System.out.println("exception caught"+e);
    }
}
}