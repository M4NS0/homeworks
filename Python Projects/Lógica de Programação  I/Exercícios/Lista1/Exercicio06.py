import math

print(
    "Solicitar ao usuário quatro valores quaisquer. Imprimir a raiz quadrada do primeiro, o segundo valor digitado multiplicado por 10, o terceiro menos 1 e o quarto valor será a soma de todos os resultados anteriores.")
n1 = float(input("Digite o primeiro numero: "))
n2 = float(input("Digite o segundo numero: "))
n3 = float(input("Digite o terceiro numero: "))
n4 = float(input("Digite o quarto numero: "))

rzqd = math.acossqrt(n1)
multiplicado = n2 * 10
menos1 = n3 - 1
soma = rzqd + multiplicado + menos1

print("O resultado dessa conta é igual a {}".format(soma))
