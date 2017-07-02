app.directive('movieInfo', function() {
	return {
		restrict: 'E',
		scope: {
			info: '='
		},
		templateUrl: 'js/angularjs/views/movieInfo.html'
	};
});