package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AlterTable {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","deepi","123");
			
			// createstatement is a method in connection 
					//class return type is statement
			Statement stmt = con.createStatement();
			
			// execute is a abstract method in statement 
					//interface to execute create , alter and drop commands
			stmt.execute("ALTER TABLE STUDENT ADD (DEPT VARCHAR2(3))");
			System.out.println("Table Altered Successfully");
			
		} catch (Exception e) {
			System.err.println(e);
		}
		}
	}
