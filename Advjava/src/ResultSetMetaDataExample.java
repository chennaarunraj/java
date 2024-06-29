import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class ResultSetMetaDataExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver ());
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "Chenna@67732"); 
			Statement st=conn.createStatement();
		    ResultSet rs=st.executeQuery("select * from employees");
		    ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
			
			System.out.println("coulmn count"+rsmd.getColumnCount());
		    System.out.print("column name"+rsmd.getColumnName(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
