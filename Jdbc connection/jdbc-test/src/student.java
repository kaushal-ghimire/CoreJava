
import java.sql.*;


public class student {

	public static void main(String[] args) throws SQLException {
	
		Connection myConn1 = null;
		Statement myStatmnt = null;
		ResultSet myrslt = null;
		
		String url ="jdbc:mysql://localhost:3306/studentdemo";
		String user = "root";
		String pass ="abc@12";
		
		try{
			//database connection
			myConn1 = DriverManager.getConnection(url,user,pass);
			
			//create statement
			myStatmnt = myConn1.createStatement();
			
			//execute query...
			myrslt = myStatmnt.executeQuery("select * from student");
			
			while(myrslt.next()) {
				System.out.println(myrslt.getString("Contact") + "," + myrslt.getString("Name"));
			}
			
			
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
