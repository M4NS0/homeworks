import  Carro from './Carro';
import  Concessionaria  from './Concessionaria'
import  Pessoa from './Pessoa'


// let concessionaria = new Concessionaria('Av Paulista', );
// console.log(concessionaria);


//Criar carros
let carroA = new Carro('Fusca', 4)
let carroB = new Carro('Opala', 4)
let carroC = new Carro('Veloster', 3)

//Montar lista de carros
//let listaDeCarros: Carro[] = [carroA, carroB, carroC] //Mesma coisa
let listaDeCarros: Array<Carro> = [carroA, carroB, carroC]

let concessionaria = new Concessionaria('Av Paulista', listaDeCarros)

//Exibir a lista de carros
//console.log(concessionaria.mostrarListaDecarros())

//Comprar o carro
let cliente = new Pessoa('Rafael', carroC)
//console.log(cliente.dizerCarroPreferido())
concessionaria.mostrarListaDecarros().map((carro: Carro) => {
    //console.log(carro)
    if (carro == cliente.dizerCarroPreferido()) {

        //comprar o carro preferido
        cliente.comprarCarro(carro)
    }
})

console.log(cliente.dizerCarroQueTem())