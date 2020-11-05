
// let msg = 'abc';
let msg;  // let msg: any. Variable 'msg' implicitly has an 'any' type, but a better type may be inferred from usage.
msg = 'abc';
let endsWithC = msg.endsWith('c');  // if the type is not defined, intellisense would't work at all

// Type Assertions is when you define the type of variable to make TS understands it 
let endsWithC2 = (<string>msg).endsWith('c'); 
// now the intellisense will help to complete the code, (same as the cast java function?)

// Another Way:
let alternativeWay = (msg as string).endsWith('c');