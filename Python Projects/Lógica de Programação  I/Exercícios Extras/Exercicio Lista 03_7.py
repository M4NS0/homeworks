print("\nDesenvolver um algoritmo para ler um número X e calcular e imprimir o valor de Y"
      + "de acordo com as condições a seguir: Y ← X , se X <1 ;Y ← 0 , se X = 1 e Y ← X 2 , se X >1.")

x = int(input("Insira um valor em X, positivo ou negativo:" ))

if x<1:
    print("\nValor de Y = X")
elif x==1:
    print("\nValor de Y = 0")
elif x>1:
    y = x ^ 2
    print("\nValor de Y = {}".format(y))
