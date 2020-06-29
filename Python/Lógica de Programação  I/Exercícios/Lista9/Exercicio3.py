MAX = 50
num = list(range(MAX))

for cont in range(0,MAX,1):
    num[cont] = int(input("Digite o numero {}:".format(cont)))

print("\nLista de numeros multiplicados por 3")
for cont in range (1,MAX,1):
    print(num[cont]*3)
