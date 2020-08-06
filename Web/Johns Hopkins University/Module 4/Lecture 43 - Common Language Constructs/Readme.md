### Common Language Constructs
[Link to Lesson - Part 1](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/igIL4/lecture-43-part-1-common-language-constructs)

[Link to Lesson - Part 2](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/AQwu7/lecture-43-part-2-common-language-constructs)

[Link to Lesson - Part 3](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/laSkp/lecture-43-part-3-common-language-constructs)
###### String Concatenation

```js
    var string = "Henlow";
    string += " World";
    console.log(string + "!");
```

###### Regular Math Operators 

```js
    console.log((5 + 4) / 3);
    console.log(undefined / 5); 


    function test1(a) {
        console.log(a / 5);
    }
    test1(); 
```
        Results: 
        3
        NAN
        NAN

<br>

###### Equality


```js
    var x = 4,
        y = 4;
    if (x == y) {
        console.log("x=4 is equal to y=4");
    }

    x = "4" //

    if (x == y) { // double equals
        console.log("x='4' is equal to y=4");
    }
```
        Results:
        x=4 is equal to y=4
        x='4' is equal to y=4

<br>

###### Strinct Equality


```js
    if (x === y) { // triple equals
        console.log("Strict: x='4' is equal to y=4")
    } else {
        console.log("Strict: x='4' is not equal to y=4");
    }
```
        Result:
        Strict: x='4' is not equal to y=4

<br>

###### If Statement (all false)

```js
    if (false || null || undefined || "" || 0 || NaN) {
        console.log("This line won't ever execute");
    } else {
        console.log("All false");
}
```
        Result:  
        All false  

```js
    Boolean(null);
    Boolean("");
```
        Results:  
        false
        false

<br>

###### If Statement (all true)


```js
    if (true && "hello" && 1 && -1 && "false") {
        console.log("All true")
```
        Result:
        All true


<br>

###### Best Practice for Curly Brace {} not a style! 


```js
    function a() 
    {
        return 
        {
            name: "Yaakov"
        };
    }
    console.log(a());
```
        Result:
        undefined

```js
    function b() {
        return {
            name: "Yaakov"
        };
    }
    console.log(b());
```
        Result:
        Object { name: "Yakoov" }


<br>

###### For Loop


```js
    var sum = 0;
    for (var i = 0; i < 10; i++) {
        sum += i;
    }
    console.log("sum through 9 is: " + sum);
```
        Result:
        sum through 9 is: 45

