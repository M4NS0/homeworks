cont = 0
somaNum = 0
maiorNum = -9999
menorNum = 99999
resposta = "C"
mediaNum = 0

while resposta=="C":
    quant = int(input("Digite a quantidade de numeros que serao inserido: "))

    while quant < 0:
        quant = int(input("Numero invalido por ser Negativo.\n\tInsira um numero positivo: "))

    while quant > 20:
        quant = int(input("Numero invalido por ser Maior que 20.\n\tInsira um numero menor: "))

    while quant>cont:
        cont = cont + 1
        num = int(input("Digite o valor do numero {}:".format(cont)))


        somaNum = somaNum + num

        if maiorNum < num:
            maiorNum = num
        if menorNum > num:
            menorNum = num

    resposta = str(
        input("\n\tSe deseja encerrar o programa digite \"e\" \n\tSe deseja efetuar novos calculos digite \"c\": "))

print("\nO Maior: {} \nO Menor: {} \nA Soma: {} \nA Media: {} "
          .format(maiorNum,menorNum,somaNum,mediaNum))

cont = 0
somaNum = 0
maiorNum = -9999
menorNum = 99999
num = 0

while resposta == "e" or resposta == "E":
    print("Fim")
    break