class PointB {
       
    constructor(private _x?: number, public _y?: number) {   
    }

    // Method:
    draw() {
        console.log('X: ' + this._x + ', Y: ' + this._y);
    }

    get x() {
        return this._x;
    }

    set x(value) {
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
