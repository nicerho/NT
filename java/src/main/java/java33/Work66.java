package java33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 추상클래스 + 중첩클래스를 이용하여 프로세서 제작
 * 추상클래스명 father 
 * 메소드명 f_mothod 파라미터는 문자열 타입을 하나 받는거로
 * 문자열 타입의 u_name 
 * 메인에서 스캐너를 이용하여 사용자 이름을 입력하는 프로세서를 구성합니다
 * 구성 후 외부 클래스로 f_method로 값을 전달합니다
 * 전달된 값을 자식 클래스에 전달하며, 해당 메소드에 다음과 같이 처리합니다.
 * ex) 홍길동,이순신,유관순은 일반회원입니다
 * 	   강감찬 장보고는 실버회원 입니다.
 *     그 외에 사용자 이름 입력시 "해당 사용자는 비회원 입니다 라고 출력"
 * */
public class Work66 {
	public static void main(String[] args) {
		c1.c2 cc = new c1.c2();
		Scanner sc = new Scanner(System.in);
		cc.setUname(sc.nextLine());
		cc.f_method(cc.getUname());
	}
}

abstract class father {
	private String uname = "";

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public abstract void f_method(String x);
}

class c1 extends father {
	public void f_method(String x) {
	}

	static class c2 extends c1 {
		@Override
		public void f_method(String x) {
			
			List<String> silver = new ArrayList<>(Arrays.asList("강감찬", "장보고"));
			List<String> normal = new ArrayList<>(Arrays.asList("이순신", "유관순", "홍길동"));
			if (normal.contains(x)) {
				System.out.println(x + "는 일반회원");

			} else if (silver.contains(x)) {
				System.out.println(x + "는 실버회원");
			} else {
				System.out.println("비회원");
			}
		}
	}
}