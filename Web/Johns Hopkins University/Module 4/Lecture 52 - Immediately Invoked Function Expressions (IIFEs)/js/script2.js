/*
var name = "Bruno";

function sayHi() {
    console.log("Hi " + name);
}


var brunoGreeter = {};
brunoGreeter.name = "Bruno";
var greeting = "Hi ";

brunoGreeter.sayHi = function() {
    console.log(greeting + brunoGreeter.name);

}
*/

(function(window) {
    var brunoGreeter = {};
    brunoGreeter.name = "Bruno";
    var greeting = "Hi ";

    brunoGreeter.sayHi = function() {
        console.log(greeting + brunoGreeter.name);

    }
    window.brunoGreeter = brunoGreeter;
})(window);