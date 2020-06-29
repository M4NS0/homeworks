print("\n\tEste programa tem objetivo de ler um numero\n\te verificar se ele é par ou impar. Observacao:\n\tpara o numero ser par, o resto de sua divisao\n\tpor dois deve ser igual a zero.")

numero = float(input("\n\n\tDigite um numero qualquer: "))

resto = numero % 2

if resto != 0:
    print("\n\tO numero digitado é IMPAR")
elif resto == 0:
    print("\n\tO numero é PAR")

