
 ![N|Solid](https://xesque.rocketseat.dev/platform/1564681946529.svg) ![N|Solid](https://xesque.rocketseat.dev/platform/1564682281422.svg) ![N|Solid](https://xesque.rocketseat.dev/platform/1564682425906.svg) 
 
 ![N|Solid](https://xesque.rocketseat.dev/platform/1566444110414.png) ![N|Solid](https://xesque.rocketseat.dev/platform/1566444881250.png)

##

## JavaScript e ES6+ ##
## ES6+ (ECMA Script) ##

### Módulos ###
 1. Conceitos
 	1.  Introdução
 	2.  Instalando Node e Yarn
 	3.  Configurando o Babel
 	4.  Classes e Heranças
 	5.  Const e Let
 	6.  Operações em Array
 	7.  Arrow Functions
 	8.  Valores Padrão
 	9.  Desestruturação
 	10. Operadores Rest/Spread
 	11. Template Literals
 	12. Object Short Syntax
 2. WebPack Server
	1.  Configurando WebPack
	2.  Import/Export
	3.  WebPack Dev Server
 3. Async/Await
	1.  Conceitos
 	2.  Configurando Axios
 4. Aplicação com o ES6+
	1.  Estruturas de Estilos
	2.  Adicionar Repositórios
	3.  Render em Tela
	4.  Buscando em API
	5.  Loading Error

### Passo a passo de instalações ###
Tudo que foi instalado e configurado estará descrito abaixo

## 
### Node.Js e Yarn
## 

1. Instalar o Node.JS
2. Instalar o Yarn
3. No diretório do projeto:
```sh
yarn init
```
4. Instalar dependências do babel:
```sh
yarn add @babel/cli
yarn add @babel/preset-env
```
5. Criar arquivo gitignore de modulos:
```sh
touch .gitignore && echo "node_modules/" >> .gitignore && git rm -r --cached node_modules ; git status
```
6. Criar arquivo .babelrc:
```sh
touch .babelrc && echo '{"presets": ["@babel/preset-env"]}' > .babelrc
``` 
7. Adicionar em package.json: 
  ```sh
  ,
    "scripts": {
      "dev": "babel ./main.js -o ./bundle.js"
    } 
  ```
8. Adicionar nova dependencia do babel
```sh
yarn add @babel/core
```
9. Criar arquivo main.js
```sh
touch main.js
```
10. Adicionar -w em package.json: 
```sh
 ,
  "scripts": {
    "dev": "babel ./main.js -o ./bundle.js -w"
  } 
```
11. O package.json ficará assim:
```sh
  {
    "name": "es6",
    "version": "1.0.0",
    "main": "index.js",
    "license": "MIT",
    "dependencies": {
      "@babel/cli": "^7.10.3",
      "@babel/preset-env": "^7.10.3"
    },
    "scripts": {
      "dev": "babel ./main.js -o ./bundle.js -w"
    }
  }
```
12. Usar o yarn
```sh
yarn dev
```
## 
### Rest/Spread
## 

1. Adicionar ao babel:
```sh
  yarn add @babel/plugin-proposal-object-rest-spread
```
2. Editar .babelrc com a linha:
```sh
echo ".babelrc" >> '"plugins": [@babel/plugin-proposal-object-rest-spread]'
echo '{"presets": ["@babel/preset-env"],"plugins": ["@babel/plugin-proposal-object-rest-spread"]}' > .babelrc
```
3. Reiniciar o Yarn Dev

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


### Para usar o projeto Online
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


[![N|Solid](https://rocketseat.com.br/static/images/og/rocketseat.png)](https://skylab.rocketseat.com.br/journey/starter) 


