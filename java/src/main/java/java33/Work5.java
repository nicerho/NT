package java33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Work5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection ct = null;
		String insert = "";
		try {
			System.out.println("회원가입 형태");
			System.out.println("1.일반 고객 2.사업자 고객");
			String type = sc.nextLine().intern();
			if (type=="1") {
				System.out.println("아이디?");
				String id = sc.nextLine().intern();
				System.out.println("비밀번호?");
				String password = sc.nextLine().intern();
				System.out.println("이름?");
				String name = sc.nextLine().intern();
				System.out.println("전화번호?");
				String tel = sc.nextLine().intern();
				System.out.println("이메일?");
				String email = sc.nextLine().intern();
				if (id != "" && password != "" && name != "" && tel != "" && email != "" && tel.length() < 12) {
					insert = "insert into test3 values ('0','" + id + "',password('" + password + "'),'" + name + "','" + tel
							+ "','" + email + "');";
				}
			} else if (type=="2") {
				System.out.println("아이디?");
				String id = sc.nextLine().intern();
				System.out.println("비밀번호?");
				String password = sc.nextLine().intern();
				System.out.println("이름?");
				String name = sc.nextLine().intern();
				System.out.println("전화번호?");
				String tel = sc.nextLine().intern();
				System.out.println("이메일?");
				String email = sc.nextLine().intern();
				System.out.println("사업자번호?");
				String num = sc.nextLine().intern();
				if (id != "" && password != "" && name != "" && tel != "" && email != "" && tel.length() < 12
						&& num != "" &&num.length()<11) {
					insert = "insert into test4 values('0','" + id + "',password('" + password + "'),'" + name + "','" + tel
							+ "','" + email + "','"+num+"');";
				}
			} else {
				System.out.println(insert);
				System.out.println("error");
				Work5.main(null);
			}
			ct = dbconfig4.info();
			PreparedStatement ps = ct.prepareStatement(insert);
			int oksign = ps.executeUpdate();
			if (oksign == 1) {
				System.out.println("ok");
				System.out.println(insert);
				ps.close();
				ct.close();
				sc.close();
			} else {
				System.out.println("sql syntax error");
				Work5.main(null);
			}
		} 
		catch (com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException z) {
			System.out.println(insert);
		}
		catch (Exception e) {
			System.out.println(insert);
			e.printStackTrace();
		}
	}
}

class dbconfig5 {
	public static Connection info() throws Exception {
		String db_drive = "com.mysql.jdbc.Driver";
		String db_url = "jdbc:mysql://localhost:3306/web";
		String db_user = "hong";
		String db_pass = "1234";
		Class.forName(db_drive);
		Connection con = DriverManager.getConnection(db_url, db_user, db_pass);
		return con;
	}
}