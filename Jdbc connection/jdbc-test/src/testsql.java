
import java.sql.*;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

import java.sql.ResultSet;
	   public class testsql{
		   
		    public static void main (String[] args) throws SQLException{
		    	
		    	Connection myConn = null;
		    	Statement myStmt = null;
		    	ResultSet myResult= null;
		    	
		    	
		    	String dbUrl = "jdbc:mysql://localhost:3306/ demo";
				String user = "root";
				String pass = "abc@12";
			
				
				try {
					//get database connection
					
					 myConn = DriverManager.getConnection(dbUrl,user,pass);
					
					//create statement
					 myStmt = myConn.createStatement();
					 
				
				
					 
					 int rowsAffected = myStmt.executeUpdate(
							 
						"update employees " + 
						"set email ='kaushalg518@gmail.com'"+
							"where first_name ='kaushal' and last_name ='ghimire'");
					 
					int rowsAffected1 = myStmt.executeUpdate(
							
							"delete from employees "+
							"where last_name ='ghimire' and first_name ='kaushal'"
							);
					
					int rowsAffected2 = myStmt.executeUpdate(
							"insert into employees "+"(last_name,first_name,email,department,salary)"
							+ "values" + 
									"('Doe','John','john.doe@gmail.com','HR',50000)"
					
							);
					 
					 //execute SQL query
					 myResult = myStmt.executeQuery("select * from employees");
					 
					 //process the result set
					while(myResult.next()) {
						System.out.println(myResult.getString("last_name") + "," 
					     + myResult.getString("first_name") + "," + myResult.getString("email"));
						
						
					}
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			   }

			private static void displayEmployees(Connection myConn, String string, String string2) {
				
			}

	
	   }
	   
	   


