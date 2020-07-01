function soma1(a,b) {
    return a + b;
}
console.log(soma1(1)); // NAN não é um número
console.log(soma1());  // não conseguiu achar quais números devem ser somados

function soma2(a = 3,b = 6) {
    return a + b;
}
console.log(soma2(1)); // retorna 7
console.log(soma2());  // retorna 9

// com arrow function:
const soma3 = (a = 3, b = 6) => a + b;
console.log(soma3(1));
console.log(soma3());

