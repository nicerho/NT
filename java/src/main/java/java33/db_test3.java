package java33;

import java.sql.Connection;
import java.sql.DriverManager;

public class db_test3 {
	public static void main(String[] args) {
		try {
			Connection con = dfv.info();
			

		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}

class dfv {
	public static Connection info() throws Exception { // Connection :
		String db_drive = "com.mysql.jdbc.Driver";
		String db_url = "jdbc:mysql://localhost:3306/web";
		String db_user = "hong";
		String db_pass = "1234";
		Class.forName(db_drive);
		Connection con = DriverManager.getConnection(db_url, db_user, db_pass);

		return con;
	}
}