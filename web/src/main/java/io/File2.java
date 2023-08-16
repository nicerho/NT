package io;

import java.io.FileReader;

//IO 파일 데이터 읽어오기..
public class File2 {
	public static void main(String[] args) {

		try {
			data1 a = new data1();
			a.aaa();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class data1 {
	public void aaa() throws Exception {
		FileReader fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\data.txt");
		// fr.getEncoding() <- 인코딩 형식을 체크하자
		while (true) {
			int m = fr.read();
			System.out.print((char) m); // 바이트를 문자화하여 출력
			if (m == -1) {
				break;
			}

		}
		fr.close();
	}
}
