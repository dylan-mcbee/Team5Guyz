app.factory('upcomingMovieService', ['$http', function($http) {	
	var json = {};
	var getData = function() {
		var apiKey = "b932a2e3b8b51aa84a3cc19e5e61f3c8";
    	var date = new Date();
    	date.setDate(date.getDate() - 30);
    	var today = "";
    	if (date.getMonth() == 11)
    		today = date.getFullYear() + "-" + "1" + "-" + date.getDate();
    	else
    		today = date.getFullYear() + "-" + (date.getMonth() + 1) + "-" + date.getDate();
        
        var futureDate = new Date();
        futureDate.setDate(futureDate.getDate() + 30);
        futureDate = futureDate.getFullYear() + "-" + (futureDate.getMonth() + 1) + "-" + futureDate.getDate();
		return $http.get('https://api.themoviedb.org/3/discover/movie?primary_release_date.gte=' + today + '&primary_release_date.lte=' + futureDate + '&api_key=' + apiKey)
	};
	return {
		getData: getData
	};
}]);