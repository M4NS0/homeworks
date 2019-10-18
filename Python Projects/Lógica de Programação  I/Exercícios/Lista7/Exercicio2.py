num = 2
cont = 1

numero = int (input("Insira um numero que define o fim da soma de numeros apartir do numero 1:"))

while numero>cont:
    cont += 1
    num = num + cont
while numero<cont:
    cont -= 1
    num = num +cont
print("A soma = {} ".format(num))
