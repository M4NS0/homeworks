print("\n\n\tTuplas \n\n\t -São muito semelhantes as listas. \n\t -São Imutáveis, não podem ser alteradas"
      + "\n\t -Apresenta dados que não devem modificar como datas, dias da semana etc."
      + "\n\t -Uso de parenteses e virgulas separando cada elemento"
      + "\n\t -Deido as limitações em relação as listas, tuplas devem ser usadas para dados imutaveis"
      + "\n\t -Forneçe uma fonte conveniente para integridade dos dados\n")

print("\n\tCriando uma TUPLA:\n\n$ tupla1 = ('Geografia', 23, 'Elefante')")
tupla1 = ('Geografia', 23, 'Elefante')
print(tupla1)

print("\n\t -Tuplas não suportam APPEND")
print("\t -Tuplas não suportam DELETE")
print("\t -Tuplas PODEM ter um único item")
print("\t -Tuplas PODEM ser deletadas")
print("\t -Tuplas não suportam atribuição de item, ex: $ tupla1[1] = 21")

print("\n\t -Podem retornar um unico indice dentro de uma Tupla:")
print("\n$ print(tupla1[0])")
print(tupla1[0])

print("\n\t -Verificando o comprimento da tupla:")
print("\n$ print(len(tupla1))")
print(len(tupla1))

print("\n\t -Possibilidade de Slicing como as listas:")
print("\n$ print(tupla1[1:])")
print(tupla1[1:])

print("\n\t -Verifica o Indice de um item da Tupla: ")
print("\n$ print(tupla1.index('Elefante'))")
print(tupla1.index('Elefante'))

print("\n\t -Criando ua nova Tupla:")
print("\n$ t2 = ('A','B','C')")
t2 = ('A','B','C')
print(t2)
print(type(t2))

print("\n\t -Convertendo uma TUPLE em LISTA:")
print("\n$ lista_t2 = list(t2)")
lista_t2 = list(t2)
print(lista_t2)
print(type(lista_t2))

print("\n\t -Convertendo uma LISTA em TUPLE:")
print("\n$ t2 = tuple(lista_t2)")
t2 = tuple(lista_t2)
print(t2)
print(type(t2))


