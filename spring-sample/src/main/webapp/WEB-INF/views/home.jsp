<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Blog Tree</title>
<script type="text/javascript">
	$(function() {
		$("li[id^=cat]").click(function() {
			event.preventDefault();
			var catNo = $(this).attr("id").replace("cat-", "");
			$.ajax({
				type:"get",
				url:"../blog/search.blog?cat="+catNo,
				dataType:"json",
				success:function(data){
					$('#content-box').empty();
					var htmlContent ="";
					$.each(data,function(index, item){
						htmlContent += "<div class='text-center'>";
						htmlContent += "<h3>"+item.title+"</h3>";
						htmlContent += "<fmt:formatDate value='${blog.regdate }' />";
						htmlContent += "<hr>";
						if (!(item.upFile == null)) {
							htmlContent += "<img width='600px' src='resources/images/"+item.upFile+"' />";
						}
						htmlContent += "<p>"+item.content+"</p>";
						htmlContent += "</div>";
						htmlContent += "<span class='glyphicon glyphicon-leaf'></span>";
						htmlContent += "<a id='"+item.hashtag+"-btn' class='btn btn-default btn-xs' href=''>"+item.hashtag+"</a>";
						htmlContent += "<hr>";
						htmlContent +="</div>";
						$('#content-box').html(htmlContent);
					});
				}
			});
		})
		
		$('a[class^=btn]').click(function(){
			event.preventDefault();
			var hashtag = $(this).attr('id').replace('-btn', '');
			alert(hashtag);
		});
	});
</script>
<style type="text/css">
body {
	position: relative;
}

.affix {
	top: 20px;
}

#section1 {
	color: #fff;
	background-color: #1E88E5;
}

#section2 {
	color: #fff;
	background-color: #673ab7;
}

#section3 {
	color: #fff;
	background-color: #ff9800;
}

#section41 {
	color: #fff;
	background-color: #00bcd4;
}

#section42 {
	color: #fff;
	background-color: #009688;
}

@media screen and (max-width: 810px) {
	#section1, #section2, #section3, #section41, #section42 {
		margin-left: 100px;
	}
}
</style>
</head>
<body data-spy="scroll" data-target="#myScrollspy" data-offset="15">
	<div class="container">
		<%@include file="nav.jsp"%>
		<div class="row">
			<c:choose>
				<c:when test="${not empty LOGINUSER }">
					<div class="col-sm-3">
						<nav id="myScrollspy">
							<ul class="nav nav-pills nav-stacked" data-spy="affix"
								data-offset-top="205">
								<li id="cat-10"><a href="">Book</a></li>
								<li id="cat-20"><a href="">Game</a></li>
								<li id="cat-30"><a href="">Daily</a></li>
								<li id="cat-40"><a href="">Movie</a></li>
								<li id="cat-50"><a href="">Food</a></li>
								<li id="cat-60"><a href="">Entertainment</a></li>
							</ul>
						</nav>
					</div>
					<div id="content-box" class="col-sm-9">
						<c:forEach var="blog" items="${blogList}">
							<div class="text-center">
								
								<h3>${blog.title }</h3>
								<fmt:formatDate value="${blog.regdate }" />
								
								<hr>
								<c:if test="${not empty blog.upFile }">
									<img width="600px" src="resources/images/${blog.upFile }" />
								</c:if>
								<p>${blog.content }</p>
							</div>
							<hr>
							<span class="glyphicon glyphicon-leaf"></span>
							<a id="${blog.hashtag }-btn" class="btn btn-default btn-xs" href="">${blog.hashtag }</a>
							<hr>
						</c:forEach>
					</div>
				</c:when>
				<c:otherwise>
					<div class="text-center">
						<h2>Please login</h2>
						<img src="resources/images/tree.jpg"/>
					</div>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</body>
</html>