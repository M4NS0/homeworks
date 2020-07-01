## 
### Configurando Web Pack
## 

1. Alterar em package.json 'dependencies' para 'devDependencies' 
2. Adicionar dependência ao Yarn
```sh
yarn add webpack webpack-cli -D
```
3. Criar arquivo de configuração
```sh
touch webpack.config.js
```
4. Inserir o Script dentro do webpack.config.js
```sh
  module.exports = {
      entry: './main.js',
      output: {
          path: __dirname,
          filename: 'bundle.js',
      },
      module: {
          rules: [
              {
                  test: /\.js$/,
                  exclude: /node_modules/,
                  use: {
                      loader: 'babel-loader'
                  }
              }
          ],
      },
  };
```
5. Instalar o babel loader
```sh
yarn add babel-loader -D
```
6. Modificar a leitura de scripts no package.json para:
```sh
  },
  "scripts": {
    "dev": "webpack --mode=development -w"
  }
  }
```
7. Reiniciar o Yarn
```sh
yarn dev
```

## 
### Configurando Web Pack Dev Server
Existem 2 modos,  o  primeiro  Offline  que  não  necessita  o  bundle.js 
e o segundo Online que irá  gerar um bundle.js  novo,  essa  configuração
permite   que  toda  e  qualquer  alteração  feita  seja  automaticamente 
complementada e atualizada diretamente no navegador ou no servidor Online.
## 

1. Criar e mover arquivos para as pastas src e public
2. Apagar bundle.js
3. Modificar path webpack.config.js
```sh
 module.exports = {
    entry: './main.js',
    output: {
        path: __dirname,
        filename: 'bundle.js',
    },
 ``` 
 para

 ```sh
 module.exports = {
    entry: './src/main.js',
    output: {
        path: __dirname + '/public',
        filename: 'bundle.js',
    },
  ```
3. Re-adicionar ao Yarn o novo Webpack server
```sh
  yarn add webpack-dev-server -D
```

4. Adicionar nova configuração ao webpack.config.json
```sh
  },
  devServer: {
    contentBase:  __dirname + '/public'
  },
```
no final, depois dos passos 2 e 4, ficará assim:
```sh
  module.exports = {
      entry: './src/main.js',
      output: {
          path: __dirname,
          filename: 'bundle.js',
      },
  devServer: {
    contentBase:  __dirname + '/public'
  },
      module: {
          rules: [
              {
                  test: /\.js$/,
                  exclude: /node_modules/,
                  use: {
                      loader: 'babel-loader'
                  }
              }
          ],
      },
  };
```
5. Alterar o módulo de scripts do package.json
```sh
   },
  "scripts": {
    "dev": "webpack-dev-server --mode=development"
  }
}
```
6. Executar o Yarn dev novamente
```sh
  yarn dev
```
* Webpack dev ja contém um bundle.js próprio, não sendo necessário criar outro.
* Utilize http://localhost:8080/ para visualização do conteúdo.


# Para usar o projeto Online
1. Inserir comando "build" nos scripts do package.json abaixo de "dev"
```sh
   },
  "scripts": {
    "dev": "webpack-dev-server --mode=development",
    "build": "webpack --mode=production"
  }
}
```
2. Fazer build no Yarn
```sh
  yarn build
```
* Aqui será criado um arquivo bundle.js, que será necessário Online
