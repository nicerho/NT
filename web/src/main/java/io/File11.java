package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//Stream 으로 파일로드 하는 방식 + 쓰기
public class File11 {
	public static void main(String[] args) {
		try {
			new data9().abc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class data9 {
	public void abc() throws Exception {
		InputStream is = new FileInputStream("E:\\project\\web\\src\\main\\webapp\\datalist.txt");
		// System.out.println(is.available()); available() : 파일 전체 크기
		byte temp[] = new byte[is.available()]; // 파일 전체를 모두 byte배열로 적용
		// byte temp[] = new byte[1024 * 10];
		/*int ea =*/ is.read(temp);// 파일 전체 크기 체크, read()가 필요한 이유는 해당 파일을 바이너리 형태로 읽기 때문에 readㅁ메서드로 파일 전체를 읽는다
								// 아스키코드의 경우 read가 아닌 readLine()을 쓰자
		String data = new String(temp, "UTF-8");
		System.out.println(data);
		is.close();
		new data22().zzz();
	}
}

class data22 {
	public void zzz() throws Exception {
		String test = "\ntest";
		OutputStream os = new FileOutputStream("E:\\project\\web\\src\\main\\webapp\\datalist.txt", true);
		byte data[] = test.getBytes(); //문자열을 byte단위로(바이너리) 변환
		os.write(data);
		os.flush();
		os.close();
	}
}