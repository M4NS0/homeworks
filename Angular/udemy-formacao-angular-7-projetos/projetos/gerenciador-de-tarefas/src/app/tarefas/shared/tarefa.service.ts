import { Injectable } from '@angular/core';
import { Tarefa } from './';

@Injectable({
  providedIn: 'root'
})
export class TarefaService {

  constructor() { }

  listarTodos(): Tarefa[] {
    const tarefas = localStorage['tarefas'];
    return tarefas ? JSON.parse(tarefas) : [];
    // ?: ternário simplificação para if/else 
    // if tarefa existe usa o JSON.parse, ao contrário retorna array vazio
  }

  cadastrar(tarefa: Tarefa): void {
    const tarefas = this.listarTodos();
    tarefa.id = new Date().getTime(); // numero unico a cada segundo
    tarefas.push(tarefa); // lista retornada do localstorage inserida no array de tarefas
    localStorage['tarefas'] = JSON.stringify(tarefas); // converção para string e armazenamento em local storage
  }

  buscarPorId(id: number): Tarefa {
    const tarefas : Tarefa[] = this.listarTodos();
    return tarefas.find(tarefa => tarefa.id === id); // itera sobre todas as tarefas e para cada tarefa ve se o id é igual o da procura
  }

  atualizar(tarefa: Tarefa): void {
    const tarefas : Tarefa[] = this.listarTodos(); //carrega tarefas
    tarefas.forEach((obj, index, objs) => {
      if(tarefa.id === obj.id){   
        objs[index] = tarefa;  // atribuição de tarefas na posição requerida
      }
    });
    localStorage['tarefas'] = JSON.stringify(tarefas);
  }

  remover(id : number): void {
    let tarefas : Tarefa[] = this.listarTodos(); // retorna uma nova listagem depois de ter achado (filter) por isso o let é usado
    tarefas = tarefas.filter(tarefa => tarefa.id !== id); // filtro usando id retornando todas as tarefas na qual id seja diferente do q foi passado criando nova tarefa menos o id passado
    localStorage['tarefas'] = JSON.stringify(tarefas); // converte obj em string
  }

  alterarStatus(id: number): void {
    const tarefas : Tarefa[] = this.listarTodos();
    tarefas.forEach((obj, index, objs) => {
      if(id === obj.id) {
        objs[index].concluida = !obj.concluida; // muda booleano de true para false
      }
    });
    localStorage['tarefas'] = JSON.stringify(tarefas);
  }
}
