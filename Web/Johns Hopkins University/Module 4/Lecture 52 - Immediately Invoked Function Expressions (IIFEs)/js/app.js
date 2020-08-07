/*
sayHello();
sayHi();

yaakovGreeter.sayHello();
brunoGreeter.sayHi();

*/

function a() {
    console.log("Hello World")
}
a();



var a = (function() {
    console.log("Hello World")
});
a();


// Immediately Invoked Function Expression
// IIFE

(function() {
    console.log("Hello World")
})();

(function(something) {
    console.log("Hello " + something);
})("World!");

yaakovGreeter.sayHello();
brunoGreeter.sayHi();