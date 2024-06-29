import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class Batch_statement {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Chenna@67732"); 
			Statement st=conn.createStatement();
	String sql1 ="insert into Customers values(1002,'Shyam',4556)";
	String sql2 ="update Customers set cust_name='Vaishu' where cust_id=3";
	String sql3 ="delete from customers where cust_id=5";
	st.addBatch(sql1);
	st.addBatch(sql2);
	st.addBatch(sql3);
	
	 int[] result = st.executeBatch(); 

     // Process the results if needed
      for (int i : result) {
          System.out.println("Result: " + i);
      }
     
     // Close resources
     st.close();
     conn.close();

}catch(ClassNotFoundException e){
	e.printStackTrace();
}
}}