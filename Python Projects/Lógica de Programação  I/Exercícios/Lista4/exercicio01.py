print("\n\tEsse programa alcula e exibe a  área de  um  retângulo,  a  partir \n\tdos valores da base e altura que serão digitados. Se  a  área  for \n\tmaior que 100, exibir a mensagem \"Terreno grande \", caso contrário, \n\texibir a mensagem \"Terreno pequeno\"\n\n")

base = float(input("\n\t\tDigite a Base (em metros): "))
altura = float(input("\n\t\tDigite a Altura (em metros): "))

area = base * altura

if area>=100:
    print("\n\t\t-Terreno grande! Area de {} metros.".format(area))
elif area<100:
    print("\n\t\t-Terreno pequeno! Area de {} metros.".capitalizeformat(area))
