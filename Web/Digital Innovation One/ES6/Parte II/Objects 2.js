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
Object.assign(user, { fullname: 'James Marshal Hendrix' });

console.log('\nAdicionando a propriedade fullname no Objeto user: ', user);
console.log('\nRetorna um novo Objeto juntando dois ou mais objetos', Object.assign({}, user, { age: 27 }));
console.log('\nObjeto antigo:' + Object.values(user));

// Previne todas as alterações em um objeto
const newObj = { foo: 'bar' };
Object.freeze(newObj);

newObj.foo = 'changes';
delete newObj.foo;
newObj.bar = 'foo';

console.log('\nVariável newObj após alterações: ', newObj);

// Permite apenas a alteração de propriedades existentes em um objeto mas não permite a adição de novo atributo
const person = { name: 'Jimmy'};
Object.seal(person);

person.name = 'James';
delete person.name;
person.age = 27;

console.log('\nVariável person após alterações: ', person);