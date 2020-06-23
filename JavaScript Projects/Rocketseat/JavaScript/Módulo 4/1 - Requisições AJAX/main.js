// Ajax: requisição assincrona que realiza um backend
// requisita informacoes do servidor sem precisar reiniciar a pagina
// consumir informações de servidor pelo javaScript


var xhr = new XMLHttpRequest();
xhr.open('GET', 'https://api.github.com/users/M4ns0');
xhr.send(null);

xhr.onreadystatechange = function() {
    if (xhr.readyState === 4) {
        console.log(JSON.parse(xhr.responseText));

    }
}