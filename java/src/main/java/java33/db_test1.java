package java33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 자바 + DB, DB커넥터 설치 필수
 * */

public class db_test1 {

	public static void main(String[] args) {
//		String times = new timezone().now_time(4);
//		System.out.println(times);
		Connection ct = null;
		try {
//			dbconfig db = new dbconfig();
			ct = dbconfig.info();
//			System.out.println(ct.toString()); DB 접속 체크~
			String insert = "insert into test values ('0','껄껄이','gg@nate.com','ㅋㅋㅋㅋ','ㅋㅋㅋㅋㅋㅋ',now());";

			PreparedStatement ps = ct.prepareStatement(insert); // prepareStatement : sql 작업 준비과정
//			ps.execute() execute는 select 에만 쓰인다
//			ps.excuteUpdate() insert, update, delete, alter, create 등에 쓰인다
			int oksign = ps.executeUpdate(); // Query에 대한 값은 무족건 숫자로 처리한다.. 그래서 oksign을 int로.. 0은 실패 1은 성공
			if (oksign == 1) {
				System.out.println("ok");
				ps.close();
				ct.close();
			} else {
				System.out.println("sql syntax error");
			}

		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
}

class dbconfig { // DB 접속 환경 설정 클래스
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