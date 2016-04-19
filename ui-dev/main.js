
angular.module('TankWar', ['ngRoute','ngDragDrop'])

.config(function($routeProvider) {
	$routeProvider
	.when('/',{

		templateUrl : 'view/Main.tpl'
	})
	.when('/CreareStrategia',{

		templateUrl : 'view/CreareStrategia.tpl',
		controller : 'CreareStrategiaCtrl'
	})
	.when('/Login',{

		templateUrl : "view/Login.tpl",
		controller : 'loginCtrl'
	});
	
})
