<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    String shopping_id = "";
    String shopping_name = "";
    try{
   shopping_id = session.getAttribute("userid").toString();
   shopping_name = session.getAttribute("username").toString();
    }
    catch(NullPointerException e){
    	
    }
    finally{
    	//out.print("<script>alert('올바른 접근이 아님');location.href='./login.jsp'</script>");
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지(Session Check)</title>
</head>
<script>
function logout(){
	location.href="./logout.jsp"
}
</script>
<body>
아이디 : <%=shopping_id %><br> 
고객명 : <%=shopping_name %><br>
<input type="button" value="로그아웃" onclick="logout()">
</body>
</html>