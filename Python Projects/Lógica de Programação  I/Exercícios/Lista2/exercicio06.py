print("Ler o valor de troca de um dólar por um real e o valor de uma quantia em dólar. \nImprimir a quantia de reais correspondente aos dólares lidos.")

cotacao = float(input("Insira a cotação do Dollar de hoje: "))
quantidade = float(input("Insira a quantidade de Dollares para a conversão: "))

valorconvertido = quantidade * cotacao

print("Na cotação de {} R$, {} USD hoje é igual a {} R$".format(cotacao,quantidade,valorconvertido))

