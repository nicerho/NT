<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String url = String.valueOf(request.getAttribute("dbFile"));
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>게시물 확인</title>
</head>
<body>
<a href="<%=url%>">[첨부파일]</a>
</body>
</html>