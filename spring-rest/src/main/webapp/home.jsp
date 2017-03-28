<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(function() {
		
		$('#form-box').hide();
		
		var $ul = $('#user-list');
		$.ajax({
			type : "GET",
			url : "user/",
			dataType : "json",
			success : function(data) {
				
				$ul.empty();
				if(!data.length){
					$ul.append('<li class="list-group-item">등록된 사용자 없음</li>');
				}
				$.each(data, function(index, item) {
					
					$ul.append("<li class='list-group-item' id='user-no-"+item.no+"'>" + item.name + "</li>");
					
				});
			}
		});
		
		$ul.on("click","li[id]",function(){
			
			$(this).addClass('active')
				   .siblings().removeClass('active');
			$('#form-box').hide();
			var no = $(this).attr('id').replace("user-no-", "");
			
			
			$.ajax({
				type:"GET",
				url:"user/"+no,
				dataType:"json",
				success:function(data){
					var $table = $('#user-table tbody').empty();

					var $tr1 = $('<tr></tr>');
					$tr1.append('<th>번호</th><td>'+data.no+'</td>');
					$tr1.append('<th>아이디</th><td>'+data.id+'</td>');
					
					var $tr2 = $('<tr></tr>');
					$tr2.append('<th>이름</th><td>'+data.name+'</td>');
					$tr2.append('<th>가입일</th><td>'+data.regdate+'</td>');
					
					var $tr3 = $('<tr></tr>');
					$tr3.append('<th>연락처</th><td>'+data.phone+'</td>');
					$tr3.append('<th>이메일</th><td>'+data.email+'</td>');
					
					$table.append($tr1);
					$table.append($tr2);
					$table.append($tr3);
					
				}
			});
		});
		
		$('#user-del-btn').click(function(){
			if ($('li[id].active').length){
				
				var no = $('li.active').attr('id').replace('user-no-', '');
				
				$.ajax({
					type:"DELETE",
					url:"user/"+no,
					dataType:"json",
					success:function(data){
						
						$('li.active').remove();
						
						if (!$ul.children('li').length){
							
							$ul.append('<li class="list-group-item">등록된 사용자 없음</li>');
						}
						
						$('#user-table tbody').empty();
						
					}
				});
			}
			
		});
		
		$('#add-btn').click(function(){
			
			event.preventDefault();
			
			var formDataArray = $('#user-form').serializeArray();
			var user = {}
			
			$.each(formDataArray, function(index,item){
				
				user[item.name] = item.value;
				
			});
			
			$('#user-form :input').val('');
			var methodType = 'POST';
			var requestURL = 'user/';
			
			if (user.no){
				methodType = 'PUT';
				requestURL = 'user/' + user.no; 
			}
			
			
			$.ajax({
				type:methodType,
				url:requestURL,
				contentType:"application/json", //서버로 보내는 컨텐츠의 형식을 정의
				data:JSON.stringify(user),
				success: function(data){
					
					$ul = $('#user-list');
					
					if (user.no){
						// 수정인경우
						$ul.find('li.active').text(data.name);
						
					}else {
						//등록인 경우
						if (!$ul.find('li[id]').length) {
							$ul.empty();
						}
					$ul.append("<li class='list-group-item' id='user-no-"+data.no+"'>" + data.name + "</li>");
					}
				}
				
			})
			
		});
		
		$('#user-add-btn').click(function(){
			
			$('#user-form :input[name="no"]').remove();
			$('#user-form :input').val('');
			$('#add-btn').text('등록');
			$('#form-box').show();
			
		});
		
		$('#user-update-btn').click(function(){
			
			var $li = $('#user-list li[id].active');
			
			if ($li.length){
				
				$('#form-box').show();
				$('#add-btn').text('수정');
				$('#user-form :input[name="no"]').remove();
				$('#user-form').append("<input type='hidden' name='no' value='"+$('#user-table td:eq(0)').text()+"'/>")
				
				$('#user-form :input[name="name"]').val($('#user-table td:eq(2)').text());
				$('#user-form :input[name="id"]').val($('#user-table td:eq(1)').text());
				$('#user-form :input[name="pwd"]').val("");
				$('#user-form :input[name="phone"]').val($('#user-table td:eq(4)').text());
				$('#user-form :input[name="email"]').val($('#user-table td:eq(5)').text());
				
			}
		});
	});
</script>
</head>
<body>
	<div class="container">
		<h1 class="text-center">사용자 관리</h1>
		<div class="row">
			<div class="col-sm-3">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">사용자 리스트</h3>
					</div>
					<ul class="list-group" id="user-list">
						<li class="list-group-item">등록된 사용자 없음</li>
					</ul>
					<div class="panel-footer">
						<button class="btn btn-success btn-sm" id="user-add-btn">등록</button>
						<button class="btn btn-warning btn-sm" id="user-update-btn">수정</button>
						<button class="btn btn-danger btn-sm" id="user-del-btn">삭제</button>
					</div>
				</div>
			</div>
			<div class="col-sm-9">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">사용자 상세정보</h3>
					</div>
					<table class="table table-bordered table-condensed" id="user-table">
						<tbody>
							
						</tbody>
					</table>
				</div>
				<div class="well" id="form-box">
					<form id="user-form">
					<div class="form-group">
						<label>이름</label>
						<input class="form-control" type="text" name="name">
					</div>
					<div class="form-group">
						<label>아이디</label>
						<input class="form-control" type="text" name="id">
					</div>
					<div class="form-group">
						<label>비밀번호</label>
						<input class="form-control" type="password" name="pwd">
					</div>
					<div class="form-group">
						<label>전화번호</label>
						<input class="form-control" type="tel" name="phone">
					</div>
					<div class="form-group">
						<label>이메일</label>
						<input class="form-control" type="email" name="email">
					</div>
					<div class="form-group text-right">
						<button type="submit" class="btn btn-primary btn-sm" id="add-btn">등록</button>
					</div>
				</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>