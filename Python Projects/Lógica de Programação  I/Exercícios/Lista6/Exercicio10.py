numerador = 1
denominador = 2
somaParcial = 0


num = int(input("\n\nInsira um No:"))

while num < 0 or num > 50:
    num = int(input("\nInvalido, precisa ser maior que ZERO e menor que 50. Insira outro No:"))
while num >= numerador:
    divisao = numerador/denominador
    numerador += 1
    denominador += 1
    somaParcial = somaParcial + divisao
print("\n\nRESULTADO: {}".format(somaParcial))