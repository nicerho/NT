package io;

import java.io.FileReader;
import java.io.IOException;

//IOException + Exception + finally (예외처리로 다시 해당 프로세서 실행 
public class File3 {
	public static void main(String[] args) {

		try {
			data2 a = new data2();
			String url = "E:\\project\\web\\src\\main\\webapp\\data1.txt";
			a.abc(url);
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // catch로 오류 발생시 다시 프로세서를 읽어 해당 메서드를 호출하는 형태
			System.out.println("sdf");
			data2 a = new data2();
			String url = "E:\\project\\web\\src\\main\\webapp\\data.txt";
			try { //해당 메서드가 에외를 던졋으므로 다시 try catch를 사용해야한다
				a.abc(url);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0); // 프로그램 강제종료
			}
		}
	}
}

class data2 {
	FileReader fr = null;

	public void abc(String filename) throws Exception, IOException {
		this.fr = new FileReader(filename);
		System.out.println(this.fr.read());
		this.fr.close();
	}
}