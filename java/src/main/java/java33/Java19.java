package java33;

import java.util.Arrays;
import java.util.List;

/*
 * Thread 이용하여 결과값 출력
 * 데이터가 다음과 같이 잇다
 * 10 5 19 22 13 6 4 
 * 해당 Thread에 데이터를 하나씩 대입합니다
 * 단, 결과값은 형태는 다음과 같다
 * 
 * */
public class Java19 {
	public static void main(String[] args) {
		int list[] = { 10, 5, 19, 22, 13, 6, 4 };
		int xx = 0;
		test t = null;

		while (xx < list.length) {
			t = new test(list[xx]); //각각의 배열값을 순서대로 메서드에 전달
			t.start();
			xx++;
		}
		

	}
}

class test extends Thread {
	private int w = 1;
	private int total = 0;

	public void run() {
		System.out.println(this.total);
	}

	public test(int x) {
		while (this.w <= x) {
			this.total+=this.w;
			this.w++;
		}
	}
}
