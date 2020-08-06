### Immediately Invoked Function Expressions (IIFEs)
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
        

```js

```

        Results:

```js

```

        Results:

```js

```

        Results:


