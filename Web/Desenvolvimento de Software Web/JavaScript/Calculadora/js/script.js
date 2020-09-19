function inserir(num) {
    let conteudo = document.form.visor.value;
    if (conteudo == "" && (num == "+" ||num == "-" ||num == "*" ||num == "/"))
    document.form.visor.value = "";
    else {
        let ultimo = conteudo.charAt(conteudo.length=1);
        if ((num == "+" ||num == "-" ||num == "*" ||num == "/") && (ultimo == "+" ||ultimo == "-" ||ultimo == "*" ||ultimo == "/")) {
        } else 
        document.form.visor.value = document.form.visor.value + num;
    }
}

function limpar() {
    document.form.visor.value = "";
}

function resultado() {
    expressao = document.form.visor.value;
    if (expressao.length > 0) {
        document.form.visor.value = eval(expressao);
    }
}