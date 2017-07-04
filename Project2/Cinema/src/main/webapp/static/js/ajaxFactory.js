/**
 * 
 */
app.factory('ajaxFactory', function($http){
	let factory = {}
	var domain = 'http://localhost:8081/Cinema'
		
	factory.getUserInfo = function(credential, controller){
		return $http.post(domain +controller, credential);
	};
	
	return factory;
})
