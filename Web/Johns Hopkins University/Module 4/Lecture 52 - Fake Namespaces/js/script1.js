/*
var name = "Yaakov";

function sayHello() {
    console.log("Hello " + name);
}
*/
var yaakovGreeter = {};
yaakovGreeter.name = "Yaakov";

yaakovGreeter.sayHello = function() {
    console.log("Hello " + yaakovGreeter.name);
}