## TypeScript 

#### Installation

1. In Terminal, Run:
```sh
    npm install -g typescript
```
2. Add a tsconfig.json document do project folder
3. Press Control + Space, intellisense will help to set the code, will looks like as bellow:
```json
    {
        "compilerOptions": {
            "module": "commonjs"
        },
        "exclude": [
            "node_modules"
        ]
    }
```
4. Add a HelloWorld.ts document and type as bellow:
```ts
    let message: string = 'Hello World';
    console.log(message);
```
5. In terminal, run the following command, it will create the document HelloWorld.js:
```sh
    tsc HelloWorld.ts
```
6. Also in terminal, run:
```sh
    node HelloWorld.js
```
7. OR on Vscode right clicking over HelloWorld.js file and Run 

8. By clicking Control + Shift + B, on tsconfig.json document, you can choose to build or to watch every single change in the TypeScript File