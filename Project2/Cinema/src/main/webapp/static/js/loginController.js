/**
 * 
 */
app.controller('RESTctrl', ['$scope', '$cookies', '$window','ajaxFactory' ,function($scope,$cookies,$window, ajaxFactory){
	$scope.credential ={};
	var info = JSON.parse($cookies.get('user'));
	console.log(info.email)
	$scope.username = info.email;
	$scope.password = info.password;
	console.log('test test');
	console.log($scope.username);
	
	$scope.login =() => {
		console.log('Logged in User');
		console.log($scope.credential);
		ajaxFactory.getUserInfo($scope.credential, '/login.do')
		.then((successResponse)=>{
			$cookies.put('user', JSON.stringify(successResponse.data))
			console.log(successResponse.data);			
			//$window.location.href = '/Cinema/index.html';
		})
	}
}])