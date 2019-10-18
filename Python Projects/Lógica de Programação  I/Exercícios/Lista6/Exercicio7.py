

for num in range(1,20):
    num += 1
    for mult in range (0,10):
        mult += 1
        resultado = num * mult
        print ("{} x {} = {}".format(num,mult,resultado))

    enter = str(input("\nAperte <enter> para continuar..."))