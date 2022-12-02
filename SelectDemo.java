package jdbc;
import java.sql.*;

//EX:5 PROGRAM TO RETRIEVE THE DATA FROM THE TABLE

public class SelectDemo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","deepi","123");
			
			// createstatement is a method in connection class
				//its return type is statement
			Statement stmt= con.createStatement();
			
			// A ResultSet is Generated based on SQL Query, 
				// Its a object that encapsulates set of rows from database.
			ResultSet rs=	stmt.executeQuery("SELECT * FROM STUDENT");
			
			//ResultSetMetaData represents the column names of the table
			ResultSetMetaData rsmd = rs.getMetaData();
			int n= rsmd.getColumnCount();
			for(int i=1;i<=n;i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();
			while(rs.next()) {
				for(int i=1;i<=n;i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
