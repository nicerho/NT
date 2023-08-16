package io;

// 스캐너 사용해서 파일쓰기
import java.io.FileWriter;
import java.util.Scanner;

public class File5 {

	FileWriter fw = null;

	public static void main(String[] args) { // 메인메서드에서는 this를 사용할 수가 없다 static 사용시 new 인스턴스 호출시 새로 읽기 떄문에 코드를 인식하지 못하는
												// 상황이 발생
		try {
			Scanner sc = new Scanner(System.in);
			File5 f = new File5();
			int x;
			f.fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\user.txt", true);
			for (x = 0; x < 3; x++) {
				System.out.println("이름입력");
				String name = sc.nextLine().intern();
				if (name == "exit") {
					break;
				} else {
					f.fw.write(name + "\n");
				}

			}
			System.out.println("저장완료");
			sc.close();
			f.fw.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
	}
}
