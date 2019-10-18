print("\nEste algoritmo lê o código de um aluno e suas três notas. Calcula a média ponderada do aluno"
      + "\nque o peso para a maior nota seja 4 e para as duas restantes, 3. Mostre o código do aluno, suas"
      + "\ntrês notas, a média calculada e uma mensagem \"APROVADO\" se a média for maior ou igual a 5 e"
      + "\n\"REPROVADO\" caso contrário.\n")

nome = str(input("Insira o nome do Aluno(a): "))
nota1 = float(input("Insira o valor da primeira prova de {}: ".format(nome)))
nota2 = float(input("Insira o valor da segunda prova de {}: ".format(nome)))
nota3 = float(input("Insira o valor da terceira prova de {}: ".format(nome)))

if (nota1>nota2) & (nota1>nota3):
    media = ((nota1 * 4) + (nota2 * 3) + (nota3 * 3)) / (4 + 3 + 3)
    if media>=50:
        print("\nO Aluno {} obteve \n{} em sua N1 \n{} em sua N2 \n{} em sua N3 \nSua media foi {} \nPorisso ele está Aprovado".format(nome,nota1,nota2,nota3,media))
    elif media<50:
        print("\nO Aluno {} obteve \n{} em sua N1 \n{} em sua N2 \n{} em sua N3 \nSua media foi {} \nPorisso ele está Reprovado".format(nome,nota1,nota2,nota3,media))

if (nota2>nota1) & (nota2>nota3):
    media = ((nota1 * 3) + (nota2 * 4) + (nota3 * 3)) / (4 + 3 + 3)
    if media>=50:
        print("\nO Aluno {} obteve \n{} em sua N1 \n{} em sua N2 \n{} em sua N3 \nSua media foi {} \nPorisso ele está Aprovado".format(nome,nota1,nota2,nota3,media))
    elif media<50:
        print("\nO Aluno {} obteve \n{} em sua N1 \n{} em sua N2 \n{} em sua N3 \nSua media foi {} \nPorisso ele está Reprovado".format(nome,nota1,nota2,nota3,media))

if (nota3>nota1) & (nota3>nota2):
    media = ((nota1 * 3) + (nota2 * 3) + (nota3 * 4)) / (4 + 3 + 3)
    if media>=50:
        print("\nO Aluno {} obteve \n{} em sua N1 \n{} em sua N2 \n{} em sua N3 \nSua media foi {} \nPorisso ele está Aprovado".format(nome,nota1,nota2,nota3,media))
    elif media<50:
        print("\nO Aluno {} obteve \n{} em sua N1 \n{} em sua N2 \n{} em sua N3 \nSua media foi {} \nPorisso ele está Reprovado".format(nome,nota1,nota2,nota3,media))

