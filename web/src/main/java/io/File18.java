package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 * 숙제 
 * Scanner를 이용하여 총 10개의 숫자를 입력합니다.
 * 단, 1~100까지의 숫자만 입력이 가능하며 100 이상의 숫자를 입력할 경우 
 * 콘솔에 "100까지의 숫자만 입력가능합니다" 라고 메세지가 출력되어야 하며
 * 무조건 10개의 숫자를 받아야 하며, 해당 숫자는 모두 data_num.txt 파일로 저장되어야 합니다.
 * */
public class File18 {
	public static void main(String[] args) {
		try {
			new hw().abc();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class hw {
	public void abc() throws IOException {
		Scanner sc = new Scanner(System.in);
		Path data1 = Paths.get("E:\\project\\web\\src\\main\\webapp\\data_num.txt");
		//Files.createFile(data1);
		FileWriter fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\data_num.txt", true);
		int number = sc.nextInt();
		int x = 0;
		int y = 1;
		while (x < 10) {
			System.out.println(y+"번재 숫자 입력");
			if (number > 100) {
				System.out.println("100초과");
				continue;
			} else if (number < -1) {
				System.out.println("0이상만");
				continue;
			} else {
				fw.write(number);
			}
			x++;
			y++;
		}
		fw.close();
		sc.close();

	}
}
