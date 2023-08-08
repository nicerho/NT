package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public cal() {
		super();

	}

//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String a = request.getParameter("data1");
		String b = request.getParameter("data2");
		Index i = new Index();
		//문자값을 문자메소드로 전달 - > 최종값을 문자로 받는다
		//String result = i.test(a, b);
		String result = i.test2(Integer.parseInt(a),Integer.parseInt(b));
		
	}

}
