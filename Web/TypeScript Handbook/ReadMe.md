
### TypeScript Handbook
>From: https://www.typescriptlang.org/docs/handbook/basic-types.html

>For programs to be useful, we need to be able to work with some of the simplest units of data: 
>numbers, strings, structures, boolean values, and the like. In TypeScript, we support the same 
>types as you would expect in JavaScript, with an extra enumeration type thrown in to help things along.

>You can also use template strings, which can span multiple lines and have embedded expressions. 
>These strings are surrounded by the backtick/backquote (`) character, and embedded expressions are of the form ${ expr }.

```ts
    let fullName: string = `Bob Bobbington`;
    let age: number = 37;
    let sentence: string = `Hello, my name is ${fullName}. I'll be ${age + 1} years old next month.`;
    ```

    >This is equivalent to declaring sentence like so:
    ```ts
    let sentence2: string = "Hello, my name is" +
        fullName +
        ".\n\n" +
        "I'll be " +
        (age + 1) +
        " years old next month.";
```

#### Arrays
>TypeScript, like JavaScript, allows you to work with arrays of values. Array types can be written in one of two ways. 
>In the first, you use the type of the elements followed by [] to denote an array of that element type:
```ts
    let list: number[] = [1, 2, 3];
```
>The second way uses a generic array type, Array<elemType>:
```ts
    let list2: Array<number> = [1, 2, 3];
```
#### Tuple
>Tuple types allow you to express an array with a fixed number of elements whose types are known, 
>but need not be the same. For example, you may want to represent a value as a pair of a string and a number:

>Declare a tuple type:
```ts
    let x: [string, number];
```
>Initialize it:
```ts
    x = ["hello", 10];
    // x = [10, "hello"]; // Error =>  Type 'string' is not assignable to type 'number'. // Type 'number' is not assignable to type 'string'.
```
>When accessing an element with a known index, the correct type is retrieved:
```ts
    console.log(x[0].substring(1));
    //console.log(x[1].substring(1)); // Error => Property 'substring' does not exist on type 'number'. 
```
>Accessing an element outside the set of known indices fails with an error:
```ts
    // x[3] = "world";  // Type '"world"' is not assignable to type 'undefined'. 
    // Tuple type '[string, number]' of length '2' has no element at index '3'

    // console.log(x[5].toString());   // Object is possibly 'undefined'
    // Tuple type '[string, number]' of length '2' has no element at index '5'.
```

#### Enum
>A helpful addition to the standard set of datatypes from JavaScript is the enum. As in languages like C#, 
>an enum is a way of giving more friendly names to sets of numeric values.
```ts
    enum Color {
        Red,
        Green,
        Blue
    }
    let c: Color = Color.Green;
```
>By default, enums begin numbering their members starting at 0. 
>You can change this by manually setting the value of one of its members. 
>For example, we can start the previous example at 1 instead of 0:
```ts
    enum Color2 {
        Red = 1,
        Green,
        Blue
    }
    let c2: Color2 = Color2.Green;
```

>A handy feature of enums is that you can also go from a numeric value to the name of that value in the enum. 
>For example, if we had the value 2 but weren’t sure what that mapped to in the Color enum above, we could look up the corresponding name:
```ts
    enum Color3 {
        Red = 1,
        Gree,
        Blue
    }
    let colorName: string = Color3[2];
    console.log(colorName);
```

#### Unknown
>We may need to describe the type of variables that we do not know when we are writing an application. 
>These values may come from dynamic content or we may want to intentionally accept all values in our API.
>In these cases, we want to provide a type that tells the compiler and future readers that this variable 
>could be anything, so we give it the unknown type.

```ts
    let notSure: unknown = 4;
    notSure = "maybe a string instead";
    notSure = false;
```
>If you have a variable with an unknown type, you can narrow it to something more specific by doing typeof checks, 
>comparison checks, or more advanced type guards that will be discussed in a later chapter:
```ts
    declare const maybe: unknown; // maybe coud be a string, object, boolean, number....
    // const aNumber: number = maybe; // Type 'unknown' is not assignable to type 'number'.

    if (maybe === true) {
        // TypeScript knows that maybe is a boolean now
        const aBoolean: boolean = maybe;
        // So, it cannor be a string
        // const aString: string = maybe; // Type 'boolean' is not assignable to type 'string'.
    }

    if (typeof maybe === "string") {
        // TypeScript knows that maybe is a string now
        const aString: string = maybe;
        // So it cannot be boolean
        // const aBoolean: boolean = maybe; // Type 'string' is not assignable to type 'boolean'.
    }
```

#### Any
>In some situations, not all type information is available or its declaration would take an 
>inappropriate amount of effort. These may occur for values from code that has been written 
>without TypeScript or a 3rd party library. In these cases, we might want to opt>out of type 
>checking. To do so, we label these values with the any type:

```ts
    declare function getValue(key: string): any; // Ok, return value of getValue is not checked,
    const str: string = getValue("myString");
```

>The any type is a powerful way to work with existing JavaScript, allowing you to gradually
>opt-in and opt-out of type checking during compilation.

>Unlike unknown, variables of type any allow you to access arbitrary properties, even ones 
>that don’t exist. These properties include functions and TypeScript will not check their
>existence or type:

```ts
    let looselyTyped: any = 4;
    // Ok, ifItExists might exist at runtime
    looselyTyped.ifItExists();
    // Ok, toFixed exists(but the compiler does not check)
    looselyTyped.toFixed();

    let strictlyTyped: unknown = 4;
    >strictlyTyped.toFixed(); // Property 'toFixed' does not exist on type 'unknown'.

    >The any will continue to propagate through your objects:
    let looselyTyped2: any = {};
    let d = looselyTyped2.a.b.c.d;
    //  ^ = let d: any
```
#### Void
>void is a little like the opposite of any: the absence of having any type at all. 
>You may commonly see this as the return type of functions that do not return a value:

```ts
    function warnUser() : void {
        console.log("This is my warning message");
    }
```
>Declaring variables of type void is not useful because you can only assign null 
>(only if >strictNullChecks is not specified, see next section) or undefined to them:
```ts
let unusable: void = undefined;