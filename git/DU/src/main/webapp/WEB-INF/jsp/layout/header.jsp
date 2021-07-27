<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.bundle.js"></script>

<meta charset="UTF-8">
</head>
<body>
	<div class="logoDiv">
		<img alt="대구대학교 로고" src="${pageContext.request.contextPath }/images/symbol_1.png"
			onclick="window.location.href='${pageContext.request.contextPath }/mainPage.do'">
	</div>
<!-- 	<div></div> -->
<!-- 	<ul class="infoUl"> -->
<!-- 		<li><a href="deptPage.do">소개</a></li> -->
<!-- 		<li><a href="deptPage.do">스쿠버다이빙</a></li> -->
<!-- 		<li><a href="deptPage.do">공지사항</a></li> -->
<!-- 		<li><a href="boardListPage.do">예약하기</a></li> -->
<!-- 	</ul> -->

   <div class="hd_wrap">
      <div class="menu_wrap">
         <a href="${pageContext.request.contextPath }/mainPage.do" class="main_logo"><img src=""${pageContext.request.contextPath }/images/llll.png" alt="travies logo">
         	<h1>Whales <h class="color_idea_D">Dive</h></h1>
         </a>
         <nav id="nav">
            <ul>
               <li><a href="${pageContext.request.contextPath}/programPage.do">소개</a></li>
 			<li><a href="${pageContext.request.contextPath}/programPage.do">스쿠버다이빙</a></li>
 			<li><a href="${pageContext.request.contextPath}/board2ListPage.do">공지사항</a></li>
		<li><a href="${pageContext.request.contextPath}/boardListPage.do">예약하기</a></li>
            </ul>
         </nav>
      </div>
   </div>
	
	<c:choose>
		<c:when test="${USER.name == null}">
			<div class="userInfoDiv">
				<button type="button" class="btn btn-primary btn-sm" style="right" onclick="window.location.href='signUpPage.do'">회원가입</button>
				<button type="button" class="btn btn-outline-primary btn-sm" style="right" onclick="window.location.href='loginPage.do'">로그인</button>
			</div>
		</c:when>
		<c:otherwise>
			<div class="userInfoDiv">
				<button type="button" style="background: black;color:white;padding:3px 7px;border-radius: 3px; text-decoration:none; font-size=13px; line-height:35px" onclick="window.location.href='userInfoConfirmPage.do'"><c:out value="${USER.name}"/></button>	
				<button type="button" class="btn btn-primary btn-sm" style="right" onclick="window.location.href='logout.do'">로그아웃</button>
			</div>
		</c:otherwise>
	</c:choose>	
</body>
</html>