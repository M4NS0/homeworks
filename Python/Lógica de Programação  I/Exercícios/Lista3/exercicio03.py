
print("\n\tEste programa deve ler os anos de nascimento de duas pessoas\n\te calcular suas idades. Imprimir o nome e a idade de cada uma\n\te indicar qual a mais nova.")

nome1 = str(input("\n\n\tDigite o nome da primeira pessoa: "))
nome2 = str(input("\n\tDigite o nome da segunda pessoa: "))

idade1 = int(input("\n\tAgora, digite o ano de nascimento de {}: ".format(nome1)))
idade2 = int(input("\n\tAgora, digite o ano de nascimento de {}: ".format(nome2)))

if idade1>idade2:
    print("\n\t{} é mais novo(a) que {}.".format(nome1,nome2))
elif idade1<idade2:
    print("\n\t{} é mais velho(a) que {}.".format(nome1,nome2))
