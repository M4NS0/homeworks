import { DaoInterface } from './DaoInterface'
import Concessionaria from './Concessionaria'

export class ConcessionariaDao implements DaoInterface {
    nomeTabela: string = 'tb_concessionaria'

    inserir(object: /*any*/ Concessionaria): boolean {
        console.log('...logica inserir')
        return true;

    }
    atualizar(object: /*any*/ Concessionaria): boolean {
        console.log('...logica atualizar')
        return true;

    }
    remover(id: number) /*any*/ :Concessionaria{
        console.log('...logica remover')
        return /*null*/ new Concessionaria('',[])

    }
    selecionar(id: number) {
        console.log('...logica selecionar')
        return null

    }
    selecionarTodos(): [any] {
        console.log('...logica getAll')
        return [new Array]

    }



}