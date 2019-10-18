contador =0

num = int(input("Insira um valor: "))

if num < 0:
    num = int(input("VALOR INVALIDO, Insira um valor POSITIVO: "))

print("\nTabuada de {}".format(num))

for contador in range(1,10):
    resultado = num * contador

    print("{} x {} = {}".format(num,contador,resultado))
