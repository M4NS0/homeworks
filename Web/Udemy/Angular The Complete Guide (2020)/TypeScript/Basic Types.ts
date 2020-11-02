
let myString: string;
myString = 'This is a String';

// can't assign numbers anymore
// myString = 4; 
// Error - Type 'number' is not assignable to type 'string'.

let anotherString = 'This is a string';

let yetAnotherString; // Will allow any type, but avoid to doing it 
// Variable 'yetAnotherString' implicitly has an 'any' type, but a better type may be inferred from usage.

yetAnotherString = 'This is a String';

yetAnotherString = 4;


let aString: string;
let aNumber: number;
let aBoolean: boolean;
let anArray: Array<String>; // Generic Type <String>
let anything: any; // When the variable is unknown type

let isDone: boolean = false;
let decimal: number = 6;
let hex: number = 0xf00d;
let binary: number = 0b1010;
let octal: number = 0o744;
// let big: bigint = 100n; // Error => BigInt literals are not available when targeting lower than ES2020.

let color: string = "blue";
color = "red";
