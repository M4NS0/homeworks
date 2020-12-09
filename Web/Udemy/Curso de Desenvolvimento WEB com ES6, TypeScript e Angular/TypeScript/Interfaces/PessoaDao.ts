import { DaoInterface } from './DaoInterface'
import Pessoa from './Pessoa'

export class PessoaDao implements DaoInterface {
    nomeTabela: string = 'tb_Pessoa'

    inserir(object: /*any*/ Pessoa): boolean {
        console.log('...logica inserir')
        return true;

    }
    atualizar(object: /*any*/ Pessoa): boolean {
        console.log('...logica atualizar')
        return true;

    }
    remover(id: number) /*any*/ :Pessoa{
        console.log('...logica remover')
        return /*null*/ new Pessoa('','')

    }
    selecionar(id: number): Pessoa {
        console.log('...logica selecionar')
        return /*null*/ new Pessoa('','')

    }
    selecionarTodos(): [any] {
        console.log('...logica getAll')
        return [new Pessoa('','')]

    }



}