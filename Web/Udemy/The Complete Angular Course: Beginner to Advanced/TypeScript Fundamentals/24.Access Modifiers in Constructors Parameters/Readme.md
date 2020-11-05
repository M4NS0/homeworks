### Access Modifiers in Constructors Parameters

```ts
    class PointA {
        
        constructor(private x?: number, public y?: number) {   
        }

        // Method:
        draw() {
            console.log('X: ' + this.x + ', Y: ' + this.y);
        }
    }

    let pointA = new PointA(1,2); 
    pointA.y = 5;
    // pointA.x - 4; // no access to x - Property 'x' is private and only accessible within class 'PointA'.

    pointA.draw();

```


<br>

#### Transpiling:
```sh
    sudo npm install -g typescript
    tsc *.ts && node main.js
```



