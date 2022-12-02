package jdbc;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;

import oracle.jdbc.rowset.OracleJDBCRowSet;

public class JRSDemo {

	public static void main(String[] args) {
		
		try {
			JdbcRowSet jrs = new OracleJDBCRowSet();
			jrs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
			jrs.setUsername("deepi");
			jrs.setPassword("123");
			jrs.setCommand("SELECT * FROM STUDENT");
			jrs.execute();
			while(jrs.next()) {
				System.out.print(jrs.getInt("rollno")+ "\t");
				System.out.print(jrs.getString("name")+ "\t");
				System.out.print(jrs.getInt("marks")+ "\t");
				System.out.println(jrs.getString("dept"));
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
