// How to prevent changing variables after initialize?
// public - default
// private 
// protected

class Point {
    private x: number;
    y: number;

    // Constructor:

    // constructor(x: number, y: number) {
    constructor(x?: number, y?: number) {   // ? means that this is a variable with opitional values
        this.x = x;
        this.y = y;
    }

    // Method:
    draw() {
        console.log('X: ' + this.x + ', Y: ' + this.y);
    }
}

let point = new Point(1,2); 
// point.x = 3; // Property 'x' is private and only accessible within class 'Point'.
point.y = 5;

point.draw();