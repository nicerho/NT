package example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PassLoss extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PassLoss() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int count = 0;
		String name = request.getParameter("username").intern();
		String mail = request.getParameter("useremail").intern();
		String id = request.getParameter("userid").intern();
		String members[][] = { { "장진호", "배유미", "염무원", "김승균", "김경민", "장진호", "김경민" },
				{ "jang_ho@nate.com", "bae_mi@nate.com", "number1@gmail.com", "kim@nate.com", "min@nate.com",
						"ho@naver.com", "k_min@gmail.com" },
				{ "jang_ho", "bae_mi", "number1", "kim", "min", "ho", "k_min" } };
		for (int x = 0; x < members[0].length; x++) {
			if (members[0][x] == name && members[1][x] == mail && members[2][x] == id) {
				count = 1;
			}
		}
		if (count == 1) {
			System.out.println("임시 비번은 a123456");
		} else {
			System.out.println("해당 정보 확인 불가");
		}

	}

}
