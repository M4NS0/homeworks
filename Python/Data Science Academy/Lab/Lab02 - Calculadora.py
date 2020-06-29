print("=======   Calculadora Simples em Python   =======")
print("\n")

def soma(x,y):
    return x+y

def sub(x,y):
    return x-y

def mult(x,y):
    return x*y

def div(x,y):
    return x/y


print("Bem vindo a Calculadora de operações simples em python!")
print("Por Favor, escolha o tipo de operação que deseja efetuar:")
print("\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n0- Sair")
op = input("\nDigite: ")
num1 = float(input("Insira o primeiro número: "))
num2 = float(input("Insira o segundo número: "))


while op != '0':
    if op == '1':
        print("\nRESULTADO   {} + {} = {}".format(num1, num2, soma(num1, num2)))

    if op == '2':
        print("\nRESULTADO   {} + {} = {}".format(num1, num2, sub(num1, num2)))

    if op == '3':
        print("\nRESULTADO   {} + {} = {}".format(num1, num2, mult(num1, num2)))

    if op == '4':
        print("\nRESULTADO   {} + {} = {}".format(num1, num2, div(num1, num2)))

    print("Deseja efetuar outra operação? escolha:")
    print("\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n0- Sair")
    op = input("\nDigite: ")
    num1 = float(input("Insira o primeiro número: "))
    num2 = float(input("Insira o segundo número: "))