print("Esse algoritmo que lê 3 números inteiros e que mostra o maior deles, supondo que todos sejam distintos")

n1 = int(input("\nInsira o primeiro número inteiro: "))
n2 = int(input("\nInsira o segundo número inteiro diferente do primeiro: "))
n3 = int(input("\nInsira o segundo número inteiro diferente do primeiro e do segundo: "))

if (n1>n2) and (n1>n3):
    print("\nO número {} é o maior".format(n1))
if (n2>n1) and (n2>n3):
    print("\nO número {} é o maior".format(n2))
if (n3>n1) and (n3>n2):
    print("\nO número {} é o maior".format(n3))
          
