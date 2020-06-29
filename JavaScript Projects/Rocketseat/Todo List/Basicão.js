
// Hello World

document.write("Hello World")

// Variables

var myvar = ""
myvar = "Hello World - variable"
const myconst = "Hello World - const"
document.write(myvar)
document.write(myconst)
document.write(myvar + myconst)


// Strings

const s1 = "com aspas duplas"
const s2 = 'com aspas simples'
const s3 = `com crase`


// Numbers

const n1 = 1
const n2 = 12
document.write(n1 + n2)

const n3 = "1"
const n4 = 12
document.write(n1 + n2)


// Booleans

const bTrue = true
const bFalse = false
document.write(bTrue)


// Objects

const pessoa = {
  altura: "1,80m",
  idade: "24",
  solteiro: true,  
  correr() {
    document.write("Run to the hills")
    return "Run for your life"
  }
}

document.write(pessoa.altura)
document.write(pessoa.idade)
document.write(pessoa.solteiro)
document.write(pessoa.correr())
pessoa.correr()


// Arrays

const colecaodeBolinhas = ["blue", "green", 1, {name: "My name"}]
document.write(colecaodeBolinhas[3].name)


// Functions

function sayMyName() {
  document.write("Heizenberg")
}
sayMyName()

function sayMyName(name) {
  document.write(name)
}
sayMyName("Heizenberg")

// Condicionals

const notaFinal = 7
if ( notaFinal < 5) document.write("Reprovado")
else document.write("Aprovado") 

const notaFinal2 = 7 
if ( notaFinal < 5) { 
  document.write("Reprovado")
} else {
  document.write("Aprovado") 
}

// Loops

for (i = 0; i < 100; i ++) {
  document.write("<p> Fuck the police </p>")
}

for (i = 0; i < 100; i ++) {
  document.write(`<p> ${i} </p>`)
}

var i = 0
while (i<100) {
  document.write("<p> FuckThePolice " + `${i}` + "</p>")
  i++
}
