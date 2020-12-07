### ES6

###### Let 

```js
    var serie = 'Mad Man';

    if(true) {
        // var serie = 'serie' // erro:  não funcionaria
        let serie = 'Breaking Bad';
        console.log(serie);
    }
    console.log(serie);

```
> Resposta:
<br>
Mad Man
Breaking Bad
<br>

###### Const
Certifica que a variavel vai se manter a mesma durante todo o código
```js
    const serie = 'Mad Man';
    // serie = 'Rome'; // erro: não funcionaria pois const nao pode ser reescrita
```


###### Arrow Functions

```js

var dobroDoValor = function(numero) {
    return numero * 2;
}

console.log(dobroDoValor(7));
```

> Resposta:
14

<br>

Refactoring em arrow-Function:

```js

var dobroDoValor = numero => {
    return numero * 2;
}

console.log(dobroDoValor(7));
```
<br>

Refatorando novamente:

```js

var dobroDoValor = (numero) => numero * 2;

```
<br>

Outra Forma:

```js
var dobroDoValor = numero => {
    let resultado = numero * 2
    return resultado
}

console.log(dobroDoValor(7));

```
