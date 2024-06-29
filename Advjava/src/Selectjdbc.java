import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Selectjdbc {

	public static void main(String[] args) {
  
		try { 
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Chenna@67732");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("Select * from Customers");
		
	     while(rs.next()) {
	            System.out.println("Customer id "+rs.getInt(1));
	            System.out.println("Customer name  "+rs.getString(2));
	            System.out.println(" Amount "+rs.getInt(3));
	            System.out.println("-----------------------");
	     }
		
		
		
	     rs.close();
	        st.close();
	        conn.close();
	}catch(SQLException e) {
		
		e.printStackTrace();
		}
		
		
		}
		}
