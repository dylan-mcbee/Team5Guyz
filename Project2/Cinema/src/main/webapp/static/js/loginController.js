/**
 * 
 */
app.controller('RESTctrl', function($scope, ajaxFactory){
	$scope.credential ={};
	$scope.login =() => {
		console.log('Logged in User')
		console.log($scope.credential);
		ajaxFactory.getUserInfo($scope.credential, '/login.do')
			.then((successResponse)=>{
				console.log(successResponse.data);
			})
	}
})