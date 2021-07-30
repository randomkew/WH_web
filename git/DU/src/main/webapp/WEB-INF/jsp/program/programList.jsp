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
	href="${pageContext.request.contextPath}/css/bootstrap/bootstrap.min.css">
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

		<c:forEach items="${program}" var="item">
			<div class="row featurette">
				<div class="col-md-7">
					<h2 class="featurette-heading">
						프로그램:<span class="text-muted"><c:out value="${item.prog }" /></span>
					</h2>
					<p class="lead"> 최대인원:
						<c:out value="${item.member }" />
					</p>
					<p class="lead"> 필요물품:
						<c:out value="${item.meterials }" />
					</p>
					<p class="lead"> 위치:
						<c:out value="${item.location }" />
					</p>
					<p class="lead"> 최대수심:
						<c:out value="${item.maxDepth }" />
					</p>
					<p class="lead"> 비용:
						<c:out value="${item.expense }" />
					</p>
					<p class="lead"> 추가사항:
						<c:out value="${item.includedGif }" />
					</p>
					<c:if test="${USER.auth == 'T'}">
						<button type="button"
							onclick="window.location.href='deleteProgram.do?idx=${item.idx}'">삭제</button>
					</c:if>
				</div>
				<div class="col-md-5">
					<img class="featurette-image img-responsive center-block"
						src="${pageContext.request.contextPath }/images/${item.prog}.jpg"
						alt="Generic placeholder image">
				</div>
			</div>
			<hr >
		</c:forEach>
	</table>

	<div>
		<button type="button" onclick="window.history.go(-1)">이전</button>
		<c:if test="${USER.auth == 'T'}">
			<button type="button"
				onclick="window.location.href='programInsertPage.do'">등록</button>
		</c:if>
	</div>
</body>
<style>

/* GLOBAL STYLES
-------------------------------------------------- */
/* Padding below the footer and lighter body text */
body {
	padding-bottom: 40px;
	color: #5a5a5a;
}

/* CUSTOMIZE THE NAVBAR
-------------------------------------------------- */

/* Special class on .container surrounding .navbar, used for positioning it into place. */
.navbar-wrapper {
	position: absolute;
	top: 0;
	right: 0;
	left: 0;
	z-index: 20;
}

/* Flip around the padding for proper display in narrow viewports */
.navbar-wrapper>.container {
	padding-right: 0;
	padding-left: 0;
}

.navbar-wrapper .navbar {
	padding-right: 15px;
	padding-left: 15px;
}

.navbar-wrapper .navbar .container {
	width: auto;
}

/* CUSTOMIZE THE CAROUSEL
-------------------------------------------------- */

/* Carousel base class */
.carousel {
	height: 500px;
	margin-bottom: 60px;
}
/* Since positioning the image, we need to help out the caption */
.carousel-caption {
	z-index: 10;
}

/* Declare heights because of positioning of img element */
.carousel .item {
	height: 500px;
	background-color: #777;
}

.carousel-inner>.item>img {
	position: absolute;
	top: 0;
	left: 0;
	min-width: 100%;
	height: 500px;
}

/* MARKETING CONTENT
-------------------------------------------------- */

/* Center align the text within the three columns below the carousel */
.marketing .col-lg-4 {
	margin-bottom: 20px;
	text-align: center;
}

.marketing h2 {
	font-weight: normal;
}

.marketing .col-lg-4 p {
	margin-right: 10px;
	margin-left: 10px;
}

/* Featurettes
------------------------- */
.featurette-divider {
	margin: 80px 0; /* Space out the Bootstrap <hr> more */
}

/* Thin out the marketing headings */
.featurette-heading {
	font-weight: 300;
	line-height: 1;
	letter-spacing: -1px;
}

/* RESPONSIVE CSS
-------------------------------------------------- */
@media ( min-width : 768px) {
	/* Navbar positioning foo */
	.navbar-wrapper {
		margin-top: 20px;
	}
	.navbar-wrapper .container {
		padding-right: 15px;
		padding-left: 15px;
	}
	.navbar-wrapper .navbar {
		padding-right: 0;
		padding-left: 0;
	}

	/* The navbar becomes detached from the top, so we round the corners */
	.navbar-wrapper .navbar {
		border-radius: 4px;
	}

	/* Bump up size of carousel content */
	.carousel-caption p {
		margin-bottom: 20px;
		font-size: 21px;
		line-height: 1.4;
	}
	.featurette-heading {
		font-size: 50px;
	}
}

@media ( min-width : 992px) {
	.featurette-heading {
		margin-top: 120px;
	}
}
</style>
</html>
</html>