
# é um resultado booleano

if 5 > 2:
    print("Verdadeiro")
else:
    print("Falso")


if 5 < 2:
    print("Verdadeiro")
else:
    print("Falso")


# quando 5 = 5 ele espera uma atribuição e nao uma igualdade
if 5 == 5:
    print("Verdadeiro")


if True:
    print("True")

idade = 18
if idade > 17:
    print("Voce pode dirigir")

nome = "Bob"

# estruturas condicionais if aninhadas
if idade > 13:
    if nome == "Bob":
        print("Autorizado a entrar")
    else:
        print("Não autorizado!")

# estruturas aninhadas com operador logico 'and'
# as duas condicoes devem ser satisfeitas
if idade >= 13 and nome == "Bob":
    print("Ola Bob, entrada autorizada!")

idade = 12
# estruturas aninhadas com operador logico 'ou'
# se uma condicao for verdadeira ou a outra tambem for, execute a acao
if (idade >= 13) or (nome == "Bob"):
    print("Ola Bob, entrada autorizada!")

dia = "Terça"
if dia == "Segunda":
    print("Hoje fará sol!")
else:
    print("Hoje vai chover!")

# se
if dia == "Segunda":
    print("Hoje fara sol!")
# elif =  senão
elif dia == "Terça":
    print("Hoje vai chover!")
# else =  ainda mais, outra
else:
    print("Sem previsao do tempo para o dia")

idade = 18
nome = "Bob"

if idade > 17 and nome == "Bob":
    print("Autorizado!")

diciplina  = input("Insira o nome da disciplina: ")
nota_final = input("Digite a nota final entre 0 e 100:")
semestre = input("Digite o semestre de 1 a 4: ")


if diciplina == "Geografia" or diciplina == "geografia" and nota_final >= "70":
    print("{} Semestre - Voce foi aprovado em {}, com nota {}".format(semestre,diciplina,nota_final))
else:
    print("{} Semestre - Lamento vc bombou em {}, com nota {}".format(semestre,diciplina, nota_final))
