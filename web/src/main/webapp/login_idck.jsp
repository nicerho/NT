<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
/*response.addHeader : CORS(도메인 다른 경우 또는 외부서버에서 접속을 할 때 보안상 접속을 자동차단) - 접속허가를 해주는 클래스*/
response.addHeader("Access-Control-Allow-Origin", "*");
response.addHeader("Access-Control-Allow-Credentials", "true");
String userid = request.getParameter("mid").intern();
String msg = "";
if (userid == "admin") {
	msg = "no";
} else if (userid == "") {
	msg = "error";
} else {
	msg = "yes";
}
out.print(msg);
%>