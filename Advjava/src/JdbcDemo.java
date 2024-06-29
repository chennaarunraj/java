import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo {

	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Chenna@67732");
		System.out.println(con);
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
finally {
	try {
	con.close();
	}catch(SQLException e)
	   {
		e.printStackTrace();
	   }

   }
		
	
}	
}
	
	

