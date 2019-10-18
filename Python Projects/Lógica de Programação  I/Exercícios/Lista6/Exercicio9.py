soma =1

num = int(input("\n\nInsira um No:"))

while num < 0 or num > 100:
    num = int(input("\nInvalido, precisa ser maior que ZERO e menor que CEM. Insira outro No:"))
while num >= 0 or num <= 100:
    soma = num * (num + 1)
    print("\nA soma dos primeiros numeros é: {}".format(soma))
    num = int(input("\n\nInsira um No:"))