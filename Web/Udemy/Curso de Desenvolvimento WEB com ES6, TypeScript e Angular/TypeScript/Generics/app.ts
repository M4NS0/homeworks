import Carro from './Carro'
import Moto from './Moto'
import Concessionaria from './Concessionaria'

let carro = new Carro('Cadilac', 4);

let moto = new Moto()
moto.acelerar()
carro.acelerar()

let concessionaria = new Concessionaria("",[])

console.log(carro)
console.log(moto)
console.log(concessionaria.fornecerHorariosDeFuncionamento())