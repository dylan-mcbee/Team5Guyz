/**
 * 
 */
app.factory('ajaxFactory', function($http){
	let factory = {}
	var domain = 'http://localhost:8083/Cinema'

	factory.getUserInfo = function(credential, controller){
		return $http.post(domain +controller, credential);
	};
	
	factory.postUserInfo = function(credential, controller){
		console.log(credential);
		return $http.get(domain+controller, credential);
	};
	
	return factory;
})
