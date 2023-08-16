package io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 응용문제1
 * Scanner를 이용하여 사용자가 입력한 숫자를 모두 저장 되도록 합니다. 단, 한줄에 하나의 숫자를 입력 되도록 하며, quit 라는 명령어를 입력할 경우 프로세서를 작동되지 않도록 합니다.
 * 저장 파일명은 number.txt
 * */
public class File6 {

	public static void main(String[] args) {
		try {
			new nnnb().aaa();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class nnnb {
	FileWriter fw = null;
	Scanner sc = null;

	public void aaa() throws Exception {

		try {
			fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\number.txt", true);
			sc = new Scanner(System.in);
			while (true) {
				System.out.println("입력");
				String number = sc.nextLine().intern();
				if (number == "quit") {
					break;
				} else {
					fw.write(number + "\n");
				}
			}
			System.out.println("완료");
			sc.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}