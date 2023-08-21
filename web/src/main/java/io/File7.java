package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

//Buffered 사용하기
public class File7 {
	public static void main(String[] args) {
		try {
			data5 d = new data5();
			d.abc();
		} catch (Exception e) {

		}
	}
}

class data5 {
	FileReader fr = null;

	public void abc() throws Exception {
		// Buffered,LineNumberReader : Temp(임시저장소=메모리) - 효율적으로 파일을 메모리에 등록 시킨 후 해당 메모리에
		// 등록된 값을 출력하는 형태
		this.fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\number.txt");
		LineNumberReader li = new LineNumberReader(this.fr);
		// System.out.println(li.readLine());
//		System.out.println((char)fr.read());
		BufferedReader bf = new BufferedReader(this.fr);
		// Buffered는 속도가 매우 빠른 대신 사용함에 있어서 변수로 받아서 처리 또는 배열로 만든 후 처리하는것을 권장한다
		// System.out.println(bf.readLine());
		// System.out.println(bf.readLine()); ****임시 저장된 내용을 사용할 시 휘발성으로 데이터는 자동 삭제 처리
		// 된다.. (한번 찍힌건 또 안찍힘) 조건문 등을 작성할 때 유의할 필요가 있다
		List<String> list = new ArrayList<>();
		String line = "";
		while ((line = bf.readLine()) != null) {
			// System.out.println(line);
			list.add(line);
		}
		bf.close();
		this.fr.close();
		System.out.println(list);
	}
}