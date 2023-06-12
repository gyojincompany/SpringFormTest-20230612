<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 정보</title>
</head>
<body>
	<h2>회원 정보 출력</h2>
	<hr>
	아이디 : ${mDto.id }<br><br>
	비밀번호 : ${mDto.pw }<br><br>
	이름 : ${mDto.name }<br><br>
	이메일 : ${mDto.email }<br><br> 
</body>
</html>