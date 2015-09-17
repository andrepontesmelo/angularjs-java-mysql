'use strict';

angular.module('songsapp')
  .factory('myFactory', function ($resource) {
    // Service logic
    // ...
    var meaningOfLife = 42;

    // Public API here
//    return {
//      someMethod: function () {
//        return meaningOfLife;
//      }
//    };

        return $resource('http://localhost\\:8080/songrestapi/rest/album/', {}, {
            query: {
                method: 'GET',
                params: {},
                isArray: false
            }
        })
  });
