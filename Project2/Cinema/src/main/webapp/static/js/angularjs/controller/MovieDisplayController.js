app.controller('MovieDisplayController', ['$scope', '$window', function($scope, $window) {
	$scope.movies = JSON.parse($window.sessionStorage.getItem('movies'));
}]);