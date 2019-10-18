print("\n\tO programa a seguir, resolve o seguinte problema:\n\tUma empresa da um premio aos funcionarios que cumprem ou \n\tultrapassam determinado valor de vendas de produtos.\n\tA cada funcionario foi estabelecido um valor a ser alcançado.\n\tFaça um algoritmo para ler o valor fixado e o valor \n\tde vendas de um funcionario , e imprimir a mensagem \n\t\"Ganhou! :D\", se o funcionario tiver conseguido o premio e \"Nao Ganhou :(\", se nao tiver conseguido.")

nome = str(input("\n\n\tDigite o seu nome: "))
valorfixado = float(input("\n\tDigite o valor Fixado: "))
valorvendas = float(input("\n\tDigite o valor total das suas vendas: "))

if valorvendas>valorfixado:
    print("\n\t{}, Você Ganhou!!".format(nome))
elif valorvendas<valorfixado:
    print("\n\t{}, Você Perdeu :( ".format(nome))
