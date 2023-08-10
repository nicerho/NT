package array_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ArrayList 배열구조
public class Array8 {
	public static void main(String[] args) {
		Array8 a = new Array8();
		a.test();
	}

	public void test() {
		// ArrayList : 배열을 사용하는 클래스 의 한 종류
		// add : 데이터 추가 , get : 데이터 로드 , remove : 데이더 삭제 , size : 배열 크기
		String[] member = { "이순신", "홍길동", "유관순", "강감찬" };
		List<String> members = new ArrayList<>();
		members.add(member[0]);
		members.add(member[2]);
		members.add(member[3]);
		// System.out.println(members.get(0));
		members.set(0, "ㅋㅋ");
		// System.out.println(members.get(0));
		members.remove(0);
		// System.out.println(members);
		Integer no[] = { 3, 4, 2, 7, 5, 10 };
		// Arrays.asList : 원시배열값을 한번에 ArrayList배열로 이관
		List<Integer> ar = new ArrayList<>(Arrays.asList(no));
		int x = 0;
		int sum = 0;
		for (x = 0; x < ar.size(); x++) {
			sum += ar.get(x);
		}
		//System.out.println(sum);
		// 만약에 자료형이 int일 경우 ArrayList의 사용이 불가능한가 ?
		int no2[] = { 3, 4, 2, 7, 5, 10 };
		List<Integer> ar2 = new ArrayList<>();
		for (int f = 0; f < no2.length; f++) {
			ar2.add(no2[f]);
		}
		//System.out.println(ar2);
		// 10. 10,7,6,1,11,37,41,22 해당 데이터에서 짝수값을 모두 삭제 되도록 하여 배열을 출력합니다
		// 결과 [7,11,1,37,41] 단 ArrayList활용 
		List<Integer> ar3 = new ArrayList<>();
		int no3[] = {10,7,6,1,11,37,41,22};
		for(int f=0; f<no3.length;f++) {
			ar3.add(no3[f]);
		}
		//System.out.println(ar3);
		
		for(int xx=0;xx<ar3.size();xx++) {
			if(ar3.get(xx)%2==0) {
				ar3.remove(xx);
			}
		}
		/*
		 * List<Integer> ar4 = new ArrayList<>();
		 * for(Integer data : ar3){
		 * if(data %2 !=0){
		 * ar5.add(data);}
		 * }
		 * */
		System.out.println(ar3);
		
	}
}
