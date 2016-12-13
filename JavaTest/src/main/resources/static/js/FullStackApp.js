angular.module('FullStackApp', [])
  .controller('employees', function($scope, $http) {
    $http.get('/employees/').success(function(data) {
        $scope.employees = data;
    })})
  .controller('departments', function($scope, $http) {
    $http.get('/departments/').success(function(data) {
        $scope.departments = data;
    })});
