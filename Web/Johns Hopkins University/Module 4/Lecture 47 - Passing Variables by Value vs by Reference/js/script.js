var a = 7;
var b = a;
console.log("a: " + a);
console.log("b: " + b);

b = 5;
console.log("\nafter b update: ");
console.log("a: " + a);
console.log("b: " + b);

var a = { x: 7 };
var b = a;
console.log("a: " + a);
console.log("b: " + b);

b.x = 5
console.log("\nafter b.x update: ");
console.log("a: " + a);
console.log("b: " + b);

/** Pass by Reference vs pass by Value: **/

function changePrimitive(primValue) {
    console.log("in changePrimitive...");
    console.log("before: " + primValue);

    primValue = 5;
    console.log("after: " + primValue);

}

var value = 7;
changePrimitive(value);
console.log("after changePrimitive, original value: " + value);


function changeObject(objValue) {
    console.log("in changeObject...");
    console.log("before: " + objValue); // {x: 7}

    objValue.x = 5;
    console.log("after: " + objValue); // {x: 5}
}

value = { x: 7 }
changeObject(value); // {x: 5}
console.log("after changeObject, original Value:" + value); // {x: 5}