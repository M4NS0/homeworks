Saida = ""
S = input("Digite uma frase: ")
P = input("Digite uma palavra: ")
if P in S:
    Saida += "Sim"
else:
    Saida += "Não"
print ("A palavra ", P, " existe?\n", Saida)
