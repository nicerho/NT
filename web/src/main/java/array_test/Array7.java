package array_test;

import java.util.Arrays;

//2차 배열을 1차배열로 합산
public class Array7 {
	public static void main(String[] args) {
		new Array7().test();
	}

	public void test() {
		int a[][] = { { 1, 3, 5, 7 }, { 2, 4, 6, 8 } };
		int x = a.length * a[0].length; // 해당 배열의 전체 갯수를 파악하기 위해..
		int b[] = new int[x]; // 2차 배열을 1차배열로 병합..
		int z = 0; // 배열 배정번호
		for (int c[] : a) {
			for (int d : c) {
				b[z] = d;
				z++;
			}
		}
		Arrays.sort(b);
		// System.out.println(Arrays.toString(b));
		// 9. 각 국가별 행복지수 관련 데이터 입니다. 해당 데이터를 1차 배열로 가공하여 출력합니다.
		// 1번 데이터 : 대한민국, 일본, 중국, 베트남, 태국
		// 2번 데이터 : 40,35,70,55,57
		// 결과 : ["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(57)"
		Object data[][] = { { "대한민국", "일본", "중국", "베트남", "태국" }, { 40, 35, 70, 55, 57 } };
		Object aa[] = new Object[data[0].length];
		int ww = 0;
		do {
			aa[ww] = data[0][ww] + "(" + data[1][ww]+")";
			ww++;
		} while (ww < data[0].length);
		System.out.println(Arrays.toString(aa));
	}
}
