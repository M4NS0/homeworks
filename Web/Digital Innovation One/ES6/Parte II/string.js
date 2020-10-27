const textSize = "Texto".length;
console.log (`Retorna o tamanho da string (.length)
            \nAceita Regex
            \nQuantidade de letras da palavra "Texto" é "${textSize}"`);

const splittedText = 'Texto'.split('x');
console.log('\nRetorna um array quebrando a string por um delimitador (.split)' +
            '\nSintaxe: .split(referencia)' +
            '\nArray com as posições separadas pelo delimitador x da palavra "Texto":', splittedText);

const replacedText = 'Texto'.replace('Text', 'txeT');
console.log('\nBusca por um valor e substitui por outro' +
            '\Sintaxe: n.replace(novo texto)' + 
            '\nSubstituindo valores "Text" por "txeT": ' , replacedText);

const lastChar = 'Texto'.slice(-1);
console.log('\nRetorna a fatia de um valor' + 
            '\nSintaxe: .slice(start,end)' + 
            '\nRetornando a última letra da string "Texto": ', lastChar);

const allWithoutLastChar = 'Texto'.slice(0, -1);
console.log('\nRetorna a fatia de um valor' + 
            '\nSintaxe: .slice(start,end)' + 
            '\nRetornando todas as letras da palavra "Texto" menos a última: ', allWithoutLastChar);

const secondToEnd = 'Texto'.slice(1);
console.log('\nRetorna a fatia de um valor' + 
            '\nSintaxe: .slice(start,end)\nRetornando a palavra "Texto" da segunda letra até a última: ',secondToEnd);

const twoCharsBeforeFirstPosition = 'Texto'.substr(0,2);
console.log('\nRetorna "n" caracteres apartir de uma posição' + 
            '\nSintaxe: .slice(começo, quantidade de caracteres)\n' + 
            'As duas primeiras letras da palavra "Texto": ', twoCharsBeforeFirstPosition);


