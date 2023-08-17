package web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, // 업로드한 파일의 크기를 측정한다 단, 첨부파일의 크기보다 클 경우 temp디렉토리에 저장된다.
		maxFileSize = 1024 * 1024 * 10, // 업로드 가능한 최대 크기, 첨부파일 갯수를 모두 합한 용량을 뜻한다 -1의 경우 무한대를 뜻한다
		maxRequestSize = 1024 * 1024 * 100 // 전체 multiPart의 크기를 뜻한다.
)
public class File extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public File() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String url = request.getServletContext().getRealPath("/upload/"); // getServletContext().getRealPath() : 웹서버의
																			// 프로젝트 경로를
		// 뜻한다
		// System.out.println(url);
		// E:\project\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\web\
		Part file1 = request.getPart("imgfile");
		// Part : 인터페이스로 파일을 받아서 처리함
		String filename = file1.getSubmittedFileName();// getSubmittedFileName() : 파일명을 출력할때 사용한다
		long filesize = file1.getSize(); // .getSize() 파일의 크기를 출력할 때 사용
		String filetype = file1.getContentType(); // getContentType() : 파일의 타입 알아보기

		file1.write(url + filename);
		PrintWriter pw = response.getWriter();
		pw.write("<script>alert('업로드성공')</script>");
		pw.close();
		InputStream is = new FileInputStream(url + filename);
		System.out.println(is.available());
	}

}
