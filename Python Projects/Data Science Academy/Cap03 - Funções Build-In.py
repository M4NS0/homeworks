# Funcoes Built-in

print(abs(-56))
print(abs(23))
print(bool(0))
print(bool(1))


idade = int(input("Digite sua idade: "))
''' Deve-se indicar que a variavel vai receber uma resposta
    em numeros inteiros ao contrario, acontecera erro pois 
    ira considerar que vai receber uma string'''
if idade > 13:
    print("Você pode acessar o site")


print(int("26"))            # converte string para valor inteiro
print(float("123.456"))     # converte string para valor float
print(str(14))              # converte um numero para string
print('\n')

print(len([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]))  # imprime quantidade de valores em uma lista
print('\n')

array = ['a', 'b', 'c']
print(max(array))       # imprime o valor maximo da lista
print(min(array))       # imprime o valor minimo da lista
print('\n')

array = ['a', 'b', 'c', 'd', 'A', 'B', 'C', 'D']
print(array)
print(max(array))
print(min(array))       # 'A' maiusculo aparecera como valor minimo
print('\n')

list1 = [23, 24, 25, 34, 45]
print(sum(list1))        # nao é necessario criar uma funcao se a funcao ja esta pronta!
print('\n')




