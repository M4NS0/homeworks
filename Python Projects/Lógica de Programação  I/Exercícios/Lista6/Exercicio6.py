contador = 0
num = int(input("Insira um valor: "))

if num < 0:
    num = int(input("VALOR INVALIDO, Insira um valor POSITIVO: "))

inicio = int(input("Insira o intervalo para o calculo da tabuada \nCOMEÇA EM:"))
fim = int(input("TERMINA EM:"))

if fim<inicio:
    print("INICIO maior que o FIM! Repetindo...")
    inicio = int(input("COMEÇA EM: "))
    fim = int(input("TERMINA EM:"))

while (contador >= 0):
    contador += 1

    if contador >= inicio and contador <= fim:
        resultado = num * contador

        print("{} x {} = {}".format(num,contador,resultado))
