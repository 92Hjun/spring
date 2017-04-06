<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>addContent Form</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<form:form action="addContent.ss" method="post" commandName="boardForm" enctype="multipart/form-data">
				<div class="form-group">
				
					<form:select path="category" cssClass="form-control">
						<option value="Y">공지사항</option>
						<option value="N">자유글</option>
						<option value="Q">Q&amp;A</option>
					</form:select>
				</div>
				<div class="form-group">
					<label>title</label>
					<form:input path="title" cssClass="form-control"/>
					<form:errors path="title" cssClass="text-danger"/>
				</div>
				<div class="form-group">
					<label>content</label>
					<form:textarea rows="6" path="contents" cssClass="form-control"/>
					<form:errors path="contents" cssClass="text-danger"/>
				</div>
				<div class="form-group">
					<label>file</label>
					<input class="form-control" type="file" name="fileName"/>
				</div>
				<div class="text-right">
					<button type="submit" class="btn btn-primary btn-xs">등록</button>
					<a href="home.ss" class="btn btn-warning btn-xs">취소</a>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>