<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>register Form</title>
</head>
<body>
	<div class="container">
		<h1>회원가입 폼</h1>
		<div class="row well">
			<form:form method="post" action="register.do" commandName="userForm">
				<div class="form-group">
					<label>아이디</label>
					<form:input path="id" cssClass="form-control"/>
					<form:errors path="id" cssClass="text-danger"/>
				</div>
				<div class="form-group">
					<label>비밀번호</label>
					<form:password path="pwd" cssClass="form-control"/>
					<form:errors path="pwd" cssClass="text-danger"/>
				</div>
				<div class="form-group">
					<label>이름</label>
					<form:input path="name" cssClass="form-control"/>
					<form:errors path="name" cssClass="text-danger"/>
				</div>
				<div class="form-group">
					<label>전화번호</label>
					<form:input path="phone" cssClass="form-control"/>
					<form:errors path="phone" cssClass="text-danger"/>
				</div>
				<div class="form-group">
					<label>이메일</label>
					<form:input path="email" cssClass="form-control"/>
					<form:errors path="email" cssClass="text-danger"/>
				</div>
				<div class="form-group text-right">
					<button type="submit" class="btn btn-primary">가입</button>
					<a href="home.do" class="btn btn-warning">취소</a>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>