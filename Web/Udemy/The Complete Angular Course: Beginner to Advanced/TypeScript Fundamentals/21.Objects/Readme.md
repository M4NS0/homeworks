### Objects

```ts
    class Point {
        x: number;
        y: number;

        // Methods
        draw() {
            console.log('X: ' + this.x + ', Y: ' + this.y);
        }
        getDistance(another: Point) {
            // ... logic to get the distance between two points
        }
    }

    let point = new Point(); // same as:  let point: Point = new Point()
    point.x = 3;
    point.y = 4;
    point.draw();
```

<br>

#### Transpiling:
```sh
    sudo npm install -g typescript
    tsc main.ts | node main.js
```





