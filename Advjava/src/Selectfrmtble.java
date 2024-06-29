import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Selectfrmtble {
	   public static void main(String[] args) throws Exception {

	        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "Chenna@67732"); 
	        Statement st=conn.createStatement();
	        ResultSet rs=st.executeQuery("select * from employees");
	        while(rs.next()){
	            System.out.println("employee id "+rs.getInt(1));
	            System.out.println("employee name  "+rs.getString(2));
	            System.out.println("employee salary"+rs.getInt(1));
	            System.out.println("-----------------------");

	        }
	        rs.close();
	        st.close();
	        conn.close();

	    }
}
