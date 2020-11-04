// 2 ways to declare a variable:

// var number  = 1;
// let count   = 2;

function doSomething() {
    for (var i = 0; i < 5; i ++) {
        console.log(i)
    }
    console.log('Finally: ' + i )
}
doSomething();