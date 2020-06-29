nome1 = str(input("Digite o nome do player 1: "))
num1 = int(input("{}, digite um numero inteiro de 1 a 10: ".format(nome1)))

while (num1<=0) | (num1>10):
    num1 = int(input("INVALIDO! Digite um numero inteiro de 1 a 10: ".format(nome1)))

nome2 = str(input("Digite o nome do player 2: "))
num2 = int(input("{}, tente adivinhar o numero de {} 1 a 10: ".format(nome2,nome1)))

while (num1<=0) | (num1>10):
    num2 = int(input("INVALIDO! Digite um numero inteiro de 1 a 10: ".format(nome2)))

while (num1 != num2):
    cont: int = 1
    num2 = int(input("\nERROU! Tente de novo digitando um numero inteiro de 1 a 10: ".format(nome2)))
    cont = cont + 1
print("\nACERTOU!{}, o numero digitado foi o numero {} e você acertou na {} tentativa".format(nome2,num2,cont))