/*
var array = new Array();
array[0] = "Bruno";
array[1] = 2;
array[2] = function(name) {
    console.log("Hello " + name);
};
array[3] = { course: " Análise e Desenvolvimento de Sistemas" };
console.log(array);
console.log(array[1]);
array[2](" Bruno");
array[2](array[0]);
console.log(array[3].course);
*/

// Short Hand Array Creation
/*

var names = ["Yaakov", "John", "Joe"];


console.log(names);

var names = [
    { name: "Yaakov" },
    { name: "John" },
    "Joe"
];
console.log(names);

for (var i = 0; i < names.length; i++) {
    console.log("Hello " + names[i]);
}


names[100] = "Jim";
for (var i = 0; i < names.length; i++) {
    console.log("Hello " + names[i]);
}

*/

var names = ["Yaakov", "John", "Joe"];

/*
var myObject = {
    name: "Bruno",
    course: "Análise e Desenvolvimento de Sistemas",
    unniversity: "PUC - Go"
};

for (var prop in myObject) {
    console.log(prop + ": " + myObject[prop]);
}

for (name in names) {
    console.log("Hello " + names[name]);
}
*/

name.greeting = "Hi!";

for (var name in names) {
    console.log("Hello " + names[name]);
}