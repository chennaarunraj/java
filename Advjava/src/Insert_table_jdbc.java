import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert_table_jdbc {

	public static void main(String[] args) {
		try {
			System.out.println("Connecting to SQl Database");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Chenna@67732");
		PreparedStatement ps=con.prepareStatement("insert into employees values(?,?,?)");
		
		
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		Scanner s3=new Scanner(System.in);
		
		System.out.println("Enter emp id");
		int emp_id=s1.nextInt();
		
		System.out.println("Enter emp name");
		String emp_name=s2.nextLine();
		
		System.out.println("Enter emp salary");
		double emp_salary=s3.nextDouble();
		
		
		ps.setInt(1,emp_id);
		ps.setString(2,emp_name);
		ps.setDouble(3,emp_salary);
		
		int Rows=ps.executeUpdate();
		System.out.println("Rows added"+Rows);
		ps.close();
		con.close();
		}catch(SQLException e){
            System.out.println("exception caught");
        }finally{
            System.out.println("block exceuted");
        }	
		
		
		
}

}
