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
 Object.assign(user, {fullname: 'James Marshal Hendrix'});

 console.log('\nAdicionando a propriedade fullname no Objeto user: ', user);
 console.log('\nRetorna um novo Objeto juntando dois ou mais objetos', Object.assign({},user, {age:27}));