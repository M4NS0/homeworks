// let drawPoint = (a,b,c,d,e,f,g,h) => {   // bad practice!
    // ... }

// Proprerties must be encapsulated inside objects

let drawPoint = (point) => {
    //...
}
drawPoint({
    x: 1,
    y: 2
})

drawPoint = (point: {x: number, y: number}) => { // this is an inline annotation, better way to do that is making an interface
    //..
}
drawPoint({
    x: 2,
    y: 3
})

// interface
// defines the shape of an object
// Name of interface are capitalize
interface Point {
    x: number,
    y: number
}

drawPoint = (point: Point) => {
}

drawPoint({   
    x: 1,
    y: 2
})