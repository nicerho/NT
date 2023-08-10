package array_test;

//forEach
public class Array3 {
	public static void main(String[] args) {
		new Array3().test();
	}

	public void test() {
		/*
		 * forEach는 배열값을 이용하여 범위할당 한 만큼만 반복적으로 사용하는 문법 주의사항으로는 배열 자료형과 forEach에 사용하는 자료형을 일치시켜야한다.
		 */
		String users[] = { "홍길동", "김유신", "장보고", "유관순" };
		for (String user : users) {
			System.out.println(user);
		}
		// 4. forEach를 이용하여 다음 배열 데이터(5,10,15,20,25,30,35)의 값을 모두 곱한 결과를 구하시오
		
		
		int numbers[] = {5,10,15,20,25,30,35};
		int times=1;
		for (int number:numbers) {
			times *= number;
		
		}
		System.out.println(times);
		
		// 5. 다음 리스트 숫자 중 짝수,홀수 각각의 갯수를 출력하시오(3,6,9,12,15,18,21,24,27)
		int nums[] = {3,6,9,12,15,18,21,24,27};
		int odd=0;
		int even=0;
		for(int num:nums) {
			if(num%2==0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("홀수는 : "+odd+"개");
		System.out.println("짝수는 : "+even+"개");
		
	}
	
	
	
}
