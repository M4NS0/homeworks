max = 70
aprovados = 0
reprovados = 0
somaNotaTurma = 0
maiorMedia = 0
menorMedia = 10


for cont in range(1,max):
    matricula = str(input("\n\nDigite a matrícula do {}º aluno: ".format(cont)))
    n1 = float(input("Digite a N1: "))
    n2 = float(input("Digite a N2: "))
    n3 = float(input("Digite a N3: "))
    frequencia = int(input("Digite a quantidade de aulas frequentadas (máx: 32): "))

    media = (n1+n2+n3) / 3
    somaNotaTurma = somaNotaTurma + media

    if (media>=7) & (frequencia>=26):
        print("\nAluno Nº {} \nMEDIA: {} \nSTATUS: APROVADO!".format(matricula,media))
        aprovados = aprovados + 1

    if (media<=7) & (frequencia<26):
        print("\nAluno Nº {} \nMEDIA: {} \nFREQUENCIA {} \nSTATUS: REPROVADO POR FREQUENCIA!".format(matricula,media,frequencia))
        reprovados = reprovados + 1

    if (media < 7) & (frequencia >= 26):
        print("\nAluno Nº {} \nMEDIA: {} \nFREQUENCIA {} \nSTATUS: REPROVADO POR NOTA!".format(matricula,media,frequencia))
        reprovados = reprovados + 1
    if (media >= 7) & (frequencia < 26):
        print("\nAluno Nº {} \nMEDIA: {} \nFREQUENCIA {} \nSTATUS: REPROVADO POR FREQUENCIA!".format(matricula,media,frequencia))

    if (media>=maiorMedia):
        maiorMedia = media
    if (media<=menorMedia):
        menorMedia=media

mediaTurma = somaNotaTurma /max
reprovados = max - aprovados

print("\n\n-----------RELATÓRIO------------\n MEDIA DA TURMA: {} \n MAIOR MEDIA: {} \n MENOR MEDIA {} \n REPROVADOS: {}".format(mediaTurma,maiorMedia,menorMedia,aprovados,reprovados))