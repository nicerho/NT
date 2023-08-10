package array_test;

//2차 배열 
public class 배열6 {
	public static void main(String[] args) {
		배열6 a = new 배열6();
		a.test();
	}

// 7. 다음 코드를 활용하여 결과값을 예시처럼 출력되게 하시오 박초롱 31 , 윤보미 29 ~
	public void test() {
		String member[][] = { { "박초롱", "윤보미", "정은지", "김남주", "오하영" }, { "10", "11", "12", "13", "14" } };
		int f, ff;
		int data_ea = member[0].length;
		int ea = member.length;
		/*
		 * for (f = 0; f < ea; f++) { for (ff = 0; f < data_ea; ff++) {
		 * System.out.println(member[ff][f]); } }
		 */
		// 8. 해당 데이터 배열에 있는 모든 값 중 짝수값만 모두 더하여 결과값을 출력하는 코드 작성
		// 1번 데이터 : 11 42 22 16
//2번 데이터 : 7 33 10 29
		int numbers[][] = { { 11, 42, 22, 16 }, { 7, 33, 10, 29 } };
		int x = numbers.length;
		int y = numbers[0].length;
		int sum = 0;
		/*for (f = 0; f < y; f++) {
			for (ff = 0; ff < x; ff++) {
				if (numbers[ff][f] % 2 == 0) {
					sum += numbers[ff][f];
				}
			}
		}*/
		for(int a[]:numbers) { //2차 배열을 1차배열로 따로따로 구성
			for(int b:a) {//위에서 구성된 1차배열에 있는 데이터를 분리
				if(b%2==0) { // 짝수일 경우
					sum+=b;
				}
			}
		}
		System.out.println(sum);
	}
}
