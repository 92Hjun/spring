<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
	.jumbotron{
		background-color: #ffffff !important;
	}
</style>
<div class="jumbotron">
	<div class="text-center">
		<h1>Blog Tree<span class="glyphicon glyphicon-tree-deciduous"></span></h1>
	</div>
</div>
<nav class="navbar navbar-default">
    <ul class="nav navbar-nav">
      <li><a href="home.blog">Home</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
	    <c:choose>
	    	<c:when test="${empty LOGINUSER }">
		      <li><a id="signUp-btn" href="addUser.blog"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
		      <li><a id="login-btn" href="login.blog"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	    	</c:when>
	    	<c:otherwise>
		      <li><a id="side-btn" href="addLeaf.blog"><span class="glyphicon glyphicon glyphicon-leaf"></span> Add Leaf</a></li>
		      <li><a id="side-btn" href="logout.blog"><span class="glyphicon glyphicon-log-out"></span>  Logout</a></li>
	    	</c:otherwise>
	    </c:choose>
    </ul>
</nav>