app.controller('MovieDisplayController', ['$scope', '$window', function($scope, $window) {
	$scope.movies = JSON.parse($window.sessionStorage.getItem('movies'));
//	var array = ['#one!', '#two!', '#three!', '#four!', '#five!'];
//	
//	var temp = {};
//	for (var i = 0; i < 5; i++) {
//		temp[$scope.movies[i].id] = array[i];
//	}
//	$scope.sources = temp;
}]);