MAX = 50
prof = list(range(MAX))
temp = list(range(MAX))

for cont in range(0,MAX,1):
    prof[cont] = str (input("Digite o nome do professor numero {}:".format(cont+1)))
    temp[cont] = int (input("Digite o tempo de profissao do professor {}:".format(prof[cont])))

print("Lista de professores e tempo de profissao:")

for cont in range (0,MAX,1):
    print("{} - Professor(a) - {} tem {}".format(cont+1,prof[cont],temp[cont]))