print("\n\tEntrar com o peso e a altura de uma determinada pessoa. \n\tApós a digitação, exibir se esta pessoa está ou não com seu peso ideal.")

nome = str(input("\n\n\t\tDigite o nome da pessoa: "))
peso =  float(input("\n\n\t\tDigite o peso da pessoa: "))
altura = float(input("\n\n\t\tDigite a alura da pessoa: "))

imc = peso / (altura * altura)

if imc<20:
    print("\n\n\t{} está abaixo do peso!".format(nome))
elif (20 <= imc) & (imc < 25):
    print("\n\n\t{} está no peso ideal!".format(nome))
elif imc >= 25:
    print("\n\n\t{} está acima do peso!".format(nome))
