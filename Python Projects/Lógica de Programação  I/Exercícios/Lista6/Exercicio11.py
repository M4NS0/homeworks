max = 3
media = 0
maiorNum = -9999
menorNum = 99999
soma = 0


for cont in range(1, max):
    num = int (input("Insira o valor #{}: ".format(cont)))

    while num <0 :
        num = int(input("Invalido, valor deve ser POSITIVO. Insira o valor #{}: ".format(cont)))

    if maiorNum<num:
        maiorNum=num
    if menorNum>num:
        menorNum=num

    soma = soma + num
    media = soma/cont
print("\nO Maior: {}\nO Menor: {} \nSoma: {} \nMedia: {}".format(maiorNum,menorNum,soma,media))