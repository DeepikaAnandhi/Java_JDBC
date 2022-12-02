package jdbc;
import java.sql.*;

// EX:4  PROGRAM TO INSERT DATA INTO TABLE
public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","deepi","123");
			
			// createstatement is a method in connection 
					//class return type is statement
			Statement stmt = con.createStatement();
			stmt.executeUpdate("INSERT INTO STUDENT VALUES(3, 'Prabu', 97, 'CSE')");
			System.out.println("1 Row Created");
			
		} catch (Exception e) {
			System.err.println(e);
		}
		

	}

}
