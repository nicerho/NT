package io;

import java.nio.file.Files;
import java.nio.file.Paths;

//파일 복사 및 이동
public class File12 {
	public static void main(String[] args) {
		try {
			new data0().aaa();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class data0 {
	public void aaa() throws Exception {
		/*Files.createDirectories(Paths.get("E:\\project\\web\\src\\main\\webapp\\test")); createDirectories() : 해당 디렉토리를 생성하는 메서드, Paths : 경로
		Path data1 = Paths.get("E:\\project\\web\\src\\main\\webapp\\datalist.txt");
		Path data2 = Paths.get("E:\\project\\web\\src\\main\\webapp\\test\\datalist.txt");
		Files.copy(data1, data2); Files.copy(원본,사본) 원본의경로와 사본의 경로지정 후 복사할 수 있따.
		Path data3 = Paths.get("E:\\project\\web\\src\\main\\webapp\\test\\datalist.txt");
		Files.delete(data3); delete(경로) 경로 지정 후 파일삭제 가능
		빈 파일 생성
		Path data4 = Paths.get("E:\\project\\web\\src\\main\\webapp\\test\\datalist.txt");
		Files.createFile(data4); createFile(경로, )을 통해 빈 파일을 생성할 수 있다*/
		/*파일 생성 및 이동*/
//		Files.createDirectories(Paths.get("E:\\project\\web\\src\\main\\webapp\\test2"));
//		Files.createFile(Paths.get("E:\\project\\web\\src\\main\\webapp\\test\\datalist2.txt"));
//		 move(파일,이동할경로)
	}
}
