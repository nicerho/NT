package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*
 * user_tel.txt파일을 로드 후 해당 사용자에 맞게 전화번호가 등록되도록 배열화 하여 콘솔로 출력되도록한다
 * cms_db.txt로 저장되게 하라
 * 결과예시 : 홍길동(010~)
 * */
public class File3 {
	public static void main(String[] args) {
		try {
			new test().abc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class test {
	public void abc() throws Exception {
		FileReader fr = new FileReader("E:\\project\\example\\src\\main\\webapp\\user_tel.txt");
		BufferedReader bf = new BufferedReader(fr);
		Path dir1 = Paths.get("E:\\project\\example\\src\\main\\webapp\\cms_db.txt");
		Files.createFile(dir1);
		FileWriter fw = new FileWriter("E:\\project\\example\\src\\main\\webapp\\cms_db.txt", true);
		List<String> list = new ArrayList<>();
		String line = "";
		while ((line = bf.readLine()) != null) {
			list.add(line);
		}
		for (int x = 0; x < list.size(); x++) {
			list.get(x).split("[|]");
			System.out.println(list.get(x).replace("|", "(") + ")");
			fw.write(list.get(x).replace("|", "(") + ")"+"\n");
		}
		fw.flush();
		fw.close();
		bf.close();
		fr.close();
	}
}
