print("\n\tEsse programa vai ler dois valores e mostrar a \n\tdiferença entre eles (o maior valor menos o menor valor)")

valor1 = float(input("\n\n\tDigite o PRIMEIRO valor: "))
valor2 = float(input("\n\n\tDigite o SEGUNDO valor: "))

diferenca1 = valor1 - valor2
diferenca2 = valor2 - valor1

if valor1>valor2:
    print("\n\tA diferença entre os valores é: {}".format(diferenca1))
elif valor1<valor2:
    print("\n\tA diferença entre os valores é: {}".format(diferenca2))
    
