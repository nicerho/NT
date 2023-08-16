package io;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * FileReader + Buffered 응용 (datalist.txt)
 * 응용문제2 
 * datalist.txt에는 숫자가 잇음. 해당 파일을 읽어 들여 해당 숫자 중 짝수 값만 모두 추렭
 * */
public class File8 {
// 	

	public static void main(String[] args) {
		try {
			new hoho().ggg();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class hoho {

	public void ggg() throws Exception {
		FileReader fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\datalist.txt");
		BufferedReader bf = new BufferedReader(fr);
		String line = "";
		while ((line = bf.readLine()) != null) {
			if (Integer.parseInt(line) % 2 == 0) {
				System.out.print(line + " ");
			}
		}

		fr.close();
		bf.close();
	}
}
