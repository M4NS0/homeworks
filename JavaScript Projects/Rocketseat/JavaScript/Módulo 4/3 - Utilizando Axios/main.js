// Ajax: requisição assincrona que realiza um backend
// requisita informacoes do servidor sem precisar reiniciar a pagina
// consumir informações de servidor pelo javaScript

/*
var xhr = new XMLHttpRequest();
xhr.open('GET', 'https://api.github.com/users/M4ns0');
xhr.send(null);

xhr.onreadystatechange = function() {
    if (xhr.readyState === 4) {
        console.log(JSON.parse(xhr.responseText));

    }
}
*/
/*
var myPromise = function() {
    return new Promise(function(resolve, reject) {
        var xhr = new XMLHttpRequest();
        xhr.open('GET', 'https://api.github.com/users/M4ns0');
        xhr.send(null);

        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4) {
                if (xhr.status === 200) {
                    resolve(JSON.parse(xhr.responseText));
                } else {
                    reject('Erro na requisição')
                }
        
            }
        }
    });
}
*/
// axios retorna de maneira mais fácil
axios.get('https://api.github.com/users/M4ns0')
.then(function(response) {
    console.log(response);
})
.catch(function(error) {
    console.log(error);
});

