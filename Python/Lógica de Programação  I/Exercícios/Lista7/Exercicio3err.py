contador = 6
vendidos = 130
despesas = 300
valor = 6

lucro = vendidos*6 -despesas
print("{} Ingressos vendidos a 6R$ >> {}R$ de lucro".format(vendidos,lucro))

while contador <= valor and contador >= 0.6:
    vendidos = vendidos + 30
    contador = contador - 0.6
    lucro = vendidos * valor - despesas

    print("{} Ingressos vendidos a {}R$ >> {}R$ de lucro".format(vendidos,contador,lucro))