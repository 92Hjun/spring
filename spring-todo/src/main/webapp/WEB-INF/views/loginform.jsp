<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Todo - Login</title>
</head>
<body>
	<div class="container">
		<h1>로그인</h1>
		<div class="row well">
			<c:if test="${param.error eq 'invalid'}">
				<div class="alert alert-danger">
					<strong>오류!</strong> 아이디 혹은 비밀번호가 유효한 값이 아닙니다.
				</div>
			</c:if>
			<c:if test="${param.error eq 'deny'}">
				<div class="alert alert-danger">
					<strong>오류!</strong> 로그인이 필요한 서비스 입니다.
				</div>
			</c:if>
			<form method="post" action="login.do">
				<div class="form-group">
					<label>아이디</label>
					<input name="id"  type="text" class="form-control"/>
				</div>
				<div class="form-group">
					<label>비밀번호</label>
					<input type="password" name="pwd" class="form-control"/>
				</div>
				<div class="form-group text-right">
					<button type="submit" class="btn btn-primary">로그인</button>
					<a href="home.do" class="btn btn-warning">취소</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>