print("\Inserindo quatro números distintos, desenvolva um algoritmo que determine e imprima a soma dos três menores.\n")

n1 = float(input("Insira o primeiro número: "))
n2 = float(input("Insira o segundo número: "))
n3 = float(input("Insira o terceiro número: "))
n4 = float(input("Insira o quarto número: "))

if (n1<n4) and (n2<n4) and (n3<n4):
    soma = n1+n2+n3
    print("\nA soma dos 3 menores números é {}".format(soma))
    
if (n1<n3) and (n2<n3) and (n4<n3):
    soma = n1+n2+n4
    print("\nA soma dos 3 menores números é {}".format(soma))

if (n1<n2) and (n3<n2) and (n4<n2):
    soma = n1+n3+n4
    print("\nA soma dos 3 menores números é {}".format(soma))

if (n2<n1) and (n3<n1) and (n4<n1):
    soma = n2+n3+n4
    print("\nA soma dos 3 menores números é {}".format(soma))

    

    
    
