package io;

import java.io.FileWriter;

//파일쓰기(write)
public class File4 {
	public static void main(String[] args) {
		data3 a = new data3();
		try {
			a.abc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error");
		}
	}
}

class data3 {
	FileWriter fw = null; // FileWriter : 문자 데이터를 파일에 쓰는 클래스

	public void abc() throws Exception {
		String user[] = { "홍길동3", "유관순3", "이순신2", "ㅁㄴㄹㅇㄴㅇㄹ" };
		this.fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\data.txt", true); //true는 기존 데이터를 삭제하지 않고 새 데이터를 얹는다
		for (String name : user) {
			this.fw.write(name); // write() : 해당 파일에 데이터를 쓰는 용도
		}
		this.fw.close();
	}
}
