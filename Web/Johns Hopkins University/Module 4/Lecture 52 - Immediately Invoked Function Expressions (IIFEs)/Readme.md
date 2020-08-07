### Immediately Invoked Function Expressions (IIFEs)
[Link to Lesson](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/DGFRL/lecture-52-part-2-immediately-invoked-function-expressions-iifes)

        HTML File:
```html 
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
        <script src="js/script1.js"></script>
        <script src="js/script2.js"></script>
        <script src="js/app.js"></script>
    </body>
    </html>
```
        Script 1:
```js
    var yaakovGreeter = {};
    yaakovGreeter.name = "Yaakov";
    var greeting = "Hello ";

    yaakovGreeter.sayHello = function() {
        console.log(greeting + yaakovGreeter.name);
    }
```

        Script 2:
```js
    var brunoGreeter = {};
    brunoGreeter.name = "Bruno";
    var greeting = "Hi ";

    brunoGreeter.sayHi = function() {
        console.log(greeting + brunoGreeter.name);
    }
``` 
        App script:
```js
    yaakovGreeter.sayHello();
    brunoGreeter.sayHi();

```
        Results:
        Hi Yakoov
        Hi Bruno

> Inner Functions cannot be accessed by external script
>
> JavaScript will use the first greeting function and applies it to the other functions, overriding them, so to make it works, must create a new function to surround the specific greeting that will be used.
>
> *The correct way in the last exemple* 

###### Remembering Function Syntaxes
```js
    function a() {
        console.log("Hello World")
    }
    a(); // executing a function
```
> or

```js
    var a = function() {
        console.log("Hello World")
    }
    a(); 
```
###### Immediately Invoked Function Expression
###### IIFE
```js
    (function() {
        console.log("Hello World")
    })( ); 
//     ^ invoking the function 
```

```js
    (function(something) {
        console.log("Hello " + something);
    })("World!");
//        ^ invoking and passing values
```

###### Updating Scripts with IIFE

        Script 1:
```js
    (function(window) {
        var yaakovGreeter = {};
        yaakovGreeter.name = "Yaakov";
        var greeting = "Hello ";

        yaakovGreeter.sayHello = function() {
            console.log(greeting + yaakovGreeter.name);
        }
        window.yaakovGreeter = yaakovGreeter;
    })(window);
```
        Script 2:
```js
    (function(window) {
        var brunoGreeter = {};
        brunoGreeter.name = "Bruno";
        var greeting = "Hi ";

        brunoGreeter.sayHi = function() {
            console.log(greeting + brunoGreeter.name);
        }
        window.brunoGreeter = brunoGreeter;
    })(window);
```
        App Script:
```js
    yaakovGreeter.sayHello();
    brunoGreeter.sayHi();
```

        Results:
        Hello Yaakov
        Hi Bruno

> As above, the exemple shows how to expose functions to external classes and making it global, to be accessed by another script.
>
> The inner function sayHello or sayHi are now accesseble, and can be run, using the global function 'window'.