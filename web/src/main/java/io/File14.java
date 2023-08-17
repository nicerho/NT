package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * I/O 응용문제 
 * 해당 데이터를 파일로 저장 후 출력하는 프로세서를 제작하시오
 * "hong","kim","park","lee","25","30","44","26","홍길동","김유신","박찬호","이순신"
 * 	파일 저장 형태는 다음과 같다.
 * 홍길동 : hong(25)
 * 김유신 : kim(30)
 * 박찬호 : park(44)
 * 이순신 : lee(26)
 * 파일명은 member_list.txt
 * */
public class File14 {
	public static void main(String[] args) {
		try {
			new test().aaa();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class test {
	public void aaa() throws Exception {

		Path data1 = Paths.get("E:\\project\\web\\src\\main\\webapp\\member_list.txt");
		Files.createFile(data1);
		String members[][] = { { "홍길동", "김유신", "박찬호", "이순신" }, { "hong", "kim", "park", "lee" },
				{ "25", "30", "44", "26" }, };
		String line = null;
		FileWriter fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\member_list.txt", true);
		FileReader fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\member_list.txt");
		BufferedReader bf = new BufferedReader(fr);
		for (int x = 0; x <members[0].length; x++) {
			fw.write(members[0][x] + ":" + members[1][x] + "(" + members[2][x] + ")" + "\n");
		}

		fw.close();
		while ((line = bf.readLine()) != null) {
			System.out.print(line + "\n");
		}
		bf.close();
		fr.close();

	}
}
