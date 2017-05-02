angular.module('todoApp')
.filter("range", function(){
	return function(data, page, size){
		var start_index = (page-1)*size;
		var end_index = page*size;
		
		return data.slice(start_index, end_index);
	}
});