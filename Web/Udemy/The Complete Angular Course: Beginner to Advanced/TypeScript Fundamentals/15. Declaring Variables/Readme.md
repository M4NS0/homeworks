### Declaring Variables

2 ways to declare a variable:

```ts
    var number  = 1;
    let count   = 2;
```

```ts
    function doSomething() {
        for (let i = 0; i < 5; i ++) {  // using the let instead var an error will be shown on the i....
            console.log(i)
        }
        console.log('Finally: ' + i )   
                               // ^ this i. But when it is transpiled, it is successeful and it's a runnable JS code
                               // but an error should be shown while it's transpiled TS to JS
   }       
    doSomething();
```

#### Transpiling:
```sh
    sudo npm install -g typescript
    tsc *.ts && node main.js
```

