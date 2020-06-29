MAX = 200
cont = 0
num = list(range(MAX))

while cont<MAX:
    num[cont] = str(input("Digite o {}o: ".format(cont+1)))
    cont +=1

print("\nLista de Números:  " )
cont == MAX
while cont>0:
    cont -= 1
    print(num[cont])
