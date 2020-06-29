# criando uma tupla e imprimindo cada um dos valores
tupla = (2,3,4)

# i =  item dentro da coleção
for i in tupla:
    print(i)

ListaDoMercado = ("banana", "abacate", "melão")
for i in ListaDoMercado:
    print(i)

# imprimindo os valores no intervalo de 0 a 5
for contador in range(0,5):
    print(contador)

# imprimindo os numeros paras da lista de numeros
lista = [1,2,3,4,5,6,7,8,9,10]
for num in lista:
    if num % 2 == 0:
        print(num)

# listando numeros no intervalo de 0 a 101 com incremento em 2 (de dois em dois)
for i in range(0,101,2):
    print(i)

# Strings tambem podem ser sequenciados
for caractere in 'Python é uma linguagem de programação divertida!':
    print(caractere)

# Loops Aninhados
for i in range(0,5):
    for a in range (0,5):
        print(a)

# Operando os valores de uma lista com loop for
listaB = [32,53,85,10,15,17,19]
soma = 0

for i in listaB:
    double_i = i * 2
    soma += double_i
print(soma)

# Loops em listas de listas
listas = [[1,2,3,],[10,15,14],[10.1,8.7,2.3]]
for valor in listas:
    print(valor)

# contando os itens de uma lista
lista = [5,6,7,10,17]
count = 0
for item in lista:
    count += 1
print(count)

# contando numero de colunas
listas = [[1,2,3,],[10,15,14],[10.1,8.7,2.3]]
primeira_linha = listas[0]
count = 0
for column in primeira_linha:
    count= count + 1
print(column)

# pesquisando em listas
listas = [1,2,3,5,6]
for item in listas:
    if item == 5:
        print("Numero encontrado na lista!")

# listando as chaves de um dicionario
dict = {'k1':'Python','k2':'R', 'k3':'Scala'}
for item in dict:
    print(item)

# imprimindo chave e valor do dicionario usando metodo .items
# k =  key, v = value
# para cada chave e valor em itens no dicionario, imprimir
for k,v in dict.items():
    print(k,v)
