print("\nEsse algoritmo lê um número inteiro e verifica se este é divisível por 5 e por 3 ao mesmo tempo.")
numero = float(input("\nInsira um número qualquer: "))

resto1 = numero % 3
resto2 = numero % 5

if (resto1 == 0) and (resto2 == 0):
    print("\nEste número é divisível por 3 e por 5 ao mesmo tempo\n")
else:
    print("\nEste número não é divisível por 3 e por 5 ao mesmo tempo\n")





