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
