

// Hoisting

function fn () {
    console.log(text);  //  retorna undefined
    var text = 'Exemplo';
    console.log(text);
}

fn();

function fn () {
    log('Hoisting de Função');
    function log(value) {
        console.log(value);  // retorna o resultado certo
    } 
}
