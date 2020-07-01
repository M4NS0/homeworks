const usuario = {
    nome: 'Bruno',
    idade: '39',
    endereco: {
        cidade: 'Goiânia',
        estado: 'Goiás',
    },
};
console.log(usuario);
console.log(cidade);
/*
const nome = usuario.nome;
const idade = usuario.idade;
const cidade = usuario.endereco.cidade;

console.log(nome);
console.log(idade);

const { nome,idade } = usuario;
console.log(nome);
console.log(idade);
*/
const { nome,idade, endereco: { cidade }} = usuario;
console.log(nome);
console.log(idade);
console.log(cidade);

function mostraNome(usuario) {
    console.log(usuario.nome);
}
mostraNome(usuario);

function mostraNome2({nome, idade}) {
    console.log(nome, idade);
}
mostraNome2(usuario);