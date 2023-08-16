package io;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 *	I/O : inputStream, outputStream
 *입력 스트림 : 프로그램으로 들어오는 데이터(키보드, 마우스, SSD, HDD)
 *출력 스트림 : 프로그램에 해당 데이터를 출력하는 형태(모니터, 프린터, 데이터값)
 *Stream : input, output만 있고 사용자가 처리하는 데이터를 의미
 *라이브러리는 java.io를 쓴다
 *Stream File,FileReader (일반적)-> FileinputStream
 *FileWriter -> FileOutputStream
 *
 *예외처리
 *1. 메서드의 throws Exception을 사용시 해당 메소드를 외부에서 호출할 경우 try,catch를 사용해야한다
 *2. 해당 메서드에서 try,catch 사용하는 경우 호출받은 메서드에서 throws를 사용했을때, 또는 해당 메서드는 throws를 사용치 않고 메서드 자체의 오류가 발생시 호출하는 메서드에서 예외처리하는 상황 
 *3. 예외처리를 하지 않을 경우 해당 프로세서는 종료하지 못하고 정지하는 형태가 발생함
 * */

public class File1 {
	static abc a = new abc();

	public static void main(String[] args) {
		try {
			a.aaa();
			String nm = "1";
			Integer number = Integer.parseInt(nm);
		} catch (FileNotFoundException fe) {
			System.out.println("해당 파일을 찾을 수가 없다");
		} 
		catch(NumberFormatException fe) {
			System.out.println("숫자변환 실패");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			// System.out.println(e.getMessage);
			e.printStackTrace();

		}
		finally {
			System.out.println("전부 성공");
		}
	}

}

class abc {
	/*
	 * \\ : 로컬에 있는 파일을 사용 ./: 서버에 있는 파일을 사용
	 */
	public void aaa() throws Exception {
		FileReader fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\data.txt");
		System.out.println(fr.read()); //read()는 데이터 크기를 읽어들이는 메서드, -1은 파일에 아무것도 없는 상태를 의미한다
	}
}