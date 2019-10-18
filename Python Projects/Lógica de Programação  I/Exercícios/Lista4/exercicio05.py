print("\n\t\tEntrar com o peso, o sexo e a altura de uma determinada pessoa" +
     "\n\t\tApós a digitação, exibir se esta pessoa está ou não com seu peso ideal.")

nome = str(input("\n\n\t\tDigite o nome da pessoa: "))
sexo = str(input("\n\n\t\tDigite o sexo de {}: ".format(nome)))
peso = float(input("\n\t\tDigite o peso de {}: ".format(nome)))
altura = float(input("\n\t\tDigite a altura de {}: ".format(nome)))

imc = peso / (altura * altura)

if sexo == "feminino":
    
    if imc<19:
            print("\n\t\t{} está abaixo do peso!!".format(nome))
    elif (19 <= imc) & (imc < 24):
            print("\n\t\t{} está no peso ideal!!".format(nome))
    elif imc >= 24:
            print("\n\t\t{} está acima no peso!!".format(nome))


else:
    
    if imc < 20:
            print("\n\t\t{} está abaixo do peso!!".format(nome))
    elif (20 <= imc) & (imc < 25):
            print("\n\t\t{} está no peso ideal!!".format(nome))
    elif imc >= 25:
            print("\n\t\t{} está acima no peso!!".format(nome))
