angular.module('todoApp')
//컨트롤러가 사용하는 공통기능이 정의되어 있는 서비스(Service)
// 주로 서버와의 ajax 통신을 통한 데이터교환이 정의되어 있다.
// 서비스는 싱글턴이다.
.controller("todoCtrl", function($scope, TodoService){
	// 화면에 표시할 할일 목록
	$scope.todoList = [];
	$scope.rows = [5, 10, 20]
	
	$scope.currentPage = 1;
	
	$scope.pageSize = 5;
	
	$scope.$watch(function(watchScope){
		return $scope.pageSize;
	},function(newValue, oldValue){
		$scope.currentPage = 1;
	})
	
	$scope.getTodoList = function(){
		TodoService.getAllTodos().then(function(data){
			$scope.todoList = data;
		});
	}
	
	$scope.getActiveClass = function(pageNo){
		return $scope.currentPage == pageNo ? "btn-primary" : "";
	}
	
	$scope.setCurrentPage = function(pageNo){
		$scope.currentPage = pageNo;
	}
	
	$scope.getTodoList();
	
});