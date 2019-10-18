var_teste = 1
print(var_teste)

print(type(var_teste))

var_teste = 1.5
print(type(var_teste))
print("\n")

# Declaracao multipla
pessoa1, pessoa2, pessoa3 = "Maria", "Jose", "Tobias"

print(pessoa1)
print(pessoa2)
print(pessoa3)
print("\n")

fruta1 = fruta2 = fruta3 = "Laranja"
print(fruta1)
print(fruta2)
print(fruta3)
print("\n")

# Variaveis atribuidas a outras variaveis e ordem dos operadores
largura = 2
altura = 4
area = largura * altura
print(area)

perimetro = 2 * (largura + 2) * altura
print(perimetro)
print("\n")

# Operacoes com variaveis
idade1 = 25
idade2 = 35
print(idade1 + idade2)
print(idade2 - idade1)
print(idade2 * idade1)
print(idade2 / idade1)
print(idade2 % idade1)

# Concatenação de Variaveis
nome = "Bruno"
sobrenome = "Manso"
fullname = nome + " " + sobrenome
print(fullname)