// Funções de Primeira Classe e Ordem maior: 

function getName() {
    return 'James M. Hendrix'
}
function logFn(fn) { 
    console.log(fn()); // retorna o resultado da função
}

const logFnResult = logFn;
logFnResult(getName); // passa por argumentos