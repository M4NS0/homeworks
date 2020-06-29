escolha = "S"
fat = 1

while escolha == "S" or escolha == "s":
    num = int(input("Insira um No: "))

    if num < 0 :
        num = int(input("Invalido! Insira um No Positivo: "))

    for cont in range(num,1,-1):
        fat = (fat * cont)
    print("{}! = {}".format(num,fat))

    escolha = str (input("\nDigite 'S' para novo calculo ou 'F' para finalizar: "))
    fat = 1
if escolha != "S" or escolha != "s":
    print("FIM")