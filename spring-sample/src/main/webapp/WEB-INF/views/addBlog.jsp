<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<%@include file="nav.jsp"%>
		<div class="row text-center">
			<h1>Plus Leaf</h1>
		</div>
		<div>
			<form:form action="addLeaf.blog" method="post" enctype="multipart/form-data" commandName="blogForm">
				<div class="form-group">
					<label>category</label>
					<select name="category" class="form-control">
						<option value="10">Book</option>
						<option value="20">Game</option>
						<option value="30">Daily</option>
						<option value="40">Movie</option>
						<option value="50">Food</option>
						<option value="60">Entertainment</option>
					</select>
				</div>
				<div class="form-group">
					<label>title</label>
					<form:input path="title" cssClass="form-control"/>
					<form:errors path="title" cssClass="text-danger"/>
				</div>
				<div class="form-group">
					<label>content</label>
					<form:textarea path="content" rows="6" cssClass="form-control"/>
					<form:errors path="content" cssClass="text-danger"/>
				</div>
				<div class="form-group">
					<label>fileUpload</label>
					<input type="file" name="uploadFile" class="form-control">
				</div>
				<div class="form-group">
					<label>hashTag</label>
					<input type="text" name="hashtag" class="form-control"/>
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