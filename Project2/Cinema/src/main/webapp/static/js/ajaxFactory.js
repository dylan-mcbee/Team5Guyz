/**
 * 
 */
app.factory('ajaxFactory', function($http){
	let factory = {}
<<<<<<< HEAD
	var domain = 'http://localhost:8081/Cinema'
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	var domain = 'http://localhost:8083/Cinema'
=======
	var domain = 'http://localhost:8081/Cinema'
>>>>>>> d0c2dc606488e91d6eadf028f4b46ad6ab3a3d8f
=======
	var domain = 'http://localhost:8081/Cinema'
>>>>>>> 9d824d420b0fac122a49296497844e30c48ebfee
=======
	var domain = 'http://localhost:8081/Cinema'
>>>>>>> e6c7580f2b47aa042b494c344f15982cf019ef42
=======
	var domain = 'http://localhost:8081/Cinema'
>>>>>>> e6c7580f2b47aa042b494c344f15982cf019ef42
>>>>>>> master
		
	factory.getUserInfo = function(credential, controller){
		return $http.post(domain +controller, credential);
	};
	
	return factory;
})
