package array_test;

import java.util.Arrays;
import java.util.Collections;

// sort(정렬)
public class Array5 {
	public static void main(String[] args) {
		new Array5().test();
	}

	public void test() {
		//sort : 오름차순, 내림차순으로 정렬할때 사용 단, int사용시 Collection.reverseOrder가 작동하지 않음.. 이 때는 int를 Integer로 바꾸면 된다.. int 빼고는 다른 자료형에서는 별 이슈없는ㄷㅅ
		int numbers[] = { 10, 1, 6, 9, 20, 11 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		Integer numbers2[] = { 10, 1, 6, 9, 20, 11 };
		Arrays.sort(numbers2, Collections.reverseOrder());
		System.out.println(Arrays.toString(numbers2));
		String asd[] = {"z","a","c","h","f"};
		Arrays.sort(asd);
		System.out.println(Arrays.toString(asd));
		Arrays.sort(asd, Collections.reverseOrder());
		System.out.println(Arrays.toString(asd));
	}
}
