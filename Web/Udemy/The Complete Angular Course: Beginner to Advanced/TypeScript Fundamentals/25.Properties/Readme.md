### Properties

To access values inside a class method with a private atribute, there are some ways, see bellow:

```ts
    // creating a method that passes its values outsite the class: 

    class PointB {
        
        constructor(private x?: number, public y?: number) {   
        }

        // Method:
        draw() {
            console.log('X: ' + this.x + ', Y: ' + this.y);
        }

        getX() {
            return this.x;
        }

        setX(value) {
            if (value <0)
            throw new Error('Value cannot be less than 0.');

            this.x = value;

        }
    }

    let pointB = new PointB(1,2); 
    pointB.y = 5;
    // pointB.x = 4;        // can't be setup again, it's private
    let x = pointB.getX();  // this is a get method // using the method, it can be accessed
    pointB.setX(10)         // this is a set method

```

The other way is using proprieties of a method, as bellow:

```ts
    class PointB {
        
        constructor(private x?: number, public y?: number) {   
        }

        // Method:
        draw() {
            console.log('X: ' + this.x + ', Y: ' + this.y);
        }
    
        get X() {               // this is a method with get property 
                                // must be in uppercase because 
                                // TS brings up the constructed variables: 
                                // (private x?: number, public y?: number)
                    
            return this.x;
        }

        
        set X(value) {          // this is a method with set property
            if (value <0)
            throw new Error('Value cannot be less than 0.');

            this.x = value;

        }
    }

    let pointB = new PointB(1,2); 
    pointB.y = 5;
    // pointB.x = 4;            // can't be setup again, because is private

    let x = pointB.X;           // this is a getter
    pointB.X = 10;              // this is a setter

```

To solve this issue is a good practice is prefixing the variables in constructor with a underline:

```ts
    class PointB {
        
        constructor(private _x?: number, public _y?: number) {   
        }

        // Method:
        draw() {
            console.log('X: ' + this._x + ', Y: ' + this._y);
        }

        get x() {           // this is a method with lowercase name 
                            // without any confusion with the constructed variables
                            // contains a get property
            return this._x;
        }

        set x(value) {      // this is a method with lowercase name 
                            // without any confusion with the constructed variables
                            // contains a set property
            if (value <0)
            throw new Error('Value cannot be less than 0.');

            this._x = value;

        }
    }

    let pointB = new PointB(1,2); 
    pointB._y = 5;
    // pointB.x = 4;    // can't be setup again
    let x = pointB.x;   // this is a getter
    pointB.x = 10;      // this is a setter

```

<br>

#### Transpiling:
```sh
    sudo npm install -g typescript
    tsc *.ts && node main.js
```

