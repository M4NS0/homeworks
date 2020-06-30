// Operadores Rest/Spread

// Rest 
// Apanha o resto das propriedades
const usuario = {
    nome: 'Bruno',
    idade: 39,
    empresa: 'Big Hiccups LTDA'
};

const { nome, ...resto} = usuario;
console.log(nome);
console.log(resto);


const arr = [1,2,3,4];
const [a,b, ...c] = arr;
console.log(a);
console.log(b);
console.log(c);

function soma1(...params) {
    return params.reduce((total,next) => total + next);
}
console.log(soma1(1,3,4));


function soma2(a, b, ...params) {
    return params;
}
console.log(soma2(1,3,4)); // vai aparecer apenas o resto

// Spread Operator
// Repassa infos de um objeto de um array para outra estrutura de dados
const arr1 = [1,2,3];
const arr2 = [4,5,6];
const arr3 = [...arr1, ...arr2];
console.log(arr3);

// Repassa atributos e pode modificar no momento da passagem
const usuario2 = { ...usuario, nome: 'Manso'};
console.log(usuario2);


