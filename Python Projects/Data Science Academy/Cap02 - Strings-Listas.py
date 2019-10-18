"""
LISTAS

-sao mutavais
-uso de colchetes com itens separados por virgulas
[item1,item2.item3]
-listas nao tem tamanho fixo
-nao tem restricoes
-suportam alinhamentos
-listas dentro de outra lista

"""
print("\nLISTAS")

print("\n -Criando uma lista de supermercado com ovos, farinha, leite e maças de um so elemento:")
print(">> listadomercado = ['ovos, farinha, leite, maças']")
listadomercado = ["ovos, farinha, leite, maças"]

print("\n -Imprimindo conteudo da String listadomercado:")
print(listadomercado)

print("\n -Criando uma lista de supermercado com ovos, farinha, leite e maças com elementos isolados:")
print(">> listadomercado = ['ovos', 'farinha', 'leite', 'maças']")
listadomercado2 = ['ovos', 'farinha', 'leite', 'maças']

print("\n -Imprimindo novo conteudo da String listadomercado:")
print(listadomercado2)

print("\n -Extraindo o primeiro elemento (posição 0)")
print(">> print(listadomercado2[0]")
print(listadomercado2[0])

print(">> print(listadomercado[0]")
print(listadomercado[0])

print("\n -Criando uma terceira lista de tipos de Strings diferentes: ")
print(">> lista3 = [12, 100, 'Universidade']")
lista3 = [12, 100, "Universidade"]

print("\n -Imprimindo conteudo da lista3: ")
print(lista3)

print("\n -Atribuindo cada valor da lista em uma variavel ou um item:"
      + "\n\titem1 = lista3[0]"
      + "\n\titem2 = lista3[1]"
      + "\n\titem3 = lista3[2]")

item1 = lista3[0]
item2 = lista3[1]
item3 = lista3[2]

print("\n -Imprimindo os 3 itens, cada um contendo um item da lista3:")
print(item1, item2, item3)

print("\n Atualizando uma Lista")
print(" -Imprimindo item da listadomercado2 posição 2 que seria o leite:")
print(">> listadomercado2[2]")
print(listadomercado2[2])

print("\n -Substituindo o elemento 2 da listademercado2 por chocolate:")
print(">> listademercado2[2] = 'CHOCOLATE'")
listadomercado2[2] = 'CHOCOLATE'

print("\n -Imprimindo lista atualizada:")
print(listadomercado2)

print("\n -Deletando um item da lista no caso as maças:")
print(">> del listadomercado2[3]")
del listadomercado2[3]

print("\n -Imprimindo lista sem as maças:")
print(listadomercado2)

print("\nListas Alinhadas \nUma lista dentro de outra")
print("\n -Criando 3 listas de numeros dentro da lista chamada listas:")
print(">> listas = [[1,2,3], [10,15,14], [10,1,8,7,2.3]]")
listas = [[1,2,3], [10,15,14], [10,1,8,7,2.3]]

print("\n -Imprimindo 'listas'")
print(listas)

print("\n -Atribuindo um elemento da lista a uma variável 'a':")
print(">> a = listas[0]")
a = listas[0]

print("\n -Imprimindo itens da variavel 'a':")
print(a)

print("\n -Atrbuindo um elemento da variavel 'a' na variavel 'b':")
print(">> b = a[0] ")
b = a[0]

print("\n -Imprimindo itens contidos na variavel 'b':")
print(b)

print("\n -Atribuindo um elemento de 'listas' em uma nova lista, 'lista1':")
print(">> lista1 = listas[1]")
lista1 = listas[1]

print("\n -Imprimindo itens contidos em lista1:")
print(lista1)

print("Operações com Listas")
print("\n -Atribuindo à variavel 'a', o primeiro valor da primeira lista")
print(">> a = listas[0][0]")
a = listas[0][0]

print("\n -Imprimindo itens contidos em 'a':")
print(a)

