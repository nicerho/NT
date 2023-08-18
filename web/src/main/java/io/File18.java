package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
			e.printStackTrace();
		}
	}
}

class hw {
	public void abc() throws IOException {
		Path data1 = Paths.get("E:\\project\\web\\src\\main\\webapp\\data_num.txt");
		Files.createFile(data1);
		FileWriter fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\data_num.txt", true);
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int x = 0;
		while (x < 10) {
			if (number > 100 || number < 0) {
				System.out.println("0~100 사이 숫자만 입력");
				number = sc.nextInt();
			} else {
				fw.write(number);
				number = sc.nextInt();
				x++;
			}
			if (x == 10) {
				System.out.println("끝");
				break;
			}
		}
		sc.close();
		fw.close();
	}
}
