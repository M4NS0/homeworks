// Classes allow us to create Blueprints for objects
// In Angular 2 classes are used a lot!
// Components, Services, Directives, Pipes...

// Class Creation:

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

// Instantiate an Objectfrom a class
let car = new Car(5);
car.accelerate(); // going to accelerate to 6
car.getSpeed();   // prints the acceleration
console.log(Car.numberOfWheels()); // prints the number of wheels that was inniciate inside the method