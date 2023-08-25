package java33;

import java.util.Scanner;

public class Java4 {
	Scanner sc = null;

	void test1(String a, int b, String c) {
		System.out.println("입력");
		sc = new Scanner(System.in);
		System.out.println("이름입력");
		String usernm = sc.nextLine().intern();
		System.out.println("pw");
		String userpw = sc.nextLine().intern();
		if (usernm == "홍길동") {
			if (userpw == "a1234") {
				System.out.println("good");
				sc.close();
			} else {
				test1("asdf", 3, "adsf");
			}
		} else {
			System.out.println("bad");
		}
	}

	void test2() {

	}
}
