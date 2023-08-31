package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login/userok.do")
public class UserOk extends HttpServlet {
	PrintWriter pww = null;
	RequestDispatcher rd = null;
	HttpSession session = null;
	private static final long serialVersionUID = 1L;
    public UserOk() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("uid").intern();
		String pw = request.getParameter("upw").intern();
		pww = response.getWriter();
		if(id==""&&pw=="") {
			pww.write("<script>alert('error');"+"history.go(-1);"+"</script>");
		} else {
			if(id=="hong"&&pw=="1234") {
				session = request.getSession();
				session.setAttribute("userid",id);
				session.setAttribute("username","홍길동");
				pww.write("<script>alert('로그인 OK');location.href='./main.jsp';</script>");
			} else {
				pww.write("<script>alert('회원정보 확인 불가');history.go(-1);</script>");
			}
			pww.close();
		}
		
	}

}
