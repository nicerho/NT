package example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WebLogin() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter prw = response.getWriter();
		// 아래 두개의 배열을 이용하여 다음과 같은 결과값으로 출력되도록 하시오 ex : hong
		String id = request.getParameter("userid").intern();
		String pw = request.getParameter("userpw").intern();
		String list[] = { "hong", "kim", "park", "apink" };
		String password[] = { "a1234", "b1234", "c1234", "d1234" };
		String msg = "";
		int count = 0; // 아이디 유 무
		for (int x = 0; x < list.length; x++) {
			if (id == list[x]) {
				count = 1;
				if (pw == password[x]) {
					msg = "<script>alert('로구인 성공~')</script>";
					break;
				} else if (pw != password[x]) {
					msg = "<script>alert('ID 또는 비밀번호를 체크');history.go(-1)</script>";
					break;
				}
			}
		}
		if (count == 0) { // 반복문 종료시 해당 변수값이 변함이 없을 경우
			msg = "<script>alert('가입되지 않은 사용자'); history.go(-1)</script>"; // history.go(-n) : n번째 전 페이지로 이동
		}
		prw.write(msg);
		// prw.write();
		// RequestDispatcher rd = request.getRequestDispatcher("./WebLogin.jsp");
		// rd.forward(request, response);
	}
}
