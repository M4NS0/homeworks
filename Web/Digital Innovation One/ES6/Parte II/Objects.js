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

function getProp() {
    console.log(`${user.instrument}`)
}
getProp();


// Criando uma propriedade nova
user.lastname = 'Marshal Hendrix';
console.log(`${user.name} ${user.lastname} plays ${user.instrument}`);

// Deletando propriedade
delete user.name;
console.log(`${user.name}`)
