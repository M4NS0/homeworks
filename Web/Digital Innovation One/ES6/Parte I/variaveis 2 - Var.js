var test = 'example';

(() => {
    // var test;
    console.log(`valor dentro da função "${test}"`);
    if (true) {
        var test = 'example'; // Hoisting sobe para o escopo
        console.log(`Valor dentro do if "${test}"`);
    }
    console.log(`Valor após a execução do if "${test}"`);
})();