escolha = "S"
somaPares = 0
mediaImpares = 0
somaImpares = 0
impares = 0

while escolha == "S" or escolha == "s":
    num = int(input("Digite um numero para efetuar calculos:"))

    if num < 0:
        num = int(input("Numero negativo, digite um novo positivo:"))

    if (num % 2) == 0:
        somaPares = somaPares + num

    if (num % 3) == 0:
        impares += 1
        somaImpares = somaImpares + num
        mediaImpares = somaImpares/impares
    escolha = str (input("Deseja inserir novo numero? 'S' ou 'N':"))

if escolha == "n" or escolha == "N":
    print("Soma pares: {} \nMédia Impares: {}".format(somaPares,mediaImpares))