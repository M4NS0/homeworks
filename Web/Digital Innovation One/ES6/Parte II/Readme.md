### Tipos e Variáveis
-string
-number
-boolean
-null
-undefined
-Symbol

-Object
-Function
-Array

#### Strings

```js
    const textSize = "Texto".length;
    console.log (`Retorna o tamanho da string (.length)
                \nAceita Regex
                \nQuantidade de letras da palavra "Texto" é "${textSize}"`);

    const splittedText = 'Texto'.split('x');
    console.log('\nRetorna um array quebrando a string por um delimitador (.split)' +
                '\nSintaxe: .split(referencia)' +
                '\nArray com as posições separadas pelo delimitador x da palavra "Texto":', splittedText);

    const replacedText = 'Texto'.replace('Text', 'txeT');
    console.log('\nBusca por um valor e substitui por outro' +
                '\Sintaxe: n.replace(novo texto)' + 
                '\nSubstituindo valores "Text" por "txeT": ' , replacedText);

    const lastChar = 'Texto'.slice(-1);
    console.log('\nRetorna a fatia de um valor' + 
                '\nSintaxe: .slice(start,end)' + 
                '\nRetornando a última letra da string "Texto": ', lastChar);

    const allWithoutLastChar = 'Texto'.slice(0, -1);
    console.log('\nRetorna a fatia de um valor' + 
                '\nSintaxe: .slice(start,end)' + 
                '\nRetornando todas as letras da palavra "Texto" menos a última: ', allWithoutLastChar);

    const secondToEnd = 'Texto'.slice(1);
    console.log('\nRetorna a fatia de um valor' + 
                '\nSintaxe: .slice(start,end)\nRetornando a palavra "Texto" da segunda letra até a última: ',secondToEnd);

    const twoCharsBeforeFirstPosition = 'Texto'.substr(0,2);
    console.log('\nRetorna "n" caracteres apartir de uma posição' + 
                '\nSintaxe: .slice(começo, quantidade de caracteres)\n' + 
                'As duas primeiras letras da palavra "Texto": ', twoCharsBeforeFirstPosition);
```

#### Numbers
```js
    const myNumber = 12.345454;

    const numberAsString = myNumber.toString();
    console.log('Transformar número em String.' + 
                '\nSintaxe: variavelNumerica.toString()' + 
                `\nTransformando número ${myNumber} em uma string: "${myNumber.toString()}"`);

    console.log('\nSaber o tipo de uma variável' +
                '\nSintaxe: typeof variável' + 
                `\nO tipo da variável myNumber(${myNumber}) é "${typeof myNumber}" ` +
                `\nO tipo da variável numberAsString(${numberAsString}) é "${typeof numberAsString}" `);

    const fixedTwoDecimals = myNumber.toFixed(2);
    console.log('\nRetorna quantidade de decimais de um número' + 
                '\nSintaxe: variavelNumérica.tofixed(quantidade de casas decimais)' +
                `\nO número ${myNumber} com apenas duas casas decimais é: ${fixedTwoDecimals}`);

    const numericString = '123.45';
    console.log('\nTransformando uma String em Float' + 
                '\nSintaxe: parseFloat(string numérico entre aspas simples)' +
                `\nA string "${numericString}" transformada para float: ${parseFloat(numericString)}` +
                `\nO tipo da String transformada para float agora é: ${typeof parseFloat(numericString)}`);


    console.log('\nTransformando uma String em Inteiro' + 
                '\nSintaxe: parseInt(string numérico entre aspas simples)' +
                `\nA string "${numericString}" transformada para inteiro: ${parseInt(numericString)}` + 
                `\nO tipo da String transformada para inteiro agora é: ${typeof parseInt(numericString)}`);
```
#### Null

```js
    const nullVariable = null;

    console.log('Variável nula' + 
                `\nO tipo da variável nullVariable é: ${typeof nullVariable}`);
```

#### Undefined

```js 
    let undefinedVariable;

    console.log('Variável indefinida' + 
                `\nO tipo da variável undefinedVariable é: ${typeof undefinedVariable}`);
```

#### Boolean

```js
    const isActive = true;
    const isAuthenticated = false;

    console.log(`O tipo de variável de "isActive" é ${typeof isActive}`);
```

#### Objects

```js
    let user = { 
        name: 'Jimmy'
        }

    console.log(`${user.name}`);

    // Alterando propriedades do Objeto
    user.name = 'nome alterado 1';
    console.log(`${user.name}`);

    user[`name`] = 'James';
    console.log(`${user.name}`);


    const newProp = 'instrument';
    console.log(`${newProp}`);

    user[newProp] = 'Guittar';
    console.log(`${user.instrument}`);

    function getProp() {
    console.log(`${user.instrument}`)
    }
    getProp();

    // Criando uma propriedade nova usando objeto criado
    user.lastname = 'Marshall Hendrix';
    console.log(`${user.name} ${user.lastname} plays ${user.instrument}`);

    // Deletando objeto
    delete user.name;
    console.log(`${user.name}`)
```
> *Resultados:* 
> Jimmy
> nome alterado 1
> James
> instrument
> Guittar
> James Marshall Hendrix plays Guittar
> undefined