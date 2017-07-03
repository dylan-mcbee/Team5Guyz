app.controller('MovieViewController', ['$scope', '$http', '$window', function($scope, $http, $window) {
    console.log("In MOVIEVIEW CONTROLLER")
	/*$scope.getMoviesInfo = function() {
		$http.post('Cinema/movies.do')
	    	.success(function(response) {
	    		$window.sessionStorage.setItem("movies", JSON.stringify(response));
	    		$window.location.href = 'static/movies.view';
	    	})
	    	.error(function(err) {
	    		console.log(err);
	    	});
	};*/
    $http.post('../Cinema/movies.do')
	.success(function(response) {
		$window.sessionStorage.setItem("movies", JSON.stringify(response));
		//$window.location.href = 'static/movies.view';
	})
	.error(function(err) {
		console.log(err);
	});
}]);