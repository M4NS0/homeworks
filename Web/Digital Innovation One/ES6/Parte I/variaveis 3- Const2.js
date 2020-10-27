const user = {
    name: 'Jimmy'
};

user.name = 'Outro valor'; // Se for um objeto pode trocar as propriedades

// O objeto não pode ser alterado apontando para outro lugar
// user = {  
//     name: 'Jimmy'
// };

const persons = ['Bob', 'Alice', 'Jimmy'];

persons.push('John');  // Permitido adicionar novos itens 
// ['Bob', 'Alice', 'Jimmy', 'John']

persons.shift();  // Permitido remoção de itens // remove o primeiro item
// ['Alice', 'Jimmy', 'John']

persons[1] = 'Debra';  // Permitido alteração dinâmica
// ['Alice', 'Debra', 'John']

console.log('\nArray após alterações: ', persons);
