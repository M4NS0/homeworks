print("Esse programa vai solicitar dois numeros aleatórios, calcula sua divisão inteira e seu resto, imprimindo o resultado")
n1 = int(input("digite um numero aleatório: "))
n2 = int(input("digite outro numero aleatorio: "))

divisao = n1 / n2
resto = n1 % n2

print("O primeiro valor dividido pelo segundo é igual a: {} e o resto é: {}".format(divisao, resto))