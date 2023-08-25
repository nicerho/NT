package java33;

import java.util.Scanner;

/*
 * 외클 이름 내부 클래스 data2 조건문 써서 하세요
 * */
public class Java5 {
	public static void main(String[] args) {
		new data2().abc();
	}
}

class data2 {
	Scanner sc = new Scanner(System.in);

	public void abc() {
		String a = sc.nextLine().intern();
		String b = sc.nextLine().intern();
		
		if(a=="" || b=="") {
			System.out.println("wow");
			abc();
		} else if(Integer.parseInt(a)>Integer.parseInt(b)) {
			System.out.println(a);
			sc.close();
		} else if(Integer.parseInt(b)>Integer.parseInt(a)) {
			System.out.println(b);
			sc.close();
		}  else {
			System.out.println("error");
			sc.close();
		}
		

	}
}
