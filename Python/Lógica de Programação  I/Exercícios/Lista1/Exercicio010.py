
print("Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.")

produto1 = float(input("Digite o valor do primeiro produto: "))
produto2 = float(input("Digite o valor do segundo produto: "))
produto3 = float(input("Digite o valor do terceiro produto: "))
produto4 = float(input("Digite o valor do quarto produto: "))
produto5 = float(input("Digite o valor do quinto produto: "))


pagamento = produto1 + produto2 + produto3 + produto4 +  produto5
troco = pagamento - (produto1 + produto2 + produto3 + produto4 +  produto5)

print("O valor do pagamento será {}".format(pagamento))
print("O valor do troco será {}".format(troco))


