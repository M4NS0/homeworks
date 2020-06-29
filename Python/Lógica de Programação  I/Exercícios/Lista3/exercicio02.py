print("\n\tEste programa vai ler os nomes e os pesos de duas pessoas\n\te imprimir os dados da pessoa mais pesada.")

nome1 = str(input("\n\n\tDigite o nome da primeira pessoa:"))
peso1 = float(input("\tDigite o peso da primeira pessoa: "))

nome2 = str(input("\n\n\tDigite o nome da primeira pessoa:"))
peso2 = float(input("\tDigite o peso da segunda pessoa: "))

if peso1>peso2:
    print("\n\t{} é mais pesada que {}.".format(nome1,nome2))
elif peso1<peso2:
    print("\n\t{} é mais pesada que {}.".format(nome2,nome1))
