<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap/bootstrap.css">
<link rel="stylesheet" href="css/main.css">
<script type="text/javascript" src="js/bootstrap/bootstrap.bundle.js"></script>
<meta charset="UTF-8">
<title>프로그램 정보</title>
</head>
<body>
	<header>
		<jsp:include page="/WEB-INF/jsp/layout/header.jsp"></jsp:include>
	</header>
<table class="table table-sm table-hover">
	<thead>
		<tr>
			<th>프로그램</th>
			<th>최대인원</th>
			<th>필요물품</th>
			<th>위치</th>
			<th>최대수심</th>
			<th>비용</th>
			<th>추가사항</th>
			<c:if test="${USER.auth == 'T'}">
				<th>삭제</th>
			</c:if>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${program}" var="item">
			<tr>
				<td><c:out value="${item.prog }"/></td>
				<td><c:out value="${item.member }"/></td>
				<td><c:out value="${item.meterials }"/></td>
				<td><c:out value="${item.location }"/></td>
				<td><c:out value="${item.maxDepth }"/></td>
				<td><c:out value="${item.expense }"/></td>
				<td><c:out value="${item.includedGif }"/></td>
				<c:if test="${USER.auth == 'T'}">
					<td><button type="button" onclick="window.location.href='deleteProgram.do?idx=${item.idx}'">삭제</button>
				</c:if>
			</tr>
		</c:forEach>
	</tbody>
</table>
<div>
	<button type="button" onclick="window.history.go(-1)">이전</button>
	<c:if test="${USER.auth == 'T'}">
	<button type="button" onclick="window.location.href='programInsertPage.do'">등록</button>
	</c:if>
</div>
</body>
</html>