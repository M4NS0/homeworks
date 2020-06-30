const arr = [1,3,4,5,6];

const newArray1 = arr.map(function(item){ 
    return item * 1;
});
console.log(newArray1);

// Arrow Function: 
const newArray2 = arr.map((item) => { 
    return item * 2;
});
console.log(newArray2);

// Forma reduzida quando recebe apenas um parâmetro:
const newArray3 = arr.map(item => { 
    return item * 3;
});
console.log(newArray3);

// Quando retorna simplesmente apenas uma operação dentro da função
const newArray4 = arr.map(item => item * 4); // callback passagem de uma função dentro de uma função
console.log(newArray4);

// criando funções utilizando constantes
const teste1 = () => {
    return teste1;
}
console.log(teste1());

// ...com array
const teste2 = () => [1,2,3];
console.log(teste2());

// ...com String
const teste3 = () => 'teste';
console.log(teste3());

// ...com número
const teste4 = () => 4;
console.log(teste4());

// ...com objeto

const teste6 = () => {
    return { nome: 'Bruno'}
};
console.log(teste6()); // ou...

const teste5 = () => { nome: 'Bruno'}; // forma errada
console.log(teste5()); // aqui retornatá undefined porque a forma correta seria:

const teste7 = () => ({ nome: 'Bruno'}); // forma certa
console.log(teste7());
