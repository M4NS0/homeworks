contador = 0

while (contador >= 0 ):
    num1 = float (input ("Insira o 1o valor: "))
    num2 = float ( input("Insira o 2o valor: "))

    if num2 >= num1:
        num1 = float(input("Insira o 1o valor: "))
        num2 = float(input("Insira o 2o valor: "))
    if num2 < num1:
        num2 = float(input("Primeiro número MAIOR que o segundo, insira o 2o valor novamente:"))
