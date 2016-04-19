


angular.module('TankWar').controller('CreareStrategiaCtrl', ['$scope', function($scope){

	$scope.condizioni=[{nome:'Se nemico Destra'},{nome:'Se nemico Sinistra'},{nome:'Se nemico Emanuele'}];

	$scope.dati=[{text:'primo'},{text:'Sinistro'}];

	$scope.dropzone = [];



	
}])
.directive('condizione', function() {
  return {

    	restrict: 'EA',
        templateUrl: 'view/Condizione.tpl',
        replace: true,
        scope: {nome: '@'}
  };
});

 
