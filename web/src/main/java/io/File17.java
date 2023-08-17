package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//flush, close 차이
public class File17 {
	public static void main(String[] args) {
		try {
			new test3().aaa();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class test3 {
	public void aaa() throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String st = null;
		int n = Integer.parseInt(bf.readLine());
		int w = 0;
		while (w < n) {
			st = new String(bf.readLine());
			int a = Integer.parseInt(st);
			int b = Integer.parseInt(st);
			int sum = a + b;
			bw.write(sum + "\n");
			bw.flush(); //Buffered를 사용할 때만 flush를 이용합니다.
			w++;
		}
		bw.close();
		bf.close();
	}
}
