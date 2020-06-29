somaIdade = 0

i = 0
iMasc = 0
iFem = 0
iExpMaior = 0

opcao = int(input("Deseja cadastrar? '1' Sim ou '2' Não"))

while opcao != 2:
    i = i +1
    numero = int(input("Insira o numero do candidato(a) {}: ".format(i)))
    sexo = str(input("Insira o Sexo (M ou F) do candidado(a) {}: ".format(numero)))
    idade = int(input("Insira a idade do candidato(a) {}:".format(numero)))
    experiencia = str(input("Digite se o candidato(a) {} tem experiencia (S ou N): ".format(numero)))

    SomaIdade = somaIdade + idade

    if (sexo == "M"):
        iMasc = iMasc + 1
    if (sexo == "F"):
        iFem = iFem +1
    if (idade >= 18 and experiencia == "S"):
        iExpMaior = iExpMaior + 1

    opcao = int(input("Se deseja continuar digite '1', se deseja sair e imprimir um relatório digite '2':"))



mediaIdade = somaIdade / i

print("\n\nMedia das Idades: {} anos ".format(mediaIdade))
print("Candidatos: {}".format(iMasc))
print("Candidatas: {}".format(iFem))
print("Com Exp e Maiores de Idade: {} ".format(iExpMaior))


