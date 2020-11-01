### TypeScropt
-Is a superset to JavaScript
-Classes, interfaces, strong typing
-Dynamic typing
-It's compiled to JavaScript
-Assinging types to variable is not possible in JavaScript

##### Types:
```ts
    let myString: string;
    myString = 'This is a String';

    // can't assign numbers anymore
    // myString = 4; 
    // Error - Type 'number' is not assignable to type 'string'.

    let anotherString = 'This is a string';

    let yetAnotherString;          // Will allow any type, but avoid to doing it
    
    yetAnotherString = 'This is a String';

    yetAnotherString = 4;


    let aString: string;
    let aNumber: number;
    let aBoolean: boolean;
    let anArray: Array<String>;    // Generic Type <String>
    let anything: any;             // When the variable is unknown type

```

##### Classes:
-Classes allow us to create Blueprints for objects
-In Angular 2 classes are used a lot!
-Components, Services, Directives, Pipes...
-To create a class, see bellow:


```ts

    class Car {
        engineName: string;
        gears: number;
        private speed: number;

        constructor(speed: number) {
            this.speed = speed || 0;
        }

        accelerate(): void {
            this.speed++;
        }
        throttle(): void {
            this.speed--;
        }
        getSpeed(): void {
            console.log(this.speed);
        }
        static numberOfWheels(): number {
            return 4;
        }
    }

    // Instanting an Object from a class
    let car = new Car(5);
    car.accelerate();                   // going to accelerate to 6
    car.getSpeed();                     // prints the acceleration
    console.log(Car.numberOfWheels());  // prints the number of wheels that was inniciate inside the method
```

> to compile: tsc Classes.ts
> to run: use the Classes.js

##### Interfaces:

-Allow us to create contracts other classes/objects that have to implents
-Communicates between several objects
-Used to defining custom types without creating classes
-Interfaces are not compiled to JavaScript! It's just for checking /validation done by our TypeScript compiler

```ts

    interface User {
        username: string;
        password: string;
        confirmPassword?: string; // Opitional property, don't have to be implemented // Not required
    }

    let user:User; // user assigned

    // user = {anything: 'anything', anynumber: 5} // This value dows not satisfy the interface => compilation error // IDE will refuse it


    user = { username: 'Jimmy', password: 'areUexperienced?'}; // This value does not satisfy the interface

    interface CanDrive { 
        accelerate(speed:number): void;
    }

    let car:CanDrive = {
        accelerate: function (speed:number) {
            // ...
        }
    };

```

> After compiling, in JavaScript, the interface will disapear:

```js
    var user; 

    user = { username: 'Jimmy', password: 'areUexperienced?' };
    var car = {
        accelerate: function (speed) {
            // ...
        }
    };
```

