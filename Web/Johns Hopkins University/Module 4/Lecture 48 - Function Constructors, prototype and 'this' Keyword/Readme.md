### Function Constructors, prototype and 'this' Keyword
[Link to Lesson](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/5hDX1/lecture-48-function-constructors-prototype-and-the-this-keyword)
###### Constructor Syntax
```js
    function Circle(radius) {
        this.radius = radius;
        this.getArea = function() {
            return Math.PI * Math.pow(this.radius, 2);
        };
    }
    var myCircle = new Circle(10);
    console.log(myCircle);
    console.log(myCircle.getArea());
```
        Results: 
        Object { radius: 10, getArea: getArea() }
        314.1592653589793

###### Prototype
```js 
    function Circle(radius) {
        this.radius = radius;
    }
    Circle.prototype.getArea =
        function() {
            return Math.PI * Math.pow(this.radius, 2);
        };

    var myCircle = new Circle(10);
    console.log(myCircle);

    var myOtherCircle = new Circle(20);
    console.log(myOtherCircle);
```
        Results:
        Object { radius: 10 }
        Object { radius: 20 }

> Prototypes alows to re-use the same memory address pointer
> As above, myCircle and myOtherCircle are using the same pointer

> Prototypes should not be placed inside function constructors
> They lose it's propriety overriding the same memory space
>
> The keyworld *'new'* must not be forgotten 
> The reason is *'new Circle()'* is a function  
>
> Function constructors must be Capitalyze