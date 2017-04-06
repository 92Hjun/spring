<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title></title>
</head>
<body>
	<div class="container">
		<%@include file="nav.jsp" %>
		<div class="row text-center">
			<h1>Login User</h1>
		</div>
		<c:if test="${param.error eq 'invalid' }">
			<div class="alert alert-danger">
				<strong>Error!</strong> 아이디 혹은 비밀번호가 일치하지 않습니다.
			</div>
		</c:if>
		<div>
			<form action="login.blog" method="post">
				<div class="form-group">
					<label>아이디</label>
					<input class="form-control" type="text" name="id" />
				</div>
				<div class="form-group">
					<label>패스워드</label>
					<input class="form-control" type="password" name="pwd" />
				</div>
				<div class="text-right">
					<button class="btn btn-primary btn-sm" type="submit">로그인</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>