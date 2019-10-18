print("Ler uma determinada hora, seus minutos e segundos e converter tudo para segundos. \nMostrar no vídeo quantos segundos correspondem à hora lida\n(observação: 1 hora = 60 minutos e 1 minuto = 60 segundos")

hora = int(input("Digite a hora: "))
minutos = int(input("Digite os minutos: "))
segundos = int(input("Digite os segundos: "))

horaconvertida = hora * 60 * 60
minutoconvertido = minutos * 60

print("{} horas, {} minutos {} segundos, convertendo a hora em segundos o resultado é {}s, e os minutos convertidos em segundos é {}s".format(hora, minutos, segundos, horaconvertida, minutoconvertido))

