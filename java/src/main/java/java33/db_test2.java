package java33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class db_test2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection ct = null;
		try {
			System.out.println("글제목");
			String subject = sc.nextLine().intern();
			System.out.println("글쓴이명");
			String writer = sc.nextLine().intern();
			System.out.println("비밀번호");
			String password = sc.nextLine().intern();
			System.out.println("글내용");
			String board = sc.nextLine().intern();
			if (subject != "" && writer != "" && password != "" && board != "" && password.length() > 5
					&& subject.length() < 101 && writer.length() < 51) {
				String insert = "insert into test values ('0','" + subject + "','" + writer + "'," + "password"+"('"+ password + "')" + ",'" + board + "');";
				ct = dbconfig2.info();
				PreparedStatement ps = ct.prepareStatement(insert);
				int oksign = ps.executeUpdate();
				System.out.println(insert);
				if (oksign == 1) {
					System.out.println("ok");
					ps.close();
					ct.close();
					sc.close();
				} else {
					System.out.println("sql syntax error");
					db_test2.main(null);
				}
			} else {
				System.out.println("sql syntax error");
				db_test2.main(null);
			}
		} catch (Exception e) {
			
			
			System.out.println("error");
			e.printStackTrace();
		}
	}
}

class dbconfig2 {
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
