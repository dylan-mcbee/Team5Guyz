/**
 * 
 */
app.controller('RESTctrl', ['$scope', '$cookies', '$window','ajaxFactory' ,function($scope,$cookies,$window, ajaxFactory){
	$scope.credential ={};
	if($cookies.get('user')!=null){
		var info = JSON.parse($cookies.get('user'));
		console.log(info.email)
		$scope.username = info.firstName;
		$scope.password = info.password;
		console.log('test test');
		console.log($scope.username);
		
	}
	
	
	$scope.logout = function() {
        $cookies.remove('user');
        //console.log('HEre');
        $window.location.href = '/Cinema/index.html';
        //console.log('there');
        
    };
	
	$scope.login =() => {
		console.log('Logged in User');
		console.log($scope.credential);
		ajaxFactory.getUserInfo($scope.credential, '/login.do')
		.then((successResponse)=>{
			//$cookies.put('user', JSON.stringify(successResponse.data))
			console.log(successResponse.data);			
			$window.location.href = '/Cinema/index.html';
		})
	}
	
	$scope.register=()=>{
		ajaxFactory.postUserInfo($scope.credential, '/register.do')
		.then((succesResponse)=>{
			$cookies.put('user', JSON.stringify(successResponse.data))
			console.log(successResponse.data);
			$windows.location.href='/Cinema/index.html';
		})
	}
}])