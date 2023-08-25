package java33;

import java.util.Scanner;

/*
 * 더블루프
 * do while + for
 * */
public class Java6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		new data3().abc(x);
		sc.close();
	}
}

class data3 {

	public void abc(int x) {

		if (x <= 9 && x > 0) {
			for (int y = 1; y < 10; y++) {
				System.out.println(x * y);
			}
		} else {
			System.out.println("error");
			Java6.main(null);
		}

	}
}
