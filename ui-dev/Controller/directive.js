
var directives = angular.module('TankWar', []);
 
directives.directive('condizione', function() {
    return {
        restrict: 'E',
        template: '<div>ciao</div>',
        replace: true
       
    };
});