### Modules

Both modules will communicate with each other

Module 1: 
```ts
    // main.ts
    import {PointC} from './pointC';

    let pointC = new PointC(1,2);
    pointC.draw();

```
Module 2: 
```ts
    // pointC.ts
    export class PointC {

        constructor(private x?: number, public y?: number) {   
        }

        draw() {
            console.log('X: ' + this.x + ', Y: ' + this.y);
        }
    }
```

<br>

#### Transpiling:
```sh
    sudo npm install -g typescript
    tsc *.ts && node main.js
```
