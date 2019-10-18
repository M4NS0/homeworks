#  Agrupa conjunto de instruções para que possam ser executadas mais de uma vez
# Funções permitem especificar os parametros q podem servir como entrada  para as funções
# funções nos permite reutilizar codigo para nao precisar escrever novamente

# Sintaxe :
# def nomeDaFunção(arg1,arg2):
# ''' comentario sobre a função '''
# Codigo
# Retorno desejado

# São uma forma de descrever sua logica em um único pacote
# para assim ser utilizada em diferentes etapas

#                Argumentos --->  |  Função   \   --->    Resultado
#         Variáveis Globais --->  | Variáveis \   --->    Variáveis Globais
# Arquivos e Steam de Dados --->  |  Locais   \   --->    Arquivos e Steam de Dados
#
#                                 Outras Funções


def primeiraFunc():
    '''Função que roda uma porcaria de um Hello World'''
    print("Hello deaf World!")

print(primeiraFunc())
print("\n")


# Quando se cria uma nova funcao com nome igual, ira sobrescreve a funcao com o mesmo nome
def primeiraFunc(nome):
    print('Hello %s' %(nome))

print(primeiraFunc('Aluno'))
print("\n")


def funcLeitura():
    for i in range (0, 5):
        print("Número: " + str(i))

funcLeitura()
print("\n")


def addNum(firstnum, secondnum):
    print("1st num: " + str(firstnum))
    print("2nd num: " + str(secondnum))
    print("Sum: ", firstnum + secondnum)

addNum(45, 5)
print("\n")


variavel_global = 10

def multiply(num1, num2):
    ''' Repare que a variavel global quando dentro de uma funcao, nao ira
    alterar o valor estabelecido fora daqui pois ela passa a ser local'''
    variavel_global = num1 * num2
    print(variavel_global)

multiply(5, 25)
print(variavel_global)
print("\n")

variavel_global = 10
def multiply(num1, num2):
    variavel_local = num1 * num2
    print(variavel_local)

multiply(5, 25)
''' 
print(variavel_local) -> não funcionará pois é inacessivel
'''
print("\n")

