MAX = 3
codigo = list(range(MAX))
quant = list(range(MAX))

for cont in range(1,MAX,1):
    codigo[cont] = str(input("Digite o Codigo: "))
    quant[cont] = int(input("Digite  a quantidade do produto {}: ".format(codigo[cont])))

print("\n Lista de produto e quantidade: ")
for cont in range(1,MAX,1):
    print("{} - Produto - '{}' = {} unidades ".format(cont+1,codigo[cont],quant[cont]))