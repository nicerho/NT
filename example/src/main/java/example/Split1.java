package example;

import java.util.Arrays;

public class Split1 {
	public static void main(String[] args) {
		String a = "어벤져스-아하카파타라|1위|2500";
		String aa[] = a.split("[|]"); // |는 나눌 때 바로 쓰면 연산기호로 추정되기 때문에 |를 기준으로 나눌때는 []를 붙여주도록 한다 | 이외에도 여려 연산기호 적용
		System.out.println(Arrays.toString(aa));
		System.out.println(aa);
	}
}
