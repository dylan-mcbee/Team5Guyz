app.controller('AdminController', ['$scope', 'upcomingMovieService', '$http', function($scope, upcomingMovieService, $http) {
    console.log("In Admin CONTROLLER");
    $('#modal1').modal();
    
    $http.post('/Cinema/movies.do')
	.success(function(response) {
		$scope.movies = response;
	})
	.error(function(err) {
		console.log(err);
	});
    
    $scope.remove = function (index) {
    	console.log("Id: " + $scope.movies[index].id);
    	$http.post('/Cinema/removemovie.do', $scope.movies[index].id)
    	.success(function(response) {
    		console.log(response);
    	})
    	.error(function(err) {
    		console.log(err);
    	});
        $scope.movies.splice(index, 1);
    }
    
    $scope.getUpcomingMovies = function() {
    	upcomingMovieService.getData().then(function(response) {
    		$scope.upcomingMovies = response.data.results;
    		console.log($scope.upcomingMovies);
    	});
    }
    
    $scope.addMovie = function() {
    	var movie = "";
    	
    	var title = $('#movieList').find(":selected").text();
    	
		for (var i in $scope.upcomingMovies) {
    		if ($scope.upcomingMovies[i].title === title) {
    			movie = $scope.upcomingMovies[i];
    			break;
    		}
    	}
		
		console.log("Title: " + movie.title);
    	
    	var times = [];
        $.each($("input[name='time']:checked"), function(){            
            times.push($(this).val());
        });
    	
    	$http.get('https://api.themoviedb.org/3/movie/' + movie.id + '?api_key=b932a2e3b8b51aa84a3cc19e5e61f3c8')
	    	.success(function(response) {
	    		var movieInfo = {};
	        	movieInfo['title'] = response.title;
	        	movieInfo['length'] = response.runtime;
	        	movieInfo['showtimes'] = times;
	        	movieInfo['id'] = response.id;
	        	movieInfo['imageUrl'] = "https://image.tmdb.org/t/p/w500" + response.poster_path;
	        	
	        	$http.post('/Cinema/addmovie.do', movieInfo)
	        	.success(function(response) {
	        		$scope.movies.push(response);
	        		$('#modal1').modal('close');
	        	})
	        	.error(function(err) {
	        		console.log(err);
	        	});
	    	})
	    	.error(function(err) {
	    	console.log(err);
	    	});
    }
}]);

// https://api.themoviedb.org/3/discover/movie?primary_release_date.gte=2017-7-4&primary_release_date.lte=2017-09-24&api_key=b932a2e3b8b51aa84a3cc19e5e61f3c8