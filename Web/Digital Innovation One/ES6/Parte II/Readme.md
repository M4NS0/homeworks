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
>
> nome alterado 1
>
> James
>
> instrument
>
> Guittar
>
> James Marshall Hendrix plays Guittar
>
> undefined

```js
    const user = {
        name: 'Jimmy',
        lastName: 'Hendrix'
    }

    // Recuperar as chaves do objeto
    console.log('Propriedades do Objeto user: ', Object.keys(user));

    // Recuperar os valores das chaves
    console.log('\nValores das propriedades do Objeto user: ', Object.values(user));

    // Retorna um array de arrays contendo [name_prop, valor_prop]
    console.log('\nLista de propriedades e valores', Object.entries(user));

    // Juntar propriedades
    Object.assign(user, { fullname: 'James Marshal Hendrix' });

    console.log('\nAdicionando a propriedade fullname no Objeto user: ', user);
    console.log('\nRetorna um novo Objeto juntando dois ou mais objetos', Object.assign({}, user, { age: 27 }));
    console.log('\nObjeto antigo:' + Object.values(user));

    // Previne todas as alterações em um objeto
    const newObj = { foo: 'bar' };
    Object.freeze(newObj);

    newObj.foo = 'changes';
    delete newObj.foo;
    newObj.bar = 'foo';

    console.log('\nVariável newObj após alterações: ', newObj);

    // Permite apenas a alteração de propriedades existentes em um objeto mas não permite a adição de novo atributo
    const person = { name: 'Jimmy'};
    Object.seal(person);

    person.name = 'James';
    delete person.name;
    person.age = 27;

    console.log('\nVariável person após alterações: ', person);
``` 
> Resultados:
>
> Propriedades do Objeto user:  [ 'name', 'lastName' ]
>
> Valores das propriedades do Objeto user:  [ 'Jimmy', 'Hendrix' ]
>
> Lista de propriedades e valores [ [ 'name', 'Jimmy' ], [ 'lastName', 'Hendrix' ] ]
>
> Adicionando a propriedade fullname no Objeto user:  { name: 'Jimmy',
>  lastName: 'Hendrix',
>  fullname: 'James Marshal Hendrix' }
>
>Retorna um novo Objeto juntando dois ou mais objetos { name: 'Jimmy',
>  lastName: 'Hendrix',
>  fullname: 'James Marshal Hendrix',
>  age: 27 }
>
> Objeto antigo:Jimmy,Hendrix,James Marshal Hendrix
>
> Variável newObj após alterações:  { foo: 'bar' }
>
> Variável person após alterações:  { name: 'James' }

#### Symbols

```js
    const symbol1 = Symbol();
    const symbol2 = Symbol();

    // Symbols são únicos
    console.log('symbol1 é igual a symbol2:', symbol1 === symbol2);

    // Previnir conflito entre nomes e de propriedades
    const nameSymbol1 = Symbol('name');
    const nameSymbol2 = Symbol('name');

    const user = { 
        [nameSymbol1]: 'Jimmy',
        [nameSymbol2]: 'James',
        lastname: 'Marshal Hendrix'
    }
    console.log();
    console.log(user);

    // Symbols criam propriedades que não são enumberables
    for (const key in user) {
        if (user.hasOwnProperty(key)) {
            console.log(`\nValor da chave ${key}: ${user[key]}`)
        }
    }
    console.log('\nPropriedades do objeto user: ', Object.keys(user));
    console.log('\nValores das propriedades do objeto user', Object.values(user));

    // Exibir Symbols de um objeto
    console.log('\nSymbols registrados no objeto user: ', Object.getOwnPropertySymbols(user));

    // Acessando todas as propriedades do objeto
    console.log('\nTodas propriedades do objeto user: ', Reflect.ownKeys(user));

    // Criar um enum
    const directions = {
        UP      :Symbol( 'UP' ),
        DOWN    :Symbol( 'DOWN'),
        LEFT    :Symbol( 'LEFT'),
        RIGHT   :Symbol( 'RIGHT')
    };
```
> Results
>
> symbol1 é igual a symbol2: false
>
> { lastname: 'Marshal Hendrix',
>  [Symbol(name)]: 'Jimmy',
>  [Symbol(name)]: 'James' }
>
> Valor da chave lastname: Marshal Hendrix
>
> Propriedades do objeto user:  [ 'lastname' ]
>
> Valores das propriedades do objeto user [ 'Marshal Hendrix' ]
>
> Symbols registrados no objeto user:  [ Symbol(name), Symbol(name) ]
>
> Todas propriedades do objeto user:  [ 'lastname', Symbol(name), Symbol(name) ]


#### Arrow Functions

```js
    function fn() {
        return 'Code here';
    }

    const arrowFn = () => 'Code here';
    const arrowFn2 = () => {
        // mais uma expressão
        return 'Code here';
    };

    // Funções também são objetos
    fn.prop = 'Posso criar propriedades';

    console.log(fn());
    console.log(fn.prop);

    // Receber parâmetros
    const logValue = value => console.log(value);
    const logFnResult = fnParam => console.log(fnParam());

    logFnResult(fn);

    // Receber e retornar Funções
    const controlFnExec => fnParam => allowed => {   // erro de sintaxe no primeiro => (erro do professor)
        if (allowed) {
            fnParam();
        }
    }

    const handleFnExecution = controlFnExec(fn);
    handleFnExecution(true); // Executará a função fn
    handleFnExecution(); // Não executara a função fn

    // controlFnExec como função
    function controlFnExec(fnParam) {
        return function(allowed) {
            if (allowed) {
                fnParam();
            }
        }
    }
```
> Resultados:
>
> Code here
> Posso criar propriedades
> Code here

```js
    (() => {
        this.name = 'Arrow Function';   
        const getNameArrowFn = () => this.name;  // Atribui por arrow function o this.name ('Arrow Function') em getNameArrowFn 
        
        function getName() {
            return this.name; // o this irá referenciar a função em getName içada abaixo
        }
        
        const user = {   // memoriza valores para serem acessados  tanto por getNameArrowFn quanto getName
            name: 'Nome no objeto de execução',
            getNameArrowFn, // ou getNameArrowFn: getNameArrowFn,   // já atribuido no arrowfunction acima
            getName         // ou getName: getName                  // acabou de ser atribuido na variavel em name
        }
        
        console.log(user.getNameArrowFn());
        console.log(user.getName());
    })();
```

#### Arrays
```js 
    const users = ['Bob', 'Alice'];

    const gender = { 
        MAN: Symbol('M'),
        WOMAN: Symbol('W')

    }

    const persons = [
        {
            name: 'Bob',
            age: 22,
            gender: gender.MAN
        },
        {
            name: 'Alice',
            age: 19,
            gender: gender.WOMAN
        }
    ]
    // Retornar quantidades de itens no array
    console.log('Items: ', persons.length);

    // Verificar se é um array
    console.log('A variável persons é um array: ', Array.isArray(persons));

    // Iterar os itens do array
    persons.forEach((person, index, arr) => {
        console.log(`\nNome: ${person.name} index: ${index}`, arr);
    });

    // Filtrar Array
    const mens = persons.filter(person => person.gender === gender.MAN);
    console.log('\nNova lista apenas com homens: ', mens);

    // Retornar um novo
    const personsWithCourse = persons.map(person => { 
        person.course = 'Introdução ao JavaScript';
    });

    console.log('\nPessoas com a adição do course: ' , personsWithCourse);

    // Transfomar array em outro tipo
    const totalAge = persons.reduce((age,person) => {
        age += person.age;
        return age;
    }, 0);

    console.log('\n');
```

9:40