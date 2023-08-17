package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

//BufferedInputStream, BufferedOutputStream
public class File15 {
	public static void main(String[] args) {
		try {
			new test1().aaa();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class test1 {
	public void aaa() throws Exception {
		String file = "E:\\project\\web\\src\\main\\webapp\\shot.jpg";
		// InputStream is = new FileInputStream(file);
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		byte filesize[] = new byte[bi.available()];
		int total = bi.read(filesize);
		if (total > 100000) {
			System.out.println("과적");
		} else {
			System.out.println("chekced");
			OutputStream os = new FileOutputStream("E:\\project\\web\\src\\main\\webapp\\shot2.jpg");
			os.write(filesize);
			os.flush();
			os.close();
		}
		bi.close();

	}
}
