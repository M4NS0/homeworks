### Creating Objects Using '*New Object()*' Syntax - Part I
[Link to Lesson](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/JEVy8/lecture-45-part-1-creating-objects-using-new-object-syntax)
An object is, again, a collection of name-value pairs.

<br>

###### Object Creation Syntax:

```js
    var company = new Object();
    company.name = "Big Hiccups Suluções";
    console.log(company);
```
        Result:
        Object { name: "Big Hiccups Suluções" }


> When a property doesn't exist and you simply mention that 
> property in an object, JavaScript engine creates that property

```js
    var company = new Object();
    company.name = "Big Hiccups Suluções";
    company.ceo.firstname = "Bruno";
    console.log(company);
```

        Result:
        Uncaught TypeError: company.ceo is undefined

> The 'ceo' object  must be created, unless the error will persist

```js
    var company = new Object();
    company.name = "Big Hiccups Suluções";
    company.ceo = new Object();
    company.ceo.firstname = "Bruno";
    console.log(company);
```

        Result:
        Object { name: "Big Hiccups Suluções", ceo: Object { firstname: "Bruno" }



```js
    var company = new Object();
    company.name = "Big Hiccups Suluções";
    company.ceo = new Object();
    company.ceo.firstName = "Bruno";
    company.ceo.personalSite = "https://m4ns0.github.io/";

    console.log("Company  Name: "  + company.name           + "\n" +
            "Company CEO  Name: "  + company.ceo.firstName  + "\n" +
            "CEO Personal site: "  + company.ceo.personalSite);
```
        Result:
        Company Name: Big Hiccups Suluções
        Company CEO name: Bruno
        CEO Personal site: https://m4ns0.github.io/


```js
    console.log(company["name"]);
```
        Result:
        Big Hiccups Suluções

```js
    company["Stock of Company"] = 110;
    console.log("Stock price: " + company["Stock of Company"]);
```
        Result
        Stock price: 110

```js
    var StockPropName = "Stock of Company";
    company[StockPropName] = 110;
    console.log("Stock price is " + company["Stock of Company"]);
```
        Result
        Stock price: 110

```js

```