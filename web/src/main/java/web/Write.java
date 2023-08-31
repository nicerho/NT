package web;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024
		* 100)

public class Write extends HttpServlet {
	DbConfig dc = null;
	PreparedStatement ps = null;
	private static final long serialVersionUID = 1L;

	public Write() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String bsubject = request.getParameter("subject").intern();
		String bwriter = request.getParameter("writer").intern();
		String bpassword = request.getParameter("password").intern();
		Part bdir = request.getPart("file");
		// String bdir2 = bdir.getSubmittedFileName().intern();
		String btext = request.getParameter("texts").intern();
		// 첨부파일 저장공간
		String savePath = request.getServletContext().getRealPath("/board/upload/");
		// 첨부파일 용량
		int fileSize = (int) bdir.getSize();
		// 날짜 -> 파일업로드시 파일명에 날짜를 추가하여 중복을 피할 수 잇다
		Date time = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
		String timeText = sf.format(time);
		// 업로드시 사용하는 파일명
		String fileName = timeText + "_" + bdir.getSubmittedFileName();
		// 저장공간에 실제로 저장되는 이름
		String uploadFile = savePath + fileName;
		// Stream으로 첨부파일 처리
		InputStream is = bdir.getInputStream(); // Stream으로 변환
		FileOutputStream fs = new FileOutputStream(uploadFile);

		if (fileSize == 0) { // 첨부파일 없을때의 SQL

		} else { // 있을때 SQL
			byte[] buf = new byte[is.available()];
			int size = 0;
			while ((size = is.read(buf)) != -1) {
				fs.write(buf, 0, size);
				fs.flush();
			}
			fs.close();
			is.close();
		}
		//경로 지정 (DB에 저장되는 경로와 동일)
		String dbFile = "./upload/"+fileName;
		//View에 출력 view.jsp로 전달
		request.setAttribute("dbFile",dbFile);
		RequestDispatcher ds = request.getRequestDispatcher("./view.jsp");
		ds.forward(request, response);
	}

}
