

// Escopo léxico - É a capacidade de uma função lembrar do ambiente que ela foi criada

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

