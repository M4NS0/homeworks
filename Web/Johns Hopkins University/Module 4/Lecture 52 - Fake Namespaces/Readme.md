
[Link to Lesson - Part 1](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/uz3nG/lecture-52-part-1-fake-namespaces)

[Link to Lesson - Part 2](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/DGFRL/lecture-52-part-2-immediately-invoked-function-expressions-iifes)


### Fake Namespace 

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
    var name = "Yaakov"; // Global scope

    function sayHello() {
        console.log("Hello " + name);
    }

```
        Script 2:
```js
    var name = "Bruno"; // Global Scope

    function sayHi() {
        console.log("Hi " + name);
    }
```
        App script:
```js
    sayHello();
    sayHi();
```
        Results:
        Hello Bruno
        Hi Bruno

> One script is stepping on the toes of the other
> To solve it is using the Fake Namespaces

        Changing script 1:
```js
    var yaakovGreeter = {};
    yaakovGreeter.name = "Yaakov";

    yaakovGreeter.sayHello = function() {
        console.log("Hello " + yaakovGreeter.name);
    }
```
        Changing script 2:
```js
    var brunoGreeter = {};
    brunoGreeter.name = "Bruno";

    brunoGreeter.sayHi = function() {
        console.log("Hi " + brunoGreeter.name);
    }
```
        Changing app script

```js
    yaakovGreeter.sayHello();
    brunoGreeter.sayHi();
```
        Results:
        Hello Yaakov
        Hi Bruno
