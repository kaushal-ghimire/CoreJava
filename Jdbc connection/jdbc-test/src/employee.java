import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class employee {

	public static void main(String[] args) throws SQLException{
		
		Connection newConn = null;
		Statement newStat = null;
		ResultSet newResult = null;
		
		
		String newUrl = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String pass = "abc@12";
		
		try {
			
			//get database connection
			newConn = DriverManager.getConnection(newUrl,user,pass);
			
			//create statement
			newStat = newConn.createStatement();
			
	
					 
	int rowsAffected = newStat.executeUpdate(
			"delete from employees " +
			"where last_name='Wilson' and first_name='Carry'"
							 );
	
			
			//Execute SQL Query...
			newResult = newStat.executeQuery("SELECT *From employees");
			
			//Process result set....
			while(newResult.next()) {
				System.out.println(newResult.getString("first_name") + "," + newResult.getString("last_name") + ","
						+ newResult.getString("email") + "," + newResult.getString("salary"));
			}
		}
		
		
      catch (SQLException e) {
			e.printStackTrace();
		}
		

		
		
	}



}
