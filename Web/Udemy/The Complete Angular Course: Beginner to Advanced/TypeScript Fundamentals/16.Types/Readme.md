### Types

```ts
    let count = 5;  // by hovering the variable, the message should be shown: 'let count: number'
    // count = 'a'; // Type 'string' is not assignable to type 'number' 
                    // No Error will be shown in JS after transpiling 
    
    // let a;
    // a = 1;
    // a = true;
    // a = 'a';

    let a: number;
    let b: boolean;
    let c: string;
    let d: any;
    let e: number[] = [1,2,3];
    let f: any[] = [1, 'Bob', true, 0.001];

    // Enums

    const ColorRed = 0;
    const ColorGreen = 1;
    const ColorBlue = 2;

    enum Color { Red, Green, Blue };
    let background = Color.Red;

    enum Color { Gray = 3, Black = 4, Purple = 5};
```

###### this code transpiled to JS:

```js
    var a;
    var b;
    var c;
    var d;
    var e = [1, 2, 3];
    var f = [1, 'Bob', true, 0.001];

    var ColorRed = 0;
    var ColorGreen = 1;
    var ColorBlue = 2;
    var Color;

    (function (Color) {
        Color[Color["Red"] = 0] = "Red";
        Color[Color["Green"] = 1] = "Green";
        Color[Color["Blue"] = 2] = "Blue";
    })(Color || (Color = {}));
    ;
    var background = Color.Red;
    (function (Color) {
        Color[Color["Gray"] = 3] = "Gray";
        Color[Color["Black"] = 4] = "Black";
        Color[Color["Purple"] = 5] = "Purple";
    })(Color || (Color = {}));
    ;

```

<br>

#### Transpiling:
```sh
    sudo npm install -g typescript
    tsc main.ts | node main.js
```
