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
    function soma(a) {
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
