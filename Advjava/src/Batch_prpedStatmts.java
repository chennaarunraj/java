import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Batch_prpedStatmts {

	public static void main(String[] args) throws SQLException {
     
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Chenna@67732"); 
			String sql="insert into Customers values(?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
	       
	ps.setInt(1, 10);
	ps.setString(2, "Ram");
	ps.setInt(3, 4561);
	ps.addBatch();
	ps.executeBatch();
	
	ps.setInt(1, 11);
	ps.setString(2, "Ramaya");
	ps.setInt(3, 461);
	ps.addBatch();
	ps.executeBatch();
	
	ps.setInt(1, 12);
	ps.setString(2, "raghu");
	ps.setInt(3, 76000);
	ps.addBatch();
	int[] i=ps.executeBatch();
	
	
	
	ps.close();
	conn.close();
	
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			
		}
	
		
		
		
	}


