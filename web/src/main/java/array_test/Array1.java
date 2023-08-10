package array_test;

import java.util.Arrays;

//원시배열 형태
public class Array1 {
	public static void main(String[] args) {
		// 배열의 형태는 보통 String,int,Object,byte 형태로 구분한다..
		// Arrays.toString 은 모든 원시 배열의 리스트를 표시해준다 라이브러리를 구분하여 import하자
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		int ea = a.length;
		// System.out.println(ea);

		for (int f = 0; f < ea; f++) {
			System.out.print(a[f] + " ");
		}
		System.out.println();
		String[] b = new String[3];
		b[0] = "asd";
		b[2] = "ccc";
		int ae = b.length;
		System.out.println(ae);
		System.out.println(Arrays.toString(b));

		Object c[] = new Object[3];
		c[0] = 0;
		c[1] = "sf";
		int aa = c.length;
		System.out.println(aa);
		System.out.println(Arrays.toString(c));
		
		int[] d = {1,2,3,4,5};
		int ea2 = d.length;
		System.out.println(ea2);
		System.out.println(Arrays.toString(d));
	}
}


