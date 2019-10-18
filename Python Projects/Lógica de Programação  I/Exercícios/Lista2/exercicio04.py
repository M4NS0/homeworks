print("Ler os dados de uma conta corrente: o nome do correntista,\n o nome do banco, o número da conta, o valor total de cheques a debitar,\n o total de dinheiro e cheques a creditar, o limite de crédito e o saldo atual. \nImprimir o nome do correntista, o nome do banco, o número da conta e o saldo disponível \n(saldo disponível = (saldo atual + valor do crédito + limite) - valor do débito")

nome = str(input("Escreva o nome do correntista: "))
nomedobanco = str(input("Escreva o nome do banco: "))
numerodaconta = float(input("Escreva o número da conta: "))
chequeadebitar = float(input("Escreva o valor dos cheques a debitar: "))
totaldinheiro = float(input("Digite o total em dinheiro: "))
chequesacreditar = float(input("Digite o valor dos cheques a creditar: "))
limitedecredito = float(input("Digite o limite de crédito do cliente: "))
saldoatual = float(input("Digite o saldo atual: "))

saldodisponivel = (saldoatual + chequesacreditar + limitedecredito) - chequeadebitar

print("{}, que é correntista do {}, têm {} R$ em cheques a debitar em sua conta, seu total de dinheiro é de  \n{} R$, têm cheques a cair no valor de {} R$, seu limite de crédito é de {}, seu saldo atual é de {} R$ e seu saldo disponivel é de {} R$".format(nome,nomedobanco,chequeadebitar,totaldinheiro,chequesacreditar,limitedecredito,saldoatual,saldodisponivel))
