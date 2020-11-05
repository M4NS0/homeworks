### Arrow Functions

```ts
    let newLog = function (msg) { 
        console.log(msg);
    }

    // let doLog = (msg) => {
    //     console.log(msg);
    // } 
    // same as: 

    let doLog = (msg) => console.log(msg);

    // syntax: 
    // let variable = ( ) => method ( );
```

<br>

#### Transpiling:
```sh
    sudo npm install -g typescript
    tsc *.ts && node main.js
```
