
angular.module('TankWar', ['ngRoute'])

.config(function($routeProvider) {
	$routeProvider
	.when('/',{

		templateUrl : 'view/Main.tpl'
	})
	.when('/CreareStrategia',{

		templateUrl : 'view/CreareStrategia.tpl',
		controller : 'myCtrl'
	})
	.when('/Login',{

		templateUrl : "view/Login.tpl",
		controller : 'loginCtrl'
	});
	
})
