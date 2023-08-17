package io;

import java.io.OutputStream;
import java.util.Arrays;

//InputStream + OutputStream + flush() 의 사용법 (메모리)
//InputStream 2개를 활성화 할 겨우 메모리 구조상 신규 인스턴스를 생성하지 않으면 Stream을 연속적으로 사용할 수 없다 
public class File10 {
	public static void main(String[] args) throws Exception {
		/*
		 * InputStream in = System.in; // 값을 적용 OutputStream os = System.out;// 값을 출력
		 * int a = in.read(); // 입력된 사항을 읽어들이는 역할 os.write(a); // 쓰기 os.flush();
		 * os.close(); in.close();
		 */
		data00 aa = new data00();
		aa.abc();

	}
}

class data00 {
	public void abc() {
		String data = "abcd";
		byte[] b = data.getBytes();
		System.out.println(Arrays.toString(b));
		OutputStream os = System.out;
		try {
			os.write(b, 0, b.length);
			os.flush();
			os.close();
		} catch (Exception e) {

		}
		
	}
}