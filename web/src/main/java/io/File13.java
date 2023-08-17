package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class File13 {
	public static void main(String[] args) {
		try {
			new data01().aaa();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class data01 {
	public void aaa() throws Exception {
		InputStream is = new FileInputStream("E:\\project\\web\\src\\main\\webapp\\shot.jpg");
		// System.out.println(is.available());
		byte[] file = new byte[is.available()];
		is.read(file);
		OutputStream os = new FileOutputStream("E:\\project\\web\\src\\main\\webapp\\shot2.jpg");
		os.write(file);
		is.close();
		os.flush();
		os.close();
	}
}