const users = ['Bob', 'Alice'];

const gender = { 
    MAN: Symbol('M'),
    WOMAN: Symbol('W')

}

const persons = [
    {
        name: 'Bob',
        age: 22,
        gender: gender.MAN
    },
    {
        name: 'Alice',
        age: 19,
        gender: gender.WOMAN
    }
]
// Retornar quantidades de itens no array
console.log('Items: ', persons.length);

// Verificar se é um array
console.log('A variável persons é um array: ', Array.isArray(persons));

// Iterar os itens do array
persons.forEach((person, index, arr) => {
    console.log(`\nNome: ${person.name} index: ${index}`, arr);
});

// Filtrar Array
const mens = persons.filter(person => person.gender === gender.MAN);
console.log('\nNova lista apenas com homens: ', mens);

// Retornar um novo
const personsWithCourse = persons.map(person => { 
    person.course = 'Introdução ao JavaScript';
});

console.log('\nPessoas com a adição do course: ' , personsWithCourse);

// Transfomar array em outro tipo
const totalAge = persons.reduce((age,person) => {
    age += person.age;
    return age;
}, 0);

console.log('\n');