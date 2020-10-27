const myNumber = 12.345454;

const numberAsString = myNumber.toString();
console.log('Transformar número em String.' + 
            '\nSintaxe: variavelNumerica.toString()' + 
            `\nTransformando número ${myNumber} em uma string: "${myNumber.toString()}"`);

console.log('\nSaber o tipo de uma variável' +
            '\nSintaxe: typeof variável' + 
            `\nO tipo da variável myNumber(${myNumber}) é "${typeof myNumber}" ` +
            `\nO tipo da variável numberAsString(${numberAsString}) é "${typeof numberAsString}" `);

const fixedTwoDecimals = myNumber.toFixed(2);
console.log('\nRetorna quantidade de decimais de um número' + 
            '\nSintaxe: variavelNumérica.tofixed(quantidade de casas decimais)' +
            `\nO número ${myNumber} com apenas duas casas decimais é: ${fixedTwoDecimals}`);

const numericString = '123.45';
console.log('\nTransformando uma String em Float' + 
            '\nSintaxe: parseFloat(string numérico entre aspas simples)' +
            `\nA string "${numericString}" transformada para float: ${parseFloat(numericString)}` +
            `\nO tipo da String transformada para float agora é: ${typeof parseFloat(numericString)}`);


console.log('\nTransformando uma String em Inteiro' + 
            '\nSintaxe: parseInt(string numérico entre aspas simples)' +
            `\nA string "${numericString}" transformada para inteiro: ${parseInt(numericString)}` + 
            `\nO tipo da String transformada para inteiro agora é: ${typeof parseInt(numericString)}`);