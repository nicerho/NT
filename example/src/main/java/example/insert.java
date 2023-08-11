package example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public insert() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// name값이 1개 이상 동일한 사항일 경우 getParameterValues로 값을 받는다.
		String user[] = request.getParameterValues("user");
		List<String> users = new ArrayList<>();
		for (int x = 0; x < user.length; x++) {
			if (user[x] != "") {
				users.add(user[x]);
			}
		}
		System.out.println(users);
	}

}
