/*
var name = "Bruno";

function sayHi() {
    console.log("Hi " + name);
}
*/

var brunoGreeter = {};
brunoGreeter.name = "Bruno";
var greeting = "Hi ";

brunoGreeter.sayHi = function() {
    console.log(greeting + brunoGreeter.name);

}