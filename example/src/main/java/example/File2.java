package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
 * 응문2 
 * buffer.txt의 파일을 읽은 후 
 * 배열로 내용을 저장 후 짝수 배열만 출력ㅎ는
 * */
public class File2 {
public static void main(String[] args) {
	try {
		new board().a();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
class board{
	FileReader fr = null;
	public void a() throws Exception{
		this.fr = new FileReader("E:\\project\\example\\src\\main\\webapp\\buffer.txt");
		BufferedReader bf = new BufferedReader(this.fr);
		List<String> list = new ArrayList<>();
		String line = "";
		while ((line = bf.readLine()) != null) {
			list.add(line);
		}
		for(int x=0;x<list.size();x++) {
			if(x%2!=0) {
				System.out.println(list.get(x));
			}
		}
		fr.close();
		bf.close();
	}
}
