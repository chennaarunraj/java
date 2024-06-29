 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		
		 
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Chenna@67732");
    st=con.createStatement();
String sql="delete from customers where cust_id=1";
int i=st.executeUpdate(sql);
   if(i!=0) {
	System.out.println(i+" record is deleted");
     } 
   else{
	System.out.println("no record deleted");
	}
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				st.close();
			}catch( SQLException e){
				e.printStackTrace();
			
		}

        }

	}}
