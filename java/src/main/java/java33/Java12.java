package java33;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * override 활용
응문1
"학생명을 입력하시오"
"검색할 과목명을 입력하세요(국어,수학,과학,역사):"
데이터는 데이터 별도의 클래스를 이용 해당 클래스 안에 배열 데이터가 있으며, 해당 데이터를 상속 받아 다음과 같이 결과 출력되록..


데이터
{홍길동,이순신,유관순}
{80,78,92,40}
{40,80,80,100}
{55,40,50,90}

결과 
홍길동
과학 88
 * */
public class Java12 {
	public static void main(String[] args) {
		new datause().abc();

	}
}

class data {
	String namelist[] = { "홍길동", "이순신", "유관순" };
	String datalist[][] = { { "80", "78", "92", "40" }, { "40", "80", "80", "100" }, { "55", "40", "50", "90" } };
}

class datause extends data {
	public void abc() {

		Scanner sc = new Scanner(System.in);
		System.out.println("학생명");
		String q1 = sc.nextLine();

		int x = 0;
		for (String n : namelist) {
			if (n.equals(q1)) {
				x = x;
				break;
			} else {
				x++;
			}

		}
		System.out.println("과목명");
		String q2 = sc.nextLine();
		switch (q2) {
		case "국어":
			System.out.println(namelist[x] + " " + "국어 : " + datalist[x][0]);
			break;

		case "수학":
			System.out.println(namelist[x] + " " + "수학 : " + datalist[x][1]);
			break;
		case "과학":
			System.out.println(namelist[x] + " " + "과학 : " + datalist[x][2]);
			break;
		case "역사":
			System.out.println(namelist[x] + " " + "역사 : " + datalist[x][3]);
			break;
		default:
			System.out.println("오류");
			break;
		}
		sc.close();
		
	}
}
