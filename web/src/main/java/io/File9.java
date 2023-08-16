package io;

import java.io.OutputStream;
import java.util.Arrays;

/*
 * FileReader, FileWriter, CharArrayReader : 파일 읽기 쓰기(문서용) - 아스키
 * Buffered, LineNumberReader : 메모리의 영역
 * Stream : 문서, 이미지, 동영상, 오디오 - 바이너리 기본적으로 숫자이며 String을 받을 수 없다
 * BufferedStream 
 * InputStream, OutputStream : 기본적으로 Stream의 대분류로 생각하자,
 * FileInputStream, AudioInputStream, ObjectInputStream  :Stream의 소분류로 생각 . 
 * */
public class File9 {
	public static void main(String[] args) {
		try {
			/*
			 * InputStream is = System.in; // 키보드에서 정보 받음 int code = is.read(); // 해당 키를 입력시
			 * 아스키코드로 인식하여 int로 변환 System.out.println(code);
			 */
			String a = "ABCDE";
			byte b[] = a.getBytes(); // getBytes("언어패킷") - 문자를 byte단위(아스키코드)로 변환
			System.out.println(Arrays.toString(b));
			OutputStream os = System.out; //
			os.write(b, 0, b.length); //os.write(객체, 배열시작번호(무조건 0),배열 종료번호)
			os.flush();
			os.close();
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