print("\nConcatenar Listas")
print("\n -Criando listas 'list1' (contendo 34,32,56) e 'list2'(contendo 21,90,51)")
list1 = [34,32,56]
list2 = [21,90,51]

print(" -Concatenando as Listas em uma só: chamada 'lists")
print("lists = list1 + list2")
lists = list1 + list2

print("\n -Imprimindo itens contidos em 'lists':")
print(lists)

print("Operador IN")
print("\n -Criando nova lista 'listaTeste' e inserindo os valores [100,2,-5,3,4] ")
listaTeste = [100,2,-5,3,4]

print("\n -Verificando se dentro da listaTeste existe o valor 10")
print(">> print(10 in listaTeste)")
print(10 in listaTeste)

print("\n -Verificando se dentro da listaTeste existe o valor -5")
print(">> print(-5 in listaTeste)")
print(-5 in listaTeste)

print("\nFunção Built-In")
print(" -Função len, retornando o comprimento da lista:")
print(">> len(listaTeste)")
print(len(listaTeste))

print("\n -Função max, retorna o maior valor da lista:")
print(">> print(max(listaTeste))")
print(max(listaTeste))

print("\n -Função min, retorna o menor valor da lista:")
print(">> print(min(listaTeste))")
print(min(listaTeste))

print("\n -Criando nova lista: ")
listadomercado2 = ["ovos","farinha","leite","maças"]
print(listadomercado2)

print("\n -Apensar, adicionar: 'append' no final da lista")
print(">> listadomercado2.append('carne')")
listadomercado2.append("carne")
print(listadomercado2)

print("\n -Adicionar novamente o mesmo item a lista:")
print(">> listadomercado2.append('carne')")
listadomercado2.append("carne")
print(listadomercado2)

print("\n -Contar a quantidade do mesmo item existe na lista:")
print(">> print(listadomercado2.count('carne'))")
print(listadomercado2.count("carne"))

print("\n -Criando uma nova lista vazia")
print(">> a = []")
a = []
print(a)

print("\n -Determinando o tipo de variavel")
print(">> print(type(a))")
print(type(a))

print("\n -Adicionando valores com o append na nova lista")
print(">> a.append(10)")
a.append(10)
print(">> a.append(50)")
a.append(50)
print(">> print(a)")
print(a)

print("\n -Criando lista old_list e new_list:")
print(">> old_list = [1,2,5,10]")
old_list = [1,2,5,10]
print("newlist = []")
new_list = []

print("\n -Copiando itens de uma lista pra outra:")
print(">> for item in old_list: \n\t new_list.append(item)")
for item in old_list:
    new_list.append(item)
print(">> print(new_list)")
print(new_list)

print("\n -Criando uma nova lista com cidades:")
print(">> cidades = ['Recife','Manaus','Salvador'")
cidades = ['Recife','Manaus','Salvador']
print("\n -Criando uma extensão com mais duas cidades")
print(">> cidades.extend(['Fortaleza','Palmas'])")
cidades.extend(['Fortaleza','Palmas'])
print(cidades)

print("\n -Retorna o Indice da lista do item 'Salvador'")
print(">> print(cidades.index('Salvador'))")
print(cidades.index('Salvador'))

print("\n -Para inserir um item na lista em determinada posição (Python a contagem inicia com zero):")
print(">> cidades.insert(2, 'Goiânia')")
cidades.insert(2, "Goiânia")
print(cidades)

print("\n -Podemos remover um elemento da lista:")
cidades.remove('Goiânia')
print(">> cidades.remove(Goiânia)")
print(cidades)

print("\n -Tambem inverter a ordem dos itens:")
print(">> cidades.reverse()")
cidades.reverse()
print(cidades)

print("\n -Podemos ordenar uma lista:")
print(">> x = [3,2,5,4,1]")
x = [3,2,5,4,1]
print(">> x.sort()")
x.sort()
print(x)
print(">> cidades.sort()")
cidades.sort()
print(cidades)
















