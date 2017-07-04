/**
 * 
 */
app.factory('ajaxFactory', function($http){
	let factory = {}
<<<<<<< HEAD

	var domain = 'http://localhost:8083/Cinema'	
=======
<<<<<<< HEAD
<<<<<<< HEAD
	var domain = 'http://localhost:8083/Cinema'
=======
	var domain = 'http://localhost:8081/Cinema'
>>>>>>> d0c2dc606488e91d6eadf028f4b46ad6ab3a3d8f
=======
	var domain = 'http://localhost:8081/Cinema'
>>>>>>> 9d824d420b0fac122a49296497844e30c48ebfee
		
>>>>>>> master
	factory.getUserInfo = function(credential, controller){
		return $http.post(domain +controller, credential);
	};
	
	return factory;
})