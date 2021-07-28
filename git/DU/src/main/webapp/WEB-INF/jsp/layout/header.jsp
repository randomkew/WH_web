<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap/bootstrap.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/main.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.bundle.js"></script>

<meta charset="UTF-8">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col"></div>
			<div class="col">
				<c:choose>
					<c:when test="${USER.name == null}">
						<div class="userInfoDiv">
							<button type="button" class="btn btn-primary btn-sm" style=""
								onclick="window.location.href='signUpPage.do'">회원가입</button>
							<button type="button" class="btn btn-outline-primary btn-sm"
								style="" onclick="window.location.href='loginPage.do'">로그인</button>
						</div>
					</c:when>
					<c:otherwise>
						<div class="userInfoDiv">
							<button type="button"
								style="background: black;" class="btn btn-primary btn-sm "
								onclick="window.location.href='userInfoConfirmPage.do'">
								<c:out value="${USER.name}" />
							</button>
							<button type="button" class="btn btn-primary btn-sm" style=""
								onclick="window.location.href='logout.do'">로그아웃</button>
						</div>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		<div class="infoUl">
		<div class="row">
		<div class="col">

			<a href="${pageContext.request.contextPath }/mainPage.do" class="main_logo"> <img src="${pageContext.request.contextPath }/images/logo.jpg" alt="logo" style="width:40px; margin-top:10px; height:auto; float:left;"><h1>Whales Dive</h1> </a>
		</div>
		<div class="col">
			<nav id="nav">
			<ul>
				<li><a href="${pageContext.request.contextPath}/programPage.do">소개</a></li>
				<li><a href="${pageContext.request.contextPath}/programPage.do">스쿠버다이빙</a></li>
				<li><a
					href="${pageContext.request.contextPath}/noticeListPage.do">공지사항</a></li>
				<li><a
					href="${pageContext.request.contextPath}/boardListPage.do">예약하기</a></li>
			</ul>
			</nav>
		</div>
		</div>
	</div>
	</div>
</body>
</html>