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
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<%@include file="nav.jsp" %>
		<div class="row text-center">
			<h1>Plus User</h1>
		</div>
		<div>
			<form:form action="addUser.blog" method="post" commandName="userForm">
				<div class="form-group">
					<label>id</label>
					<form:input path="id" cssClass="form-control"/>
					<form:errors path="id" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label>pwd</label>
					<form:password path="pwd" cssClass="form-control"/>
					<form:errors path="pwd" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label>name</label>
					<form:input path="name" cssClass="form-control"/>
					<form:errors path="name" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label>phone</label>
					<form:input path="phone" cssClass="form-control"/>
					<form:errors path="phone" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label>email</label>
					<form:input path="email" cssClass="form-control"/>
					<form:errors path="email" cssClass="text-danger" />
				</div>
				<div class="text-right">
					<button type="submit" class="btn btn-primary btn-sm">submit</button>
					<a href="home.blog" class="btn btn-primary btn-sm">cancle</a>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>