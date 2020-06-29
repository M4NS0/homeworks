print ("Ler o nome de um cliente de fast food e a quantidade de cada item do menu que ele vai pedir.\nImprimir o nome do cliente e o total da compra.\n")

nome = str(input("Qual nome do cliente que faz o pedido? "))
bigmac = int(input("Digite a quantidade de BigMac's: "))
valorbigmac = float(input("Quanto custa cada Bigmac? "))
macfritas = int(input("Digite a quantidade de MacFritas: "))
valormacfritas = float(input("Quanto custa cada batata frita? "))
refrigerante = int(input("Digite a quantidade de refrigerantes de 600ml: "))
valorrefrigerante = float(input("Quanto custa cada refrigerante de 600ml? "))
casquinha = int(input("Digite a quantidade de casquinhas de sorvete: "))
valorcasquinha = float(input("Quanto custa cada casquinha de sorvete? "))

total = (bigmac * valorbigmac) + (macfritas * valormacfritas) + (refrigerante * valorrefrigerante) + (casquinha * valorcasquinha)

print("\n{} pediu: \n{} Bigmac's no valor de {} R$ cada, \n{} MacFritas no valor de {} R$ cada, \n{} Refrigerante(s) no valor de {} R$ cada  \n{} casquinha no valor de {} R$. \nO total da compra é de {} R$".format(nome,bigmac,valorbigmac,macfritas,valormacfritas,refrigerante,valorrefrigerante,casquinha,valorcasquinha,total))
