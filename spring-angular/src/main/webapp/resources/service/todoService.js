angular.module('todoApp')
.factory("TodoService", function($http){
	return {
		// 서버에서 모든 todo를 가져오는 기능
		getAllTodos:function(){
			return $http.get("todos/").then(function(response){
				return response.data;
			});
		},
		removeTodo:function(id){
			
		},
		getTodo:function(id){
			
		},
		saveTodo:function(todo){
			
		},
		updateTodo:function(todo){
			
		}
		
	}
	
});