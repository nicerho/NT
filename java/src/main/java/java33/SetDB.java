package java33;

import java.sql.Connection;
import java.sql.DriverManager;

//Java17

public interface SetDB {
	public void dbconnect(String user, String password,String db) throws Exception;
	public void select(String userid);
	public void delete(int idx);
	public void update(String dataid,int idx);
	public void insert(String[] a);

	public static Connection info(String user, String password,String db) throws Exception {
		String db_driver = "com.mysql.jdbc.Driver";
		String db_url = "jdbc:mysql://localhost:3306/"+db;
		String db_user = user;
		String db_pw = password;
		Class.forName(db_driver);
		Connection con = DriverManager.getConnection(db_url, db_user, db_pw);
		return con;
	}
	void insert();
	void select(String table, String dataid);
}
