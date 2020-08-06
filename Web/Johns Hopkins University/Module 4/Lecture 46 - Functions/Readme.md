### Functions
[Link to Lesson](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/xCdAU/lecture-46-functions-explained)
<br>

###### Are First-Class Data
>  Whatever you could do with the variable and with an object, you could also do with the function
> 
>   - Passing that around, assign it to a variable
>   - Pass it as an argument to another function

<br>

###### Are Objects
> They're regular objects that have some special properties to them
> 
> Exemples:
```js
    function multiply(x, y) {
      return x * y;
    }

    console.log(multiply(5, 3));

    multiply.version = "v.1.0.0";
    console.log(multiply.version);
    console.log(multiply.toString());
    console.log(multiply);
    
```
        Results:
        15
        v.1.0.0
        function multiply(x, y) { return x * y; }
        function multiply(x, y) { return x * y; }
        
> *Attention to this exemple:*
```js
    function makeMultiplier(multiplier) {
        var myFunc = function(x) {
            return multiplier * x;
        };
        return myFunc;
    }

    var multiplyBy3 = makeMultiplier(3);
    console.log(multiplyBy3(10));
```
        Result 
        30

> Function, expecting a multiplier value:
```js
    function makeMultiplier(multiplier) { ... }
```

> Function within a Function, using the multiplier value:

```js
    var myFunc = function(x) {
        return multiplier * x;
    };
```

> Returning the result of the inner function:
```js
    return myFunc;
```

> Creating variables with different attributes that passes values to the function:
```js
    var multiplyBy3 = makeMultiplier(3);
    console.log(multiplyBy3(10));

    var doubleAll = makeMultiplier(2);
    console.log(doubleAll(50));
```
        Results:
        30
        100

###### Passing functions as Arguments

> The exemple below will pass a value and a reference to the function:
```js
    function doOperationOn(x,operation) {
      return operation(x);
    }
    var result = doOperationOn(5, multiplyBy3);
    console.log(result);

    result = doOperationOn(100, DoubleAll);
    console.log(result);
```
        Result:
        15
        200
