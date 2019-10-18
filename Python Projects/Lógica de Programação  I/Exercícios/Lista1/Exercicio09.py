
print(" Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).")
cotacao = float(input("Digite a  cotação do Dolar de hoje: "))
valor = float(input("Digite o valor a ser convertido de Reais para Dolares: "))

convertido = cotacao * valor

print(" O valor convertido é igual a: {} ".format(convertido))