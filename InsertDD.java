package jdbc;

import java.sql.*;

public class InsertDD {

	public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","deepi","123");
		PreparedStatement pstmt=con.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?)");
		pstmt.setInt(1,Integer.parseInt(args[0]));
		pstmt.setString(2, args[1]);
		pstmt.setInt(3,Integer.parseInt(args[2]));
		pstmt.setString(4, args[3]);
		pstmt.executeUpdate();
		System.out.println("One record Inserted successfully");
		
	} catch (Exception e) {
		e.printStackTrace();
	}

	}

}
