
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