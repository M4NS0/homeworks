print("\n\t\tA partir dos valores da aceleração (a em m/s2), da velocidade inicial (v0 em m/s)" +
    "\n\t\te do tempo de percurso (t em s). Calcular e exibir a velocidade final de automóvel em km/h.")

aceleracao = float(input("\n\n\t\tDigite a aceleração do veiculo (em metros por segundo): "))
velocidadeinicial = float(input("\n\t\tDigite a velocidade inicial do veiculo (em km por hora): "))
tempo = float(input("\n\t\tDigite o tempo do percurso do veiculo (em segundos): "))

# V = v0 + a. t

segundoconvertido = tempo * 60
aceleracaoconvertida = aceleracao / 3.6
velocidadefinal = velocidadeinicial+ (aceleracaoconvertida*segundoconvertido)

if velocidadefinal <= 40:
    print("\n\t\tVeiculo muito LENTO.")
elif (velocidadefinal > 40) & (velocidadefinal <= 60):
    print("\n\t\tVeiculo em velocidade PERMITIDA.")
elif (velocidadefinal > 60) & (velocidadefinal <= 80):
    print("\n\t\tVeiculo RAPIDO.")
elif velocidadefinal > 120:
    print("\n\t\tVeiculo MUITO RAPIDO.")
