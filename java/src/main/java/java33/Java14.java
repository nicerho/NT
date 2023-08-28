package java33;

//랜덤 사용법
public class Java14 {
	public static void main(String[] args) {
		// Math.random() <- 기본 자료형을 double로 인식
		double no = Math.random() * 10;
		int no1 = (int) Math.ceil(Math.random() * 10); // ceil 1~10
		int no2 = (int) Math.floor(Math.random() * 10); // floor 0~9
		int no3 = (int) Math.round(Math.random() * 10); // round 1~10
//		System.out.println(no1);
//		System.out.println(no2);
//		System.out.println(no3);
		/* 사용자가 보안코드 5자리를 입력해야 합니다 */
		System.out.print((int) Math.floor(Math.random() * 10) + "" + (int) Math.floor(Math.random() * 10) + ""
				+ (int) Math.floor(Math.random() * 10) + "" + (int) Math.floor(Math.random() * 10) + ""
				+ (int) Math.floor(Math.random() * 10));
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print((int) Math.floor(Math.random() * 10));
		}
	}
}
