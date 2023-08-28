package java33;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * 데이터
 * {55,1,6,8,10,22,96,33,31,45,48,60}
 * "해당 데이터 1. 짝수 2. 홀수 선택하세요
 * */
public class Work6 {
	public static void main(String[] args) {
		new hwdatause().abc();
	}
}
class hwdata {
	List<Integer> list = Arrays.asList(55, 1, 6, 8, 10, 22, 96, 33, 31, 45, 48, 60);
}
class hwdatause extends hwdata {
	Scanner sc = new Scanner(System.in);

	public void abc() {
		System.out.println("짝 홀?");
		String oddeven = sc.nextLine();
		switch (oddeven) {
		case "짝":
			System.out.println(list.stream().filter(e -> e % 2 == 0).sorted(/* Comparator.reverseOrder() */)
					.collect(Collectors.toList()));
			sc.close();
			break;
		case "홀":
			System.out.println(list.stream().filter(e -> e % 2 == 1).sorted().collect(Collectors.toList()));
			sc.close();
			break;
		default:
			System.out.println("다시");
			Work6.main(null);
		}
	}
}