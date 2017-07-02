app.factory('movieService', ['$http', function($http) {
	/*
	 * This request fetches a JSON object containing information about the 
	 * Jack Reacher movie using AJAX
	 */
//	return $http.get('https://api.themoviedb.org/3/movie/75780?api_key=b932a2e3b8b51aa84a3cc19e5e61f3c8&append_to_response=videos')
//		.success(function(data) {
//			return data;
//		})
//		.error(function(err) {
//			return err;
//		});
	
	var json = {};
	var getData = function(id) {
		console.log("Id: " + id);
		return $http.get('https://api.themoviedb.org/3/movie/' + id + '?api_key=b932a2e3b8b51aa84a3cc19e5e61f3c8&append_to_response=videos')
//		.success(function(data) {
//			return data;
//		})
	};
	return {
		getData: getData
	};
}]);