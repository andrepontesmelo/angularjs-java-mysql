'use strict';

angular.module('songsapp')
  .controller('AlbumCtrl', ['$scope', 'myFactory', function ($scope, myFactory) {

    myFactory.get({}, function (myFactory) {
      $scope.albums = myFactory.albums;
    });

    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  }]);
