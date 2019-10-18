MAX = 100
nome = list(range(MAX))
contador  = 0

while contador < MAX:
    nome[contador] = str (input("Digite o nome da {} pessoa: ".format(contador+1)))
    contador += 1
contador = 0
print("\nlista de nomes: ")
while contador < MAX:
    print (nome[contador])
    contador += 1

