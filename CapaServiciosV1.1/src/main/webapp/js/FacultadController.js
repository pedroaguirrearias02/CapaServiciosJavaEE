'use strict';

//var listaFacultades=[{id:1,nombre:'Ingenieria'}, {id:2,nombre:'Educación'},{id:3,nombre:'Musica'}];

module.controller('FacultadCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = listaFacultades;
    $scope.id=3;
    
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    
    //guardar
    $scope.nuevo = function () {
        $scope.panelEditar = true;
        $scope.datosFormulario = {};
    };
    
    $scope.guardar = function () {
        $scope.errores = {};
        var error = false;
        
        if (error)
            return;
        
        if (!$scope.datosFormulario.id){
            $scope.datosFormulario.id = $scope.id++;
            $scope.lista.push($scope.datosFormulario);
        }
        $scope.panelEditar = false;
    };
    $scope.cancelar = function () {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
    };

    //editar
    $scope.editar = function (data) {
        $scope.panelEditar = true;
        $scope.datosFormulario = data;
    };
    //eliminar
    $scope.eliminar = function (data){
        if (confirm('\xbfDesea elminar este registro?')) {    
            for(var i=0; i<$scope.lista.length; i++){
                if($scope.lista[i]==data){
                    $scope.lista.splice(i,1);
                    break;
                }
            }
        }
    };
    $scope.getFacultad = function () {
            $http.get("./webresources/ServicioFacultad", {})
                    .then(function (response) {
                        $scope.lista = response.data;
                        $scope.datosFormulario = {};
                    }, function () {
                        alert("Error al consultar el Facultad");
                    });
        };
    $scope.getFacultad();
}]);
