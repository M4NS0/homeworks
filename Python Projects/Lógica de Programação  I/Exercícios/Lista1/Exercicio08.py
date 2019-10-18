print("Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e\n" +
"corrente elétrica que serão digitados. Utilize a lei de Ohm (U=Ri).")

corrente = float(input("Digite o valor da corrente eletrica: "))
resistencia = float(input("Digite o valor da resistencia: "))

u = corrente * resistencia
print("O valor da tensão elétrica é: {}".format(u))
