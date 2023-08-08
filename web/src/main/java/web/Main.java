package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//controller 파트
public class Main extends HttpServlet {
	// 웹 통신에 사용하기 위한 암호화된 페에지 명시한 메모리 형태의 명령어
	private static final long serialVersionUID = 1L;

	public Main() {
		super();
	}

	// doGet은 html에서 get을 받는다
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String a = request.getParameter("data");
		System.out.println(a);
	}
	// doPost은 html에서 Post를 받는다
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		doGet(request, response);
//	}

}
