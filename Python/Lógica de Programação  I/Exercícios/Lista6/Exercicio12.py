cont = 0
soma = 0
maiorNum = -9999
menorNum = 99999
pos = 0
neg = 0
perPos = 0
perNeg = 0

quantNums = int (input("\nInsira o tamanho da sequencia de numeros para calculos: "))

while (quantNums < 0):
    quantNums = int(input("O valor digitado é NEGATIVO, insira um novo numero: "))

while (quantNums > 20):
    quantNums = int(input("O valor digitado é MAIOR que 20, insira um novo numero: "))

while quantNums > cont:
    cont += 1
    num = int(input("Insira o {} numero da sequencia: ".format(cont)))

    soma = soma + num
    media = soma /quantNums

    if maiorNum < num:
        maiorNum = num
    if menorNum > num:
        menorNum = num

    if num>0:
        pos = pos + 1
    if num<0:
        neg = neg + 1

    perPos = (pos*100)/(pos+neg)
    perNeg = (neg*100)/(pos+neg)

print("\nO Maior valor da sequência: {} \nO Menor valor da sequência: {} \nA Soma dos valores da sequência: {} \nA Media: {} \nA Porcentagem de Positivos: {} \nA Porcentagem de Negativos: {}"
          .format(maiorNum,menorNum,soma,media,perPos,perNeg))


