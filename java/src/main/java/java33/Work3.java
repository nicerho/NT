package java33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection ct = null;

		try {
			System.out.println("당신의 성별은");
			System.out.println("1. 남성 2. 여성");
			String sex = sc.nextLine().intern();
			System.out.println("당신의 연령층은");
			System.out.println("1. 10대 2. 20대 3. 30대 4. 40대 5. 50대 이상");
			String age = sc.nextLine().intern();
			System.out.println("현재 기후위기 단계 수준은?");
			System.out.println("1. 매우 심각 2. 심각 3. 보통 4. 심각하지 않음");
			String danger = sc.nextLine().intern();
			if (sex != "" && age != "" && danger != "" && Integer.parseInt(sex) > 0 && Integer.parseInt(sex) < 3
					&& Integer.parseInt(age) < 6 && Integer.parseInt(age) > 0 && Integer.parseInt(age) < 5) {
				String insert = "insert into test2 values ('0','" + sex + "','" + age + "','" + danger + "');";
				ct = dbconfig3.info();
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
					Work3.main(null);
				}
			} else {
				System.out.println("sql syntax error");
				Work3.main(null);
			}
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}

	}

}

class dbconfig3 {
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