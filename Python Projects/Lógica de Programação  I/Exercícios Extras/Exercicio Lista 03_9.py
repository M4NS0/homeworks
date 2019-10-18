print("\n\nEsse algoritmo calcula e imprime o salário reajustado de um funcionário de acordo com as seguintes regras:"
      + "\nSalários de até R$ 950,00 reajuste de 50%;"
      + "\nSalários maiores que R$ 950,00 reajuste de 30%.")

salario = float(input("\nDigite o valor do seu salário atual: "))

if salario<=950:
    correcao = (950 * (50/100)) + 950
    print("\nO salário reajustado é de {} R$.".format(correcao))
else:
    correcao = (950 * (30/100)) + 950
    print("\nO salário reajustado é de {} R$.".format(correcao))
