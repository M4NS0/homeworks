### JavaScript Types
[Link to Lesson - Part 1](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/4dwte/lecture-42-part-1-javascript-types)

[Link to Lesson - Part 2](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/qbD55/lecture-42-part-2-javascript-types)
A type is a partcular data structure.	
  
> - Each language defines some built-in types
> - Built-in types can be used to build other data structures
> - JS has 7 built-in types: 6 primitive and 1 Object type

<br>

###### Objects

A Collection of name/value pairs

```js
    // Person Object: 

    firstName: "Yaakov",
    lastName: "Chaikin",
    social: {
        linkedin: "yaakovchaikin",
        twitter: "yaakovchaikin",
        facebook: "CourseraWebDev"
    }
```
> firstName and lastname are names :P
> but social is a name also :O

<br>

###### Primitive Types

Represents a single, immutable value

> Single value, i.e., not an object
> 
> Immutable means once it’s set, it can’t be changed
>   - Value becomes read-only
>   - You can create another value based on an existing one

<br>

###### Primitive Type: Boolean
    2 values: True or False

<br>

###### Primitive Type: Undefined
    No value has ever been set 

> - Can only have one value: undefined
> - You can set a variable to undefined,
but you should never do it

    Its meaning is that it’s never been defined, so defining it to undefined is counter to its core meaning

<br>

```js
    var x;
    console.log(x);

    if (x == undefined) {
        console.log("x is undefined")
    }

    x = 5;
    if (x == undefined) {
        console.log("x is undefined");
    } else {
        console.log("x has been defined")
    }
```
    Result:
    
    x is undefined
    x has been defined

```js
    console.log(x);
```

    Result:

    Uncaught ReferenceError: x is not defined 
    
<br>

###### Primitive Type: Null
    Lack of value
> - As opposed to undefined, which is lack of definition
> - Can only have one value: null
> - It’s ok to explicitly set a variable to null

<br>

###### Primitive Type: Number
    The only numeric type in JS
> - Always represented under the hood as
double-precision 64-bit floating point
> - JS does not have an integer type
> - Integers are a subset of doubles instead of a separate
data type

<br>

###### Primitive Type: String
    Sequence of characters used to represent text
> - Use either single or double quotes, i.e., ‘text’ or “text”

###### Primitive Type: Symbol
    Part of Eckman Script 6