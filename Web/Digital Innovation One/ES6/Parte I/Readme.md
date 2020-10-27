### ES6

###### Links Úteis:

[TC39 - GitHub](https://github.com/tc39)
[TC39 - Proposals](https://github.com/tc39/proposals)

###### Fluxo da proposta

* Stage 0: Strawman
* Stage 1: Proposal
* Stage 2: Draft
* Stage 3: Candidate
* Stage 4: Finished

###### Es2018
* Operadores rest/spread
* Iteração Assíncrona
* Promisses.prototype.finally( )

######  ES.Next
[Babel JS](https://babeljs.io/)

> * JS é uma linguagem interpretada
> * Não há compilação
> * Tipagem fraca e dinâmica (n ha verificação em todas as linhas do script)

###### TypeScript
* Contém Enum e Interfaces
[TypeScript Play](https://www.typescriptlang.org/play)

###### Flow
* Não contém Enum e Interfaces
[Flow Site](https://flow.org/en/)

#### ES6
* Funções de Primeira Classe e Ordem maior: 
```js
    function getName() {
        return 'Bruno C. Manso'
    }
    function logFn(fn) { 
        console.log(fn()); // retorna o resultado da função
    }

    const logFnResult = logFn;
    logFnResult(getName); // passa por argumentos

```
* Closure
Escopo léxico - É a capacidade de uma função lembrar do ambiente que ela foi criada

```js
    function init() {
        const exemplo = 'essa variável';

        return function() {
            console.log(`1 - O valor da variável exemplo é: ${exemplo}.`);

            return function() {
                console.log(`2 - O valor da variável exemplo é: ${exemplo}.`);
            
                return function() {
                console.log(`3 - O valor da variável exemplo é: ${exemplo}.`);
                }
            }
        }
    }

    //const initFn1 = init();
    //const initFn2 = initFn2();
    //initFn3();
    init()()(); // executa tudo em uma linha só

```

* Currying
Transforma uma função de 'n' parâmetros em apenas uma função q recebe 1 parâmetro e pra cada parâmetro retorna uma função

```js
    function soma(a,b) {
        return a + b;
    }
    
    soma(2,2);
    soma(2,3);
    soma(2,4);
    soma(2,5);
```
        To Currying: 
```js
    function soma2(a) {
        return function(b) {
        return a + b;
        }
    }

    const soma2 = soma2(2); // variável carrega um construtor  

    soma2(2);
    soma2(3);
    soma2(4);
    soma2(5);
```

* Hoisting
Levantar/Suspender
Declarações de variáveis e funções são elevadas no escopo q ela está (Bloco, função ou global)

        -Variáveis
        Só eleva a criação da variável e não a sua atribuição
        
        -Funções
        É elevada ao topo 


``` js
    function fn () {
        console.lob(text);  //  retorna undefined
        var text = 'Exemplo';
        console.log(text);
    }

    fn();
```
``` js
    function fn () {
        log('Hoisting de Função');
        fuction log (value) {
            console.log(value);  // retorna o resultado certo
        } 
    }
```

* Imutabilidade

> -Exemplo 1
```js
    const user = {
    name: 'Bruno',
    lastname: 'Manso'
    };

    function getUserWithFullName(user) {
        return {
            ...user,    // ... spread operator
            fullname: `${user.name} ${user.lastname}`  // string literal
        }
    }

    const userWithFullName = getUserWithFullName(user);
    console.log(userWithFullName);
```
> Results:
```sh
{ name: 'Bruno', lastname: 'Manso', fullname: 'Bruno Manso' }
```
> -Exemplo 2

```js

    const students = [
    {
        nane: 'Grace',
        grade: 7
    },
    {
        name: 'Jennifer',
        grade: 4
    },
    {
        name: 'Paul',
        grade: 10
    }
    ];
    function getApprovedStudents(studentsList) {
        return studentsList.filter(students => students.grade >= 7); 
    }

    console.log(`Aproved students:`);
    console.log(getApprovedStudents(students));

    console.log('\nList:');
    console.log(students);
```

    > Results

```sh  
Aproved students:
[ { nane: 'Grace', grade: 7 }, { name: 'Paul', grade: 10 } ]

List:
[ { nane: 'Grace', grade: 7 },
  { name: 'Jennifer', grade: 4 },
  { name: 'Paul', grade: 10 } ] 

```

* Tipos e Variáveis

-var 
-let
-const

> -Exemplo 1:
```js
    var nameVar = 'Jimmy';
    let nameLet = 'Jimmy';
    const nameConst = 'Jimmy';

    console.log(`nameVar: ${nameVar}`);
    console.log(`nameLet: ${nameLet}`);
    console.log(`nameConst: ${nameConst}`);
```

> -Tipos de Escopos:
```js
    // escopo global
    {
        //escopo de bloco
    }

    function test() {
        // escopo de função
    }
``` 
não é uma boa pratica usar o escopo global

> Var:
```js
var test = 'example';

(() => {
    // var test;
    console.log(`valor dentro da função "${test}"`);
    if (true) {
        var test = 'example'; // Hoisting sobe para o escopo
        console.log(`Valor dentro do if "${test}"`);
    }
    console.log(`Valor após a execução do if "${test}"`);
})();
```

> Let:
```js
(() => {
    // let test;
    let test = 'valor função';
    console.log(`valor dentro da função "${test}"`);

    if (true) {
        let test = 'valor if'; 
        console.log(`Valor dentro do if "${test}"`);
    }
    
    console.log(`Valor após a execução do if "${test}"`);
})();
```
> Const:
```js
(() => {

    const test = 'valor função';
    console.log(`valor dentro da função "${test}"`);

    if (true) {
        const test = 'valor if'; 
        console.log(`Valor dentro do if "${test}"`);
    }

    if(true) {
        const test = 'valor de outro if' 
        console.log(`Valor dentro do outro if "${test}"`);
    }

    console.log(`Valor após a execução do if "${test}"`);
})();
```
em um primitivo declarado como const não é permitida a troca de valores a não ser q seja criado um objeto e que este seja alterado, troca a propiedade mas nao muda o ponteiro de memória

```js
    const user = {
        name: 'Jimmy'
    };

    user.name = 'Outro valor'; // Se for um objeto pode trocar as propriedades

    // O objeto não pode ser alterado apontando para outro lugar
    // user = {  
    //     name: 'Jimmy'
    // };

    const persons = ['Bob', 'Alice', 'Jimmy'];

    persons.push('John');  // Permitido adicionar novos itens 
    // ['Bob', 'Alice', 'Jimmy', 'John']

    persons.shift();  // Permitido remoção de itens // remove o primeiro item
    // ['Alice', 'Jimmy', 'John']

    persons[1] = 'Debra';  // Permitido alteração dinâmica
    // ['Alice', 'Debra', 'John']

    console.log('\nArray após alterações: ', persons);
```