## 

## Conteúdo ##

## 

### JavaScript e ES6+ ###
### ES6+ (ECMA Script) ###

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
