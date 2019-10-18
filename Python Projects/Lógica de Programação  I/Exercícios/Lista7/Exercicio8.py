a = 0
b = 0
c = 0
d = 0
e = 0
somaIdadeA = 0
somaIdadeB = 0
somaIdadeC = 0
somaIdadeD = 0
somaIdadeE = 0
maiorIdadeA = -999
maiorIdadeD = -999
maiorIdadeE = -999

for lotacao in range (1,15,1):
    idade = int (input("Digite sua idade:"))
    escolha = str(input("Escolha entre A,B,C,D,E:"))

    if escolha == "A" or escolha == "a":
        a += 1
        somaIdadeA = somaIdadeA + idade
        if (maiorIdadeA < idade):
            maiorIdadeA = idade

    if escolha == "B" or escolha == "b":
        b += 1
        somaIdadeB = somaIdadeB + idade

    if escolha == "C" or escolha == "c":
        c += 1
        somaIdadeC = somaIdadeC + idade

    if escolha == "D" or escolha == "d":
        d += 1
        somaIdadeD = somaIdadeD + idade
        if (maiorIdadeD < idade):
            maiorIdadeD = idade

    if escolha == "E" or escolha == "e":
        e += 1
        somaIdadeE = somaIdadeE + idade
        if (maiorIdadeE < idade):
            maiorIdadeE = idade

percentualC = (c * 100) / (c + b);
percentualB = (b * 100) / (c + b);
diferencaBC = percentualC - percentualB;

mediaidadeD = somaIdadeE / e;

percentualE = (e * 100) / (a+b+c+d+e);

diferencaAD = maiorIdadeE - maiorIdadeA;

print("Quantidade de A: {} \nA diferenca de percentual entre B e C: {}% \nMedia de idades dos q responderam E: {}\nPercentual de respostas E: {}%\nA idade da pessoa mais velha q respondeu E: {}\nA diferença de idade entre as pessoas q responderam A e D: {}".format(a,diferencaBC,mediaidadeD,percentualE,maiorIdadeE,diferencaAD))

