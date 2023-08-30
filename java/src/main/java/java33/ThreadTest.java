package java33;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
[숙제1]
구구단 7단 중 해당 결과값을 Thread를 이용하여 출력 되도록 합니다.

[숙제2]
상품금액 : 2000,3000,1500,2300,3200,1100,3300,4200,6100,4300
상품 수량 : 2,1,1,2,3,2,1,1,2,3

상품금액과 상품수량을 곱하여 각 상품별 최종금액을 출력하시오.
해당 사용형태는 Thread를 이용하여 출력되도록합니다.
*/
public class ThreadTest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		numbers.parallelStream().map(e -> e * 7).forEach(e -> System.out.print(e + " "));
		System.out.println();
		List<Integer> price = Arrays.asList(2000, 3000, 1500, 2300, 3200, 1100, 3300, 4200, 6100, 4300);
		List<Integer> quantity = Arrays.asList(2, 1, 1, 2, 3, 2, 1, 1, 2, 3);
		IntStream.range(0, price.size()).parallel().map(e -> price.get(e) * quantity.get(e))
				.forEach(e -> System.out.print(e + " "));
		
	}
}