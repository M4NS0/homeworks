function test() {
    console.log(this);
    this.myName = "Bruno";
}
test();
console.log(window.myName);

/** Function Constructors */

/*
function Circle(radius) {
    console.log(this);

}
var myCircle = new Circle(10);
console.log(myCircle);



function Circle(radius) {
    this.radius = radius;
    this.getArea = function() {
        return Math.PI * Math.pow(this.radius, 2);
    };

}
var myCircle = new Circle(10);
console.log(myCircle);
console.log(myCircle.getArea());

*/

function Circle(radius) {
    this.radius = radius;
}
Circle.prototype.getArea =
    function() {
        return Math.PI * Math.pow(this.radius, 2);
    };

var myCircle = new Circle(10);
console.log(myCircle);

var myOtherCircle = new Circle(20);
console.log(myOtherCircle);