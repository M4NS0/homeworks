print("\nEsse algorítmo calcula a média aritmética das 3 notas de um aluno e mostre, além do valor da média do aluno, uma "
+ "mensagem de \"Aprovado\", caso a média seja igual ou superior a 6, ou a mensagem \"reprovado\", caso contrário.\n")

nome = str(input("Insira o nome do aluno: "))
nota1 = float(input("Insira o valor da primeira nota de {}: ".format(nome)))
nota2 = float(input("Insira o valor da segunda nota de {}: ".format(nome)))
nota3 = float(input("Insira o valor da terceira nota de {}: ".format(nome)))

media = (nota1 + nota2 + nota3) / 3

if media>=60:
    print("\n{}, você foi Aprovado(a)!".format(nome))
else:
    print("\n{}, você foi Reprovado(a)!".format(nome))
    
