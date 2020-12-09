export default class Veiculo {
    protected modelo: string  
    // protected permite que as classes filhas façam alteração direta em dos valores com variaveis com essa visibilidade.
    private velocidade: number = 0

    public acelerar(): void {
        this.velocidade = this.velocidade + 10
    }

    public parar(): void {
        this.velocidade = 0
    }

    public velocidadeAtual(): number {
        return this.velocidade
    }
}