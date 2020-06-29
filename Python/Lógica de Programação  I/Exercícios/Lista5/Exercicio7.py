opcao = 1
while (opcao != 0):
    cpf = str(input("\n\nDigite seu CPF:"))
    nome = str(input("Digite seu Nome:"))
    rendaAnual = float(input("Digite sua Renda Anual:"))
    numeroDependentes = float(input("Número de Dependentes:"))

    desconto = numeroDependentes * 110.0
    rendaLiquida = rendaAnual - desconto

    if rendaLiquida <= 900:
        print("\n\nRenda Liquida: {}R$ - ISENTO!".format(rendaLiquida))
    elif rendaLiquida <= 5000:
        imposto = rendaLiquida * 0.05
        print("\n\nRenda Liquida: {}R$ - {}R$ a pagar".format(rendaLiquida,imposto))
    elif rendaLiquida <= 10000:
        imposto = rendaLiquida * 0.10
        print("\n\nRenda Liquida: {}R$ - {}R$ a pagar".format(rendaLiquida, imposto))
    else:
        imposto = rendaLiquida * 0.15
        print("\n\nRenda Liquida: {}R$ - {}R$ a pagar".format(rendaLiquida, imposto))


opcao = str (input("Deseja continuar cadastrando? \n Digite '1' para SIM ou '2' para NÂO:"))
print("\n [FIM DO PROGRAMA]")