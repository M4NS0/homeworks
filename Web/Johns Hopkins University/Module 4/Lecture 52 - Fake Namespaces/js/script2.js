/*
var name = "Bruno";

function sayHi() {
    console.log("Hi " + name);
}
*/

var brunoGreeter = {};
brunoGreeter.name = "Bruno";

brunoGreeter.sayHi = function() {
    console.log("Hi " + brunoGreeter.name);

}