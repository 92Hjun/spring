<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>test Board</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<table class="table table-hover">
				<colgroup>
					<col width="10%">
					<col width="*">
					<col width="10%">
					<col width="10%">
					<col width="10%">
				</colgroup>
				<thead>
					<tr>
						<th>no</th>
						<th>title</th>
						<th>writer</th>
						<th>regdate</th>
						<th>views</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${boardList }" var="item" >
						<tr>
							<td>${item.no }</td>
							<td><a href="board.ss?bno=${item.no }">${item.title }</a></td>
							<td>${item.writer }</td>
							<td><fmt:formatDate value="${item.regdate }"/> </td>
							<td>${item.count }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="text-right">
				<a href="addContent.ss" class="btn btn-primary btn-xs">글쓰기</a>
				<a href="login.ss" class="btn btn-success btn-xs">로그인</a>
			</div>
		</div>
	</div>
</body>
</html>