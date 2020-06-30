/*

// pode importar um conjunto de funções
import { soma,sub } from './funcoes';
console.log(soma(1,2)); 
console.log(sub(4,2)); 

// pode importar uma função especifica padrão
import soma1 from './soma';
console.log(soma1(1,2)); 

// pode importar e mudar o nome da variável
import { soma as somaFunction,sub } from './funcoes';
console.log(somaFunction(1,2)); 
console.log(sub(4,2)); 

// pode importar uma função de um script e outra função qualquer escolhida
import soma, { sub } from './funcoes';
console.log(soma(1,2)); 
console.log(sub(4,2)); 
*/

// pode importar todas as funçoes contidas em um script
import * as funcoes from './funcoes';
console.log(funcoes);
console.log(funcoes.soma(1,2));
console.log(funcoes.sub(4,2));
