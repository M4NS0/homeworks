print("O preço de um produto ao consumidor é a soma do preço de custo mais as porcentagens de impostos e a do distribuidor." +
      "\nLer o nome do produto, seu custo de fábrica e as taxas de impostos e do distribuidor. Imprimir o nome do produto " +
      "\ne o preço final ao consumidor.")

nome = str(input("Digite o nome do produto: "))
custo = float(input("Digite o valor do custo: "))
imposto = float(input("Digite o valor da taxa de imposto: "))
taxa = float(input("Digite o valor da taxa do distribuidor: "))

precofinal = custo + imposto + taxa

print("O produto '{}' custará {} ao consumidor final.".format(nome,precofinal))


