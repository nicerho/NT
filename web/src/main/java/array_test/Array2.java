package array_test;

//원시배열 + 조건문 + 반복문
public class Array2 {
	public static void main(String[] args) {
		Array2 a = new Array2();
		a.test();
	}

	public void test() {
		String id[] = { "hong", "kim", "park", "lee", "jang", "so" };
		/*
		 * 1. 해당 사용자 아이디 배열값 중 아이디가 3자리 이하의 사용자만 출력 한트 : int word = id[0].length;
		 */
		/*
		 * for(int x=0;x<6;x++) { if(id[x].length()<=3) { System.out.println(id[x]); } }
		 */
		int x = 0;
		do {
			if (id[x].length() <= 3) {
				System.out.println(id[x]);
			}
			x++;
		} while (x < id.length);
		/*
		 * 2. 데이터는 아래와 같다 15 60 11 14 27, 해당 데이터의 모든 합한 데이터를
		 */
		int asd[] = { 15, 60, 11, 14, 27 };
		int sum = 0;
		/*
		 * while(x<asd.length) { sum += asd[x]; x++; System.out.println(sum); } /* 3. 다음
		 * 숫자 데이터 리스트 중 짝수의 값만 모두 더한 최종 결과값 5 10 15 20 25 30 35
		 */
		int qq[] = { 5, 10, 15, 20, 25, 30, 35 };
		/*
		 * for(x=0;x<qq.length;x++) { if(qq[x]%2==0) { sum += qq[x]; } }
		 * System.out.println(sum);
		 */

	}
}
