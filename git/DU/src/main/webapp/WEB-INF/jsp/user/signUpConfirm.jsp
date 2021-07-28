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
<header>
		<jsp:include page="/WEB-INF/jsp/layout/header.jsp"></jsp:include>
	</header>
	<h1>회원가입 완료</h1>
	<h5><c:out value="${USER.name}"/>님 회원가입을 진심으로 축하합니다</h5>
	<h5>회원님의 비밀번호는 아무도 알 수 없는 암호화 코드로 저장되므로 안심하셔도 좋습니다.</h5>
	<h5>감사합니다</h5>
	<button type="button" onclick="window.location.href='mainPage.do'">메인으로</button>
</body>
<style>
	body{
		text-align:center
	}
</style>

</html>