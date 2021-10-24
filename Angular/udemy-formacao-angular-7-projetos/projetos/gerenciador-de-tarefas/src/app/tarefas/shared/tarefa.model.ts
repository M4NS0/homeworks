export class Tarefa {

    constructor(
        // atributos da classe
        public id?: number,
        public nome?: string,
        public concluida?: boolean) {}
}; // similar a um factory basta utilizar new para iniciar o objeto Tarefa