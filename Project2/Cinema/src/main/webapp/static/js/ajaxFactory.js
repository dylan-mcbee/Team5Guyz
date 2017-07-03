/**
 * 
 */
app.factory('ajaxFactory', function($http){
	let factory = {}
<<<<<<< HEAD
	var domain = 'http://localhost:8083/Cinema'
=======
	var domain = 'http://localhost:8081/Cinema'
>>>>>>> d0c2dc606488e91d6eadf028f4b46ad6ab3a3d8f
		
	factory.getUserInfo = function(credential, controller){
		return $http.post(domain +controller, credential);
	};
	
	return factory;
})