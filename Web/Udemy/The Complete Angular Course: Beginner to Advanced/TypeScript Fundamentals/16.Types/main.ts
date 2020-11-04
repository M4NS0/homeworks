let count = 5;  // by hovering the variable, the message should be shown: 'let count: number'
// count = 'a'; // Type 'string' is not assignable to type 'number' 
                // No Error will be shown in JS after transpiling 
   
// let a;
// a = 1;
// a = true;
// a = 'a';

let a: number;
let b: boolean;
let c: string;
let d: any;
let e: number[] = [1,2,3];
let f: any[] = [1, 'Bob', true, 0.001];

// Enums

const ColorRed = 0;
const ColorGreen = 1;
const ColorBlue = 2;

enum Color { Red, Green, Blue };
let background = Color.Red;

enum Color { Gray = 3, Black = 4, Purple = 5};