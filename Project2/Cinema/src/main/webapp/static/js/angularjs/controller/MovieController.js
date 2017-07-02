app.controller('MovieController', ['$scope', 'movieService', function($scope, movieService) {
	
//	$scope.getMovie = function() {
//		movieService.success(function(data) {
//			console.log(data);
//			var trailerKey = data.videos.results[0].key;
//			$scope.movie = {
//				title : data.title,
//				poster : "https://image.tmdb.org/t/p/w500" + data.poster_path,
//				release_date : data.release_date,
//				runtime : data.runtime,
//				genre : data.genres[0].name,
//				overview : data.overview,
//				rating : data.vote_average,
//				vote_count : data.vote_count,
//				trailer : "https://www.youtube.com/embed/" + trailerKey
//			};
//		});
//		$('.container1').toggle();
//	};
	
	$scope.getMovie = function(id) {
		movieService.getData(id).then(function(response) {
			var data = response.data;
			console.log(response.data);
			var trailerKey = data.videos.results[0].key;
			$scope.movie = {
				title : data.title,
				poster : "https://image.tmdb.org/t/p/w500" + data.poster_path,
				release_date : data.release_date,
				runtime : data.runtime,
				genre : data.genres[0].name,
				overview : data.overview,
				rating : data.vote_average,
				vote_count : data.vote_count,
				trailer : "https://www.youtube.com/embed/" + trailerKey
			};
			$('.container1').show();
		});
	};
}]);