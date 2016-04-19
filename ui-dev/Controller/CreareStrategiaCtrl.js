


angular.module('TankWar').controller('CreareStrategiaCtrl', ['$scope', function($scope){

	$scope.condizioni=[
            {nome:'Se nemico Destra' , 'drag': true },
            {nome:'Se nemico Sinistra'  , 'drag': true },
            {nome:'Se nemico Emanuele' , 'drag': true }

            ];

	$scope.dati=[{text:'primo'},{text:'Sinistro'}];


  $scope.dropzone = [];


  $scope.dropzone1 = [];



	
}])
.directive('condizione', function() {
  return {

    	restrict: 'EA',
        templateUrl: 'view/Condizione.tpl',
        replace: true,
        scope: {nome: '@'}
  };
})
.directive('condizionedroppata', function() {
  return {

      restrict: 'EA',
        templateUrl: 'view/CondizioneDroppata.tpl',
        replace: true,
        scope: {nome: '@'}
  };
});

 
