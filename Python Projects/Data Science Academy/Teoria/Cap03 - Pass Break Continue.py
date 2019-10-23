counter = 0
while counter < 100:
    if counter == 4: # hora q encontra a condicao ele vai parar
        break
    else:
        pass # se não, nao encontrar a condição continua
    print(counter)
    counter = counter + 1
print("\n")

for verificador in 'Python':
    if verificador == 'h': # pula a iteração 'h'
        continue
    print(verificador)
print("\n")

for i in range (2,30):
    j = 2
    counter = 0
    while j < i:
        if i % j == 0:
            counter = 1
            j = j + 1
        else:
            j = j + 1

    if counter == 0:
        print(str(i) + " é um número primo!")
        counter = 0
    else:
        counter =0