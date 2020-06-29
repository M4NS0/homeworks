print("Ler o nome e as três notas de um aluno qualquer, o nome da disciplina e o número da turma. Imprimir os dados lidos e a média aritmética das notas (soma das notas dividida por três).")

nome = str(input("Escreva o nome do aluno: "))
nota1 = float(input("Escreva sua primeira nota: "))
nota2 = float(input("Escreva sua segunda nota: "))
nota3 = float(input("Escreva sua terceira nota: "))

media = ( nota1 + nota2 + nota3 ) / 3

print("{} tirou {} em sua primeira prova, tirou {} em sua segunda prova e tirou {} em sua terceira prova. Sua média é de {}".format(nome,nota1,nota2,nota3,media)) 
