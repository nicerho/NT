package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/*
 * InputStreamReader, OutputStreamReader, BufferedStreamReader, BufferedStreamWriter
 * InputStream -> InputStreamReader -> BufferedReader : 바이너리코드 -> 아스키코드로의 변환과정을 거치기 위한 절차라구 생각하자..
 * InputStream -> BufferedInputStream(o)
 * FileInputStream -> BufferReader(x)
 * */
public class File16 {
	public static void main(String[] args) {
		try {
			new test2().aaa();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class test2 {
	// InputStreamReader : Stream -> Reader로 변환
	public void aaa() throws Exception {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream("E:\\project\\web\\src\\main\\webapp\\number.txt")));
		String data;
		while ((data = br.readLine()) != null) {
			System.out.println(data);
		}
		br.close();
	}
}
