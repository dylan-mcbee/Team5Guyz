app.controller('MovieViewController', ['$scope', '$http', '$window', function($scope, $http, $window) {
    
	$scope.getMoviesInfo = function() {
		$http.post('http://localhost:8081/Cinema/movies.do')
	    	.success(function(response) {
	    		$window.sessionStorage.setItem("movies", JSON.stringify(response));
	    		$window.location.href = 'static/movies.view';
	    	})
	    	.error(function(err) {
	    		console.log(err);
	    	});
	};
}]);