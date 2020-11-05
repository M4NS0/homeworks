### Classes

Class are groups of variables (properties) and functions(methods) that are highly related

```ts
    // Name of class is capitalize
    class Point {
        x: number;
        y: number;

        // Methods are inner functions of a Class: 
        draw() {
            // ... logic for drawing a point
        }
        getDistance(another: Point) {
            // ... logic to get the distance between two points
        } 
    }
```


<br>

#### Transpiling:
```sh
    sudo npm install -g typescript
    tsc main.ts | node main.js
```
