<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 등록</title>
</head>
<body>
	<form action="programInsert.do" method="post">
		<table>
			<tr>
				<th>프로그램번호</th>
				<td><input type="text" name="idx" required></td>
			</tr>
			<tr>
				<th>프로그램명</th>
				<td><input type="text" name="prog" required></td>
			</tr>
			<tr>
				<th>인원</th>
				<td><input type="text" name="member" ></td>
			</tr>
			<tr>
				<th>필수품</th>
				<td><input type="text" name="meterials"></td>
			</tr>
			<tr>
				<th>교육장소</th>
				<td><input type="text" name="maxDepth"></td>
			</tr>
			<tr>
				<th>최대수심</th>
				<td><input type="text" name="location"></td>
			</tr>
			<tr>
				<th>체험비용</th>
				<td><input type="text" name="expense"></td>
			</tr>
			<tr>
				<th>포함사항</th>
				<td><input type="text" name="includeGif"></td>
			</tr>
		</table>
		<div>
			<button type="button" onclick="window.history.go(-1)">이전</button>
			<button type="submit">등록</button>
		</div>
	</form>
</body>
</html>