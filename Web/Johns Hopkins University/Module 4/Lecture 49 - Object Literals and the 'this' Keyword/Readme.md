### Lecture 49 - Object Literals and the 'this' Keyword

[Link to Lesson](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/XaYeq/lecture-49-object-literals-and-the-this-keyword)

```js
    var literalCircle = {
        radius: 10,
        getArea: function() {
            console.log(this)
        }
    };
    literalCircle.getArea();
```
        Result:
        Object { radius: 10, getArea: getArea() }


```js
    var literalCircle = {
    radius: 10,

    getArea: function() {
        
        console.log(this);

    /*  v This constructor function may be converted to a class declaration */
        var increaseRadius = function() {
            this.radius = 20;
        };

        increaseRadius();
        console.log(this.radius);
        return Math.PI * Math.pow(this.radius, 2);
        }
    };

    console.log(literalCircle.getArea());
``` 
        Results:
        10
        314.159265

> The 'this' will still pointing to the global variable and it won't increase
> To solve the problem:

```js
    var literalCircle = {
        radius: 10,

        getArea: function() {
            var self = this;
            console.log(this);


            var increaseRadius = function() {
                self.radius = 20;
            };

            increaseRadius();
            console.log(this.radius);
            return Math.PI * Math.pow(this.radius, 2);
        }
    };
    console.log(literalCircle.getArea());
```
        Results: 
        20
        1256.63706143