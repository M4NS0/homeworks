var string = "Henlow";
string += " World";
console.log(string + "!");


/** Regular Math Operators **/
/*
console.log((5 + 4) / 3);
console.log(undefined / 5); //Result: NAN


function test1(a) {
    console.log(a / 5);
}
test1(); // Result: NAN


/** Equality **/
/*
var x = 4,
    y = 4;
if (x == y) {
    console.log("x=4 is equal to y=4");
}

x = "4" //

if (x == y) {
    console.log("x='4' is equal to y=4");
}

/** Strict Equality **/
/*
if (x === y) {
    console.log("Strict: x='4' is equal to y=4")
} else {
    console.log("Strict: x='4' is not equal to y=4");
}

/** If Statement (all false) **/
/*
if (false || null || undefined || "" || 0 || NaN) {
    console.log("This line won't ever execute");
} else {
    console.log("All false");
}

/** If Statement (all true) **/
/*
if (true && "hello" && 1 && -1 && "false") {
    console.log("All true")
}

/** Best Practice for Curly Brace {} style **/
/*
function a() 
{
    return 
    {
        name: "Yaakov"
    };
}

function b() {
    return {
        name: "Yakoov"
    };
}
console.log(a());
console.log(b());

/** For Loop **/
var sum = 0;
for (var i = 0; i < 10; i++) {
    console.log(i);
    sum += i;
}
console.log("sum through 9 is: " + sum);