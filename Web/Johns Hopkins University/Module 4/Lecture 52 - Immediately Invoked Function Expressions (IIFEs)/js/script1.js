/*
var name = "Yaakov";

function sayHello() {
    console.log("Hello " + name);
}
*/
var yaakovGreeter = {};
yaakovGreeter.name = "Yaakov";
var greeting = "Hello ";

yaakovGreeter.sayHello = function() {
    console.log(greeting + yaakovGreeter.name);
}