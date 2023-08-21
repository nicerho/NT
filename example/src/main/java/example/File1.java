package example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File1 {
	public static void main(String[] args) {
		try {
			new box_office().abc();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
 * 스캐너를 이용하여 다음과 같이 실행 되도록 하빈다 1. 개봉작 리스트 추렭, 2.프로그램 종료 1.
 */
class box_office {
	FileReader fr = null;

	public void abc() throws Exception {
		this.fr = new FileReader("E:\\project\\example\\src\\main\\webapp\\movie_db.txt");
		BufferedReader bf = new BufferedReader(this.fr);
		List<String> list = new ArrayList<>();
		String line = "";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("a");
			switch (sc.nextInt()) {
			
			case 1:
				while ((line = bf.readLine()) != null) {
					list.add(line);
				}
				for(int x=0;x<list.size();x++) {
					System.out.println(list.get(x));
				}
				continue;
			case 2:
				System.out.println("goodbye");
				sc.close();
				bf.close();
				fr.close();
				System.exit(0);
			default:
				System.out.println("똑바로");
			}

		}

	}
}
