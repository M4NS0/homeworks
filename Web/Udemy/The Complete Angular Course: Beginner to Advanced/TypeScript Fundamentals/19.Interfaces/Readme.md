### Interfaces
    ```ts
    // let drawPoint = (a,b,c,d,e,f,g,h) => {   // bad practice!
        // ... }

    // Proprerties must be encapsulated inside objects

    let drawPoint = (point) => {
        //...
    }
    drawPoint({
        x: 1,
        y: 2
    })

    drawPoint = (point: {x: number, y: number}) => { // this is an inline annotation, better way to do that is making an interface
        //..
    }
    drawPoint({
        x: 2,
        y: 3
    })

    // interface
    // defines the shape of an object
    // Name of interface is capitalize
    interface Point {
        x: number,
        y: number
    }

    drawPoint = (point: Point) => {
    }

    drawPoint({   
        x: 1,
        y: 2
    })
```
In function bellow, we canno't move those 2 functions inside the interface
Interfaces are purely for declarations it canno't include implementation
But interfaces can hold a signature of a function:

```ts
    interface Point {
    x: number,
    y: number,
    // Signature of a function:
    draw: () => void;  /// takes no parameters and returns void, does not return anything
    }

    drawPoint = (point: Point) => {
    }

    let getDistance = (pointA: Point, pointB: Point) => {
        // ...
    }

    drawPoint({   
        x: 1,
        y: 2
    })
```

<br>

#### Transpiling:
```sh
    sudo npm install -g typescript
    tsc main.ts | node main.js
```