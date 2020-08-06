### Arrays
[Link to Lesson - Part 1](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/WWTOG/lecture-50-part-1-arrays)

[Link to Lesson - Part 2](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/HkHpN/lecture-50-part-2-arrays)
###### Syntaxes:
```js
    var array = new Array();
    array[0] = "Bruno";
    array[1] = 2;
    array[2] = function(name) {
        console.log("Hello " + name);
    };
    array[3] = { course: " Análise e Desenvolvimento de Sistemas" };
    console.log(array);
```
        Result:
        Array(4) [ "Bruno", 2, 2(name), {…} ]

```js
    console.log(array[1]);
```
        Result:
        2

```js
    array[2](" Bruno");
```
        Result:
        Hello Bruno

```js
    array[2](array[0]);
```
        Result:
        Hello Bruno

```js
    console.log(array[3].course);
```
        Result:
        Análise e Desenvolvimento de Sistemas

```js
    var names = ["Yaakov", "John", "Joe"];
    console.log(names);
```
        Result:
        Array(3) [ "Yaakov", "John", "Joe" ]

```js
    var names = [
        { name: "Yaakov" },
        { name: "John" },
        { name: "Joe" }
    ];
    console.log(names);
```
        Results:
        […]
        0: Object { name: "Yaakov" }
        1: Object { name: "John" }
        2: "Joe"
        length: 3   

```js
    var names = ["Yaakov", "John", "Joe"];
```
        Results:
        Hello Yaakov
        Hello John
        Hello Joe

```js
    var names = ["Yaakov", "John", "Joe"];
    names[100] = "Jim";
    for (var i = 0; i < names.length; i++) {
        console.log("Hello " + names[i]);
    }
```
        Results:
        Hello Yaakov
        Hello John
        Hello Joe
        (97) Hello undefined
        Hello Jim


```js
    var names = ["Yaakov", "John", "Joe"];
    var myObject = {
        name: "Bruno",
        course: "Análise e Desenvolvimento de Sistemas",
        unniversity: "PUC - Go"
        };
```
        Result:
        name: Bruno
        course: Análise e Desenvolvimento de Sistemas
        unniversity: PUC - Go

```js
    var names = ["Yaakov", "John", "Joe"];
    var myObject = {
        name: "Bruno",
        course: "Análise e Desenvolvimento de Sistemas",
        unniversity: "PUC - Go"
        };

    for (var prop in myObject) {
    console.log(prop + ": " + myObject[prop]);
    }
```
        Result:
        name: Bruno
        course: Análise e Desenvolvimento de Sistemas
        unniversity: PUC - Go
```js
    var names = ["Yaakov", "John", "Joe"];
    for (name in names) {
    console.log("Hello " + names[name]);
}
```
        Result:
        Hello Yaakov
        Hello John
        Hello Joe

```js
    var names = ["Yaakov", "John", "Joe"];
    name.greeting = "Hi!";

    for (var name in names) {
        console.log("Hello " + names[name]);
    }
```
        Result:
        Hello Yaakov
        Hello John
        Hello Joe
        Hello Hi!