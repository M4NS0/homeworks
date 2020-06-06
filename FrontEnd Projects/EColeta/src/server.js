/* cria objeto express */
const express = require("express")
const server = express()

/* configurar pasta pública */
server.use(express.static("public"))


/*  configurar caminhos  
    da aplicação   
    req: requisição
    res: respostas      */
server.get("/", (req, res) => {
    //res.send("Hello World")
    res.sendFile(__dirname + "/views/index.html")
})

server.get("/create-point", (req, res) => {
    res.sendFile(__dirname + "/views/create-point.html")
})


/* Ligar o Servidor 
   ouvir a porta 3000 */
server.listen(3000)
