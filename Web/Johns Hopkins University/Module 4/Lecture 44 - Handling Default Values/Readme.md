### Handling Default Values

```js
    function orderChickenWith(sideDish) {
        console.log("Chicken with " + sideDish);
    }
    orderChickenWith("noodles");
```
        Result:
        Chicken with noodles



```js
    function orderChickenWith(sideDish) {
        console.log("Chicken with " + sideDish);
    }
    orderChickenWith();
```
        Result:
        Chicken with undefined

   
        
<br>

###### 

```js
    function orderChickenWith(sideDish) {
        if (sideDish === undefined) {
            sideDish = "whatever!";
        }
        console.log("Chicken with " + sideDish);
    }
    orderChickenWith("noodles");
    orderChickenWith();
```
        Result:
        Chicken with noodles
        Chicken with whatever!

   
<br>



###### Less Verbose Form:

```js
    function orderChickenWith(sideDish) {
        sideDish = sideDish || "whatever!!";
        console.log("Chicken with " + sideDish);
    }
    orderChickenWith("noodles");
    orderChickenWith();
```
        Result:
        Chicken with noodles
        Chicken with whatever!!
   

*In 'sideDish = sideDish || "whatever!!" the second sideDish will be false and 'whatever' will take place*

###### 

```js
    true    ||  false;
    ""      ||  true;
    "hello" ||  "";
    ""      ||  "hello";
```
        Result:
        true
        true
        "hello"
        "hello"

   
<br>