### Creating Objects Using '*New Object()*' Syntax - Part II
[Link to Lesson](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/z3Anw/lecture-45-part-2-creating-objects-using-object-literal-syntax)
###### Less Verbose Syntax: Object Literal

``` js
    var company = {
    name: "Big Hiccups Soluções",
    ceo: {
            firstName: "Bruno",
            personalSite: "https://m4ns0.github.io/"
        }
    };      
```

> Object Literal:

``` js
    { firstName: "Bruno", personalSite: "https://m4ns0.github.io/" }
```

> Name Value Pair:

``` js
    ceo: { ... }
```
> Example:

``` js
    var company = {
        name: "Big Hiccups Soluções",
        ceo: {
            firstName: "Bruno",
            personalSite: "https://m4ns0.github.io/"
        },
        "Stock of company": 110
    };
    console.log(company);
    console.log(company.ceo.firstName);
```

        Results:
        Object { name: "Big Hiccups Soluções", ceo: {…}, "Stock of company": 110 }
        Bruno
