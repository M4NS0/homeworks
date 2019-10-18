repeticao = 0

while repeticao >= 0:
    sexo = str(input("'M' para mulher e 'H' para homem: "))

    if sexo != "M" and sexo != "H" and sexo != "m" and sexo != "h":
        sexo = str (input ("SEXO INVALIDO! Digite 'M' para MULHER e 'H' para Homem: "))