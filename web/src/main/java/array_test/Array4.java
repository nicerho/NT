package array_test;

import java.util.Arrays;

//1차배열 중 필요한 데이터만 추출하여 신규 배열로 커스텀
public class Array4 {
	public static void main(String[] args) {
		Array4 a = new Array4();
		a.test2();
	}

	public void test2() {
		int a[] = new int[2]; // 빈 배열값
		int b[] = { 1, 2, 3, 4, 5, 6, 7 };// 실제 데이터가 있는 배열
		int w = 0;
		int array = 0; // 배열 번호를 지정하기 위한 변수
		while (w < b.length && array < a.length) {
			if (b[w] % 2 == 0) {
				a[array] = b[w];
				array++; // 빈 배열의 번호 증가
			}
			w++;
		}
		System.out.println(Arrays.toString(a));
		// 6. 다음 데이터 값 중 아이디가 4글자 이상인 아이디만 추출하여 새로운 데이터 배열로 출력하시오
		// hong,kim,park,jang,sun,so,han,jung
		String first[] = { "hong", "kim", "park", "jang", "sun", "so", "han", "jung" };
		String second[] = new String[7]; //빈 배열 생성
		int x = 0;
		int y = 0;
		/*
		 * for(String m : first){
		 * if(m.length()>=4){
		 * second[x] = m;
		 * x ++
		 * }
		 * System.out.println(Arrays.toString(second));
		 * */
		while (x < first.length) {
			if (4 <= first[x].length()) { 
				second[y] = first[x];
				y++;
			}
			x++;
		}
		System.out.println(Arrays.toString(second));
	}
}
