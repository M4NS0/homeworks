print("\nNúmeros quadrados perfeitos são aqueles cuja raiz quadrada é um número inteiro."
      + "\nExemplo 144. Fazer um algoritmo que dado um número inteiro positivo, calcule "
      + "\ne escreva se este é ou não quadrado perfeito.")
import math
numero = int(input("\nInsira um numero inteiro positivo: "))

i = int(math.sqrt(numero))

if (numero == i*i):
    print("\nEsse é um quadrado perfeito!")
else:
    print("\nEsse não é um quadrado perfeito")

    
