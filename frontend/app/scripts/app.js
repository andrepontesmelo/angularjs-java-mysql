'use strict';

angular
  .module('songsapp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/albums', {
        templateUrl: 'views/albums.html',
        controller: 'AlbumCtrl',
        controllerAs: 'album'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
