import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletejdbc {

	public static void main(String[] args) {
		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Chenna@67732");
			
			
			PreparedStatement ps=con.prepareStatement("delete from customers where cust_id=?");
			System.out.println("Successfully Connected to Database");
			
			System.out.println("Enter the row to be deleted");
			Scanner s1=new Scanner(System.in);
			int cust_id=s1.nextInt();
			
			ps.setInt(1, cust_id);
			
			int i=ps.executeUpdate();
			System.out.println("Rowsdeleted"+i);
			
			ps.close();
			con.close();
			
		}catch(SQLException e) {
			
		e.printStackTrace();
		}


	
	
	}

}
