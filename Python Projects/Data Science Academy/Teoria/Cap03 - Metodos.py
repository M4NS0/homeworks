# Metodos são funções incorporadas a objetos
# Permitem executar funçoes especificas em um Objeto e podem conter argumentos

# Append
# Count
# Extended
# Insert
# Pop
# Semove
# Rverse
# Sort

# Sintaxe:
# objeto.metodo(arg1,arg2,arg3...)
# Metodos que funcionam em uma lista podem ser diferente dos metodos que funcionam em uma tupla

lst = [100, -2, 12, 65, 0]
# Todas as funções podem ser precedidas por help

# Metodo append adiciona o numero (10) entre parenteses
print(help(lst.append))
lst.append(10)
print(lst)
print("\n")

# Metodo count conta o numero de vezes que o numero (10) entre parenteses aparece na lista
print(help(lst.count))
print(lst.count(10))
print("\n")

# Função dir mostra os metodos atribuidos a uma linguagem
print(help(dir))
print(dir(list))
print("\n")

a = "Isso é uma maldita String"
print(a.split(" "))


