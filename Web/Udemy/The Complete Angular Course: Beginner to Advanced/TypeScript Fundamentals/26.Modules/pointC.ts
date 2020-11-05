// Module 2

export class PointC {
    constructor(private x?: number, public y?: number) {   
    }

    draw() {
        console.log('X: ' + this.x + ', Y: ' + this.y);
    }
}