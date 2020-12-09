import  Carro  from './Carro';

export default class Concessionaria {
    private endereco: string
    private listaDeCarros: Array<Carro>

    public constructor(endereco: string, listaDeCarros: Array<Carro>) {
        this.endereco = endereco
        this.listaDeCarros = listaDeCarros
    }

    public fornecerEndereco(): string {
        return this.endereco
    }

    public mostrarListaDecarros(): Array<Carro> {
        return this.listaDeCarros
    }
}