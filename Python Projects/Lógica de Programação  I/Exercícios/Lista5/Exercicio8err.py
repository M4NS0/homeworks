contReposicoes: int = 0
reposicoes: int = 0
contaAp: int = 0
numPecasReposicao: str

for cont in range(1, 3):
    numero: str = input("\n\nDigite o número da  {} peça: ".format(cont))
    opcao = str(input("Digite 'A' se ela foi aprovada, ou 'R' se ela foi rejeitada: "))

    if opcao == "A":
        contaAp = contaAp + 1
    else:
        reposicoes = reposicoes + 1

        contReposicoes = contReposicoes + 1

        ## nao soube concatenar string e numero

        numPecasReposicao = str(numPecasReposicao) + numero

print("\n--------RELATORIO--------\n Aprovadas: {} \n Reprovadas: {}\n Numeração das Peças Reprovadas: {} ".format(
    contaAp, reposicoes, numPecasReposicao))





