<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><c:out value="${USER.name}"/>님 회원가입 성공</h1>
	<button type="button" onclick="window.location.href='mainPage.do'">행복버튼</button>
</body>
</html>