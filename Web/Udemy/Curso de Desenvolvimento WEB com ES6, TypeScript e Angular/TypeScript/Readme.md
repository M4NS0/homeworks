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
    "outDir" : "./",  // é o caminho da aplicação
    ...
```

2. Para fazer com que o TS assista as modificações de configuração, escreva:
```sh
    tsc -w
```

###### > [Parou em 4:08](https://www.udemy.com/course/curso-de-desenvolvimento-web-com-es6-typescript-e-angular-4/learn/lecture/7211268#questions)