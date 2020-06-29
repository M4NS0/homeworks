
print ("\n\n- Dicionarios pode tambem significar em outras linguagens 'tabelas de harsh'" 
       + "\n- São construidos com uso das chaves {} e virgulas separando"
       + "\n- Mapeamentos sao uma coleção de objetos que sao armazenados por uma chave,"
       + "ao contrário de uma sequencia de objetos armazenados por sua posição relativa" 
       + "\n- Um dicionario Python consiste em uma chave em seguida um valor associado"
       + "\n- Dicionarios são mapeamentos de chaves e valores"
       + "\n >> {chave1: valor1, chave2: valor2}\n"
       + "\n- Para fins de comparação criaremos uma lista com nomes e idades:"
       + "\n>> estudantes_lst = ['MAtheus',24,'Fernanda',22,'Tamires',26,'Cristiano',25]'")

estudantes_lst = ["Matheus",24,"Fernanda",22,"Tamires",26,"Cristiano",25]
print("\n>> print(estudantes_lst)")
print(estudantes_lst)

print("\n- Criando um dicionário com os mesmos elementos:"
      + "\n>> estudantes_lst = {'Matheus':24,'Fernanda':22,'Tamires':26,'Cristiano':25}")
estudantes_dict = {'Matheus':24,'Fernanda':22,'Tamires':26,'Cristiano':25}
print("\n>> print(estudantes_dict)")
print(estudantes_dict)

print("\n- Para retornar um valor (no caso a idade) de um dos itens (no caso pessoas) do DICIONARIO utiliza-se:"
      + "\n>> print(estudantes_dict['Matheus'])")
print(estudantes_dict['Matheus'])

print("\n- Pode se atribuir um novo valor ao item do dicionario:"
      + "\n>> estudadantes_dict['Fernanda'] = 21")
estudantes_dict['Fernanda'] = 21
print("A idade de fernanda agora é " )
print(estudantes_dict['Fernanda'])

print("\n- Pode tambem adicionar um novo item ja com o valor, por exemplo Pedro com 22 anos:"
      + "\n>> estudantes_dict['Pedro'] = 22")
estudantes_dict['Pedro'] = 22
print("\n- Imprimindo lista:")
print(estudantes_dict)

print("\n- Para limpar o dicionario usa o metodo clear abaixo:"
      + "\n>> estudantes.dict.clear()")
estudantes_dict.clear()
print("\n- Imprimindo lista:")
print(estudantes_dict)

print("\n- Para deletar o dicionario usa o metodo del abaixo:"
      + "\n>> del estudantes_dict")
del estudantes_dict

print("\n- Criando um novo Dicionario:")
estudantes = {'Cristiano':25,'Fernanda:':22,'Matheus':24,'Tamires': 26}
print(estudantes)

print("\n- Verificando o tamanho do dicionario")
print(">> print(len(estudantes))")
print(len(estudantes))

print("\n- Extraindo CHAVES do Dicionario: ")
print(">> print(estudantes.keys())")
print(estudantes.keys())

print("\n- Extraindo VALORES do Dicionario: ")
print(">> print(estudantes.values())")
print(estudantes.values())

print("\n- Extraindo ITENS do Dicionario: ")
print(">> print(estudantes.items())")
print(estudantes.items())

print("\n- Criando um novo Dicionario:")
estudantes2 = {'Maria':27,'Erika:':28,'Milton':26}
print(estudantes2)

print("\n- Atualizando os valores do Dicionário 'estudantes2' para o Dicionario 'estudantes':")
print(">> estudantes.update(estudantes2)")
estudantes.update(estudantes2)
print(">> print(estudantes)")
print(estudantes)

print("\n- Criando um dicionario vazio:")
print(">> dici = {}")
dici = {}
print(">> print(dici)")
print(dici)

print("\n -Outra forma de adicionar dados: ")
dici[8.2] = "Python"
print(">> dici[8.2] = 'Python'")
dici['Key_one'] = 2
print(">> dici['Key_one'] = 2")
dici[10] = 5
print(">> dici[10] = 5")
dici['teste'] =5
print(">> dici['teste'] =5")
print(">> print(dici)")
print(dici)

print("\n -Dicionario de listas:")
print(">> dict2 = { 'key1': 1230, 'key2': [22,432,73.5], 'key3':['leite','maça','batata']}")
dict2 = { 'key1': 1230, 'key2': [22,432,73.5], 'key3':['leite','maça','batata']}
print("\n -Imprimindo: ")
print(dict2)

print("\n -Retornando um valor em uma chave especifica:")
print(">> print(dict2['key2'])")
print(dict2['key2'])

print("\n -Converter um item em letra maiuscula dentro de uma lista, dentro de um valor em um dicionario: ")
print(">> dict2['key3'][0].upper()")
print(dict2['key3'][1].upper())

print("\n -Fazendo operações com um determinado item dentro de uma lista em um valor dentro de um dicionario:")
print(">> var1 = dict2['key2'][0] - 2")
var1 = dict2['key2'][0] - 2
print(">> print(var1)")
print(var1)

print("\n -Criando dicionarios aninhados:")
print(">> dicionarioAninhado = {'key1':{'key2_aninhada':{'key3_aninhada':'Dicionario Aninhado em Python'}}}")
dicionarioAninhado = {'key1':{'key2_aninhada':{'key3_aninhada':'Dicionario Aninhado em Python'}}}
print("\n -Imprimindo: ")
print(dicionarioAninhado)

print("\n -Para retornar a frase contida dentro do aninhamento:")
print(">> print(dicionarioAninhado['key1']['key2_aninhada']['key3_aninhada'])")
print(dicionarioAninhado['key1']['key2_aninhada']['key3_aninhada'])


