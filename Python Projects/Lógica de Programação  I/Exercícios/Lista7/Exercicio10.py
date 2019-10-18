somaM = 0
somaM25 = 0
maiorA = -2.99
menorA = 2.99
pesoSoma = 0
idadeTotal = 0

cadastro = int (input("Digite  a quantidade de pessoas para cadastro:"))

for cont in range (0,cadastro,1):
    idade = int(input("Digite sua idade: " ))
    idadeTotal = idadeTotal + idade

    altura = float(input("Digite sua altura: "))

    peso = float (input("Digite seu peso: "))
    pesoSoma = pesoSoma + peso

    sexo = str(input("Qual seu sexo: "))

    if sexo == "f" or sexo == "F":
        somaM += 1

        if (idade<25):
            somaM25 += 1

    if maiorA<idade:
        maiorA=idade

    if menorA<idade:
        menorA=idade

MediaIdade = idadeTotal/ cadastro
percent = (somaM25*100) / somaM

print ("A media de idade: {} \nSomatorio de pesos: {}\nPorcentagem de mulheres com idade inferior a 25: {}\nMaior altura: {}\nMenor altura: {}".format(MediaIdade,pesoSoma,percent,maiorA,menorA))