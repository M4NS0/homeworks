
## JavaScript e ES6+ ##
## ES6+ (ECMA Script) ##

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

1. Introdução
- Babel: pega o codigo e converte versões em funções(5+, 6+, 7+...) em um codigo que todo entenderão
- Webpack: servidor
- Classes
- Arrow Functions
- Desestruturação
- Rest/Spread
- Inport/Export
- Asyn/Await


### Passo a passo de instalações: ###

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
