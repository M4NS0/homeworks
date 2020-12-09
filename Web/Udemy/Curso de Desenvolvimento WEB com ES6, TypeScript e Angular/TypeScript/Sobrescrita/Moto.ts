import Veiculo from './Veiculo'

class Moto extends Veiculo {
    // sobrescrita de método
    public acelerar(): void {
        this.velocidade = this.velocidade + 20
    }
}

export default Moto
