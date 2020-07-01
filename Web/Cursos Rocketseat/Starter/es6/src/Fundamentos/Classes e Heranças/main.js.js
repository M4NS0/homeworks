// para utilizar esse script, mude o nome para main.js
// Classes, Herança e Encapsulamento


class List {
    constructor() {
        this.data = [];
    }


    add(data) {
        this.data.push(data);
        console.log(this.data);
    }
}

// forma sem herança
// class TodoList {
//     //para instanciar a classe
//     constructor() { 
//         this.todos = [];
//     }

//     addTodo() {
//         this.todos.push('Novo todo');
//         console.log(this.todos);
//     }
// }


// usando herança
class TodoList extends List {
    constructor() {
        super(); // chama o construtor da classe pai

        this.usuario = 'Bruno';

    }
    mostraUsuario() {
        console.log(this.usuario);
    }
}

var MinhLista = new TodoList();

// sem herança
// document.getElementById('novotodo').onclick = function() {
//     MinhLista.addTodo();
// }

// com herança
document.getElementById('novotodo').onclick = function () {
    MinhLista.add('Novo todo');
}

MinhLista.mostraUsuario();

// outra forma de encapsulamento 
class Matematica {
    static soma(a,b) {
     return a+b;
 }
}
console.log(Matematica.soma(1,2));


