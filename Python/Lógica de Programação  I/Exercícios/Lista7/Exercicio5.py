mulheresF = 0
homensF = 0
menos24 = 0
vivas = 0
falecidas = 0

nasc = int(input("Insira o numero de crianças nascidas no periodo: "))

for cadastro in range (0,nasc,1):
    escolha = str (input("Digite 'V' se a criança #{} está viva ou 'F' se falecida: ".format(cadastro)))

    if escolha == "V" or escolha == "v":
        vivas += 1
        print("OK")
    if escolha == "F" or escolha == "f":
        falecidas += 1
        print("OK")

        sexo = str(input("Digite 'M' se foi mulher ou 'H' se foi homem: "))

        if sexo == "M" or sexo == "m":
            mulheresF += 1
        if sexo == "H" or sexo == "h":
            homensF += 1

        meses = int(input("Insira os meses de vida da criança {}: ".format(cadastro)))

        if meses<=24:
            menos24 += 1


percTotal = (falecidas*100) / (vivas+falecidas)
percHomem = (homensF*100) / (vivas+falecidas)
percMenos24 = (menos24*100) / falecidas

print("\nMorreram {} crianças \n{}% do total das crianças cadastradas \n{}% eram meninos \n{}% morreram com menos de 24 meses ".format(falecidas,percTotal,percHomem,percMenos24))
