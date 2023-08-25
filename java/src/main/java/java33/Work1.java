package java33;

import java.util.Scanner;

/*
 * 숙제1
 * 개인정보 수집 및 이용 동의(Y/N)
 * 이메일 수집 및 이용 동의(Y/N)
 * 통합서비스 약관  이용 동의(Y/N)
 * 해당 동의를 모두 Y 하엿을 경우 good 출력 dk아니면 다시
 * */
public class Work1 {
	public static void main(String[] args) {
		new hw().abc();
	}
}

class hw {
	public void abc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("개인정보 수집 및 이용 동의(Y/N)");
		String a = sc.next();
		System.out.println("이메일 수집 및 이용 동의(Y/N)");
		String b = sc.next();
		System.out.println("통합서비스 약관  이용 동의(Y/N)");
		String c = sc.next();
		if (a.equals("Y") && b.equals("Y") && c.equals("Y")) {
			System.out.println("good");
			sc.close();
		} else {
			System.out.println("다시");
			abc();
		}

	}
}
