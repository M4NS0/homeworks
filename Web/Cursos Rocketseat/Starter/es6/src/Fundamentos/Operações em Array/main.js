const arr = [1,3,4,5,8,9];

const newArr = arr.map(function(item) {
    return item*2;
});

console.log(newArr);

const arr1 = [1,3,4,5,8,9];

const newArr1 = arr1.map(function(item, index) {
    return item+index;
});

console.log(newArr1);

// redux: transforma um vetor em uma única variável
const sum = arr.reduce(function(total, next){
    // soma todos os itens do array
    // soma o primeiro numero com o segundo e o reduz:  1+3 = 4 (o 4 se torna o primeiro)
    // soma novamente o primeiro mais o segundo: 4+4 = 8 (o 8 se torna o primeiro)
    // assim sussecivamente até terminar o array resultando 30
    return total + next;
});
console.log(sum);

// filter:
const filter = arr.filter(function(item) {
    return item % 2 === 0;
});
console.log(filter);

// find:
const find = arr.find(function(item){
    return item === 4;
});
console.log(find);

