print("Em uma loja existe um total mensal de vendas. Fazer a leitura do nome da loja e dos totais de /n vendas em um ano. Imprimir o nome da loja e os totais de vendas semestrais.\n")

nome = str(input("Digite o nome da loja: "))
totalanual = int(input("Digite o total das vendas: "))

totaldosemestre = totalanual / 2

print("A loja se chama {}, o total das vendas anuais é {} e  o total das vendas por semestre é {}".format(nome, totalanual, totaldosemestre))
