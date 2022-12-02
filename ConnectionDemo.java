package jdbc;
import java.sql.*;

//EX:1 Program to Establish connection between java application and type4 driver

public class ConnectionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","deepi","123");
			System.out.println("Connection Established Successfully");
			
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
