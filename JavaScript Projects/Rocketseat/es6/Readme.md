
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
	1.  Configurando WebPAck
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

### Passo a passo de instalações, módulo 1: ###

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
9. Testar yarn
```sh
yarn dev
```
7. Adicionar -w em package.json: 
```sh
 ,
  "scripts": {
    "dev": "babel ./main.js -o ./bundle.js -w"
  } 
```
8. O package.json ficará assim:
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



### Passo a passo de instalações, módulo 2: ###
### Passo a passo de instalações, módulo 3: ###


[![N|Solid](https://rocketseat.com.br/static/images/og/rocketseat.png)](https://skylab.rocketseat.com.br/journey/starter) 


