'use strict';

//var listaFacultades=[{id:1,nombre:'Ingenieria'}, {id:2,nombre:'Educación'},{id:3,nombre:'Musica'}];

module.controller('FacultadCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = null;
        $scope.id = 3;

        $scope.datosFormulario = {};
        $scope.panelEditar = false;

        //guardar
        $scope.nuevo = function () {
            $scope.panelEditar = true;
            $scope.datosFormulario = {};
        };

//        $scope.guardar = function () {
//            $scope.errores = {};
//            var error = false;
//
//            if (error)
//                return;
//
//            if (!$scope.datosFormulario.id) {
//                $scope.datosFormulario.id = $scope.id++;
//                $scope.lista.push($scope.datosFormulario);
//            }
//            $scope.panelEditar = false;
//        };

        $scope.guardar = function () {
            $scope.errores = {};
            var error = false;
            if (error)
                return;
            if (!$scope.datosFormulario.id) {
                $http.post("./webresources/ServicioFacultad", $scope.nuevaFacultad)
                        .then(function (response) {
                            $scope.getFacultad();
                        });
                $http;
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
        $scope.eliminar = function (data) {
            if (confirm('\xbfDesea elminar este registro?')) {
                console.log('esta es la data a eliminar' + data);

                $http.delete("./webresources/ServicioFacultad", {})
                        .then(function (response) {
                            $scope.getFacultad();
                            //$scope.datosFormulario = {};
                        }, function () {
                            alert("Error al eliminar la informaci\xf3n de facultad");
                        });

//            for(var i=0; i<$scope.lista.length; i++){
//                if($scope.lista[i]==data){
//                    $scope.lista.splice(i,1);
//                    break;
//                }
//            }
            }
        };

        //listar facultades
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
