escolha = "S"
media = 0
maisVotado = 0
somaIdadeA = 0
somaIdadeB = 0
somaIdadeC = 0
maisVotadosHA = 0
maisVotadosHB = 0
maisVotadosHC = 0
m = 0
h = 0
a=0
b=0
c=0


while escolha == "S" or escolha == "s":
    voto = str(input("Escolha entre 'A', 'B' e 'C':"))
    sexo = str (input("Qual seu sexo? 'M' ou 'H': "))

    if sexo == "m" or sexo == "M":
        m += 1
    if sexo == "h" or sexo == "H":
        h += 1

    idade = int (input("Digite sua idade: "))

    escolha = str(input("Se deseja continuar cadastrando digite 'S' ou 'N' se deseja terminar e exibir relatorio: "))

    if voto == "A":
        a += 1
        if sexo == "m" or sexo == "M":
            maisVotadosHA += 1
    if voto == "B":
        b += 1
        if sexo == "m" or sexo == "M":
            maisVotadosHB += 1
    if voto == "C":
        c += 1
        if sexo == "m" or sexo == "M":
            maisVotadosHC += 1

    somaIdadeA = somaIdadeA + idade
    somaIdadeB = somaIdadeB + idade
    somaIdadeC = somaIdadeC + idade

    if a>b and a>c:
        maisVotado += 1
        media = somaIdadeA / (a + b + c)
        print("O Mais votado foi o candidato A com {} votos".format(maisVotado))

    if b>a and b>c:
        maisVotado += 1
        media = somaIdadeB / (a + b + c)
        print("O Mais votado foi o candidato B com {} votos".format(maisVotado))


    if c>a and c>b:
        maisVotado += 1
        media = somaIdadeC / (a + b + c)
        print("O Mais votado foi o candidato A com {} votos".format(maisVotado))

    if maisVotadosHA> maisVotadosHB and maisVotadosHA > maisVotadosHC:
        maisVotadosHA += 1
        print("O Mais votado entre os homens foi o candidato A com {} votos".format(maisVotadosHA))

    if maisVotadosHB > maisVotadosHA and maisVotadosHB > maisVotadosHC:
        maisVotadosHB += 1
        print("O Mais votado entre os homens foi o candidato B com {} votos".format(maisVotadosHB))

    if maisVotadosHC > maisVotadosHA and maisVotadosHC > maisVotadosHB:
        maisVotadosHC += 1
        print("O Mais votado entre os homens foi o candidato A com {} votos".format(maisVotadosHC))





