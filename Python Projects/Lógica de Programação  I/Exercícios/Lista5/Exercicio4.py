num: int = 3
soma: int = 3
total: int = 0


print ("\n\t→ {} soma do numero 1 com o numero 2".format(soma))
for num in range(3,10):
    soma = soma + num
    if num != 10:
        print("\t→ {} soma parcial com o número {}".format(soma,num))

