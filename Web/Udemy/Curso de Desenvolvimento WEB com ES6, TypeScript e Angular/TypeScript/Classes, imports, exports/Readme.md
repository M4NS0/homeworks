### TypeScript

> Inferencia de Tipos
Verificação estática
Suporte de Classe e Interface

###### Instalação:

```sh
    sudo npm install -g typescript
    tsc -v
```

###### Exemplo de Uso:

1. Crie um arquivo (exemplo.ts)
2. Insira o código:

```ts
    var ola = (nome: string) => {
        console.log("Olá " + nome);
    }
    ola("Jimmy");
```
3. Para transpilar, abra o Terminal na pasta do projeto e insira:
```sh
    tsc exemplo.ts
```
4. Um arquivo .Js foi criado, com o conteúdo:
```js
    var ola = function(nome) {
        console.log("Olá " + nome ); 
    }; 
    ola("Jimmy");
```
para rodá-lo insira no terminal:
```sh
    node exemplo.js
```

O exemplo foi transpilado de Typescript para ES6


###### Configurando o TypeScript

1.  Para criar um arquivo de configuração tsconfig.json insira o comando no terminal:
```sh   
    tsc -init
```

```json
    ...
    "target" : "es5", // o target dentro do arquivo criado esta configurado para ES5 
    "outDir" : "./dist",  // é o caminho da aplicação transpilada (adicione dist após ./)
    ...
```

2. No terminal, escreva:
```sh
    tsc -w
```

Agora, o script será monitorado e atualizado sempre que houver modificações no arquivo .ts o .js será alterado.


#### Inferencia de Tipos

```ts
var mensagem: string = "Seja bem vindo!";
var idade: number = 40;
var boleano: boolean = true;

var lista: Array<String> = ['Uva', 'Pêra', 'Pessego'];
var lista2: string[] = ['Uva', 'Pêra', 'Pessego'];

var listaNumerica: Array<number> = [7.5,8,9];
var listaNumerica2: number[] = [7.5,8,9];

// var mensagem = 10; // Subsequent variable declarations must have the same type.  Variable 'mensagem' must be of type 'string', but here has type 'number'.

```
#### Orientação a Objetos em TypeScript
Classe, Construtores, Instanciação e Objetos
```ts
    //     v Classe
    class Carro {
        private modelo: string;
        private numeroDePortas: number;
        private velocidade: number = 0;

        // implementacoes de metodos sao feitas a partir de funcoes

        //     v Construtor que passa parâmetros que são instanciados em um objeto
        constructor(modelo: string, numeroDePortas:number) {
        //     v Esse modelo insitanciado é igual o modelo declarado
            this.modelo = modelo;
            this.numeroDePortas = numeroDePortas;
        }

        //      v Função
        public acelerar(): void {
            this.velocidade = this.velocidade + 10;
        }
        //               v Não retorna nada
        public parar(): void {
            this.velocidade = 0;
        }

        //                          v Retornará um número
        public velocidadeAtual(): number {
            return this.velocidade;
        //    ^ retorno
        }
    }

    // instanciação de classe

    let carroA = new Carro('Veloster', 3);
    console.log(carroA);

    // v acesso à função do objeto dentro da classe
    carroA.acelerar();
    console.log(carroA);

```
###### Encapsulamento e Visibilidade
> As features de classes disponíveis no cs6 sportam os seguintes conceitos em orientação a objetos:
> - Herança
> - Protótipos
> - Super chamadas
> - Métodos Estáticos
> - Instâncias e Construtores
> - Visibilidade ainda não existe
> <br>
> Modificadores de visibilidade são disponibilizados pelo TypeScript
