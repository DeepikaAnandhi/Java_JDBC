package jdbc;
import java.sql.*;

//EX:2 PROGRAM TO CREATE TABLE

public class CreateTable {
	public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","deepi","123");
		
		// createstatement is a method in connection 
				//class return type is statement
		Statement stmt = con.createStatement();
		
		// execute is a abstract method in statement 
				//interface to execute create , alter and drop commands
		stmt.execute("CREATE TABLE STUDENT (rollno number(3), name varchar2(15) , marks number(3))");
		System.out.println("Table created Successfully");
		
	} catch (Exception e) {
		System.err.println(e);
	}
	}
}


