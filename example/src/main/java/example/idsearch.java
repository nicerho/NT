package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class idsearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public idsearch() {
		super();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String name = request.getParameter("username").intern();
		String mail = request.getParameter("useremail").intern();
		String msg = "";
		// 아이다 칮기 기능을 완성해야 합니다. 배열 데이터값을 확인하여 이름과 이메일이 동일한 정보 일 경우 결과값을 출력하며, 만약 이름과 이메일
		// 정보 중 틀릴 경우 error라는 메세지를 콘솔에 출력하시오.
		String members[][] = { { "장진호", "배유미", "염무원", "김승균", "김경민", "장진호", "김경민" },
				{ "jang_ho@nate.com", "bae_mi@nate.com", "number1@gmail.com", "kim@nate.com", "min@nate.com",
						"ho@naver.com", "k_min@gmail.com" },
				{ "jang_ho", "bae_mi", "number1", "kim", "min", "ho", "k_min" } };
		int count = 0;
		for (int x = 0; x < members[0].length; x++) {
			if(members[0][x]==name && members[1][x]==mail) { // 이름과 이메일 검증 검증방법은 count변화로 체크
				count=1;
				msg=(members[2][x]);
			} 
		}
		if(count==0) { //주어진 조건문에서 아무 조건도 충족되지 않았을 경우..
			msg="error";
		}
		PrintWriter pw = response.getWriter();
		pw.write(msg);
	}
}
