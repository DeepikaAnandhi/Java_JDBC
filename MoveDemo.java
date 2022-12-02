package jdbc;
import java.sql.*;


// EX:9


public class MoveDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","deepi","123");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");
			rs.absolute(3);
			System.out.print(rs.getInt("rollno")+"\t");
			System.out.print(rs.getString("name")+"\t");
			System.out.print(rs.getInt("marks")+"\t");
			System.out.println(rs.getString("dept"));
 			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
