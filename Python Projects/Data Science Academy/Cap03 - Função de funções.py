import math


def numPrimo(num):
    '''
    Verificando se um numero é primo:

    :param num:
    :return:
    '''
    if (num % 2) == 0 and num > 2:
        return "Esse numero nao eh primo!"
    for i in range(3, int(math.sqrt(num)) + 1, 2):
        if (num % i) == 0:
            return "Esse numero nao eh primo!"
    return "Esse numero eh primo!"

print(numPrimo(541))
print('\n')

def split_string(text):
    '''
    Faz o Split dos dados dependendo
     da condicao, no caso um espaço " "
    :param text:
    :return:
    '''
    return text.split(" ")

texto = "Faz o Split dos dados dependendo da condicao, no caso um espaço"
print(split_string(texto))
print("\n")

token = split_string(texto)
print(token)
print("\n")


caixa_baixa = "ESTE TEXTO DEVERIA ESTAR todo EM CAIXA BAIXA!"
def lowerCase(text):
    return text.lower()

lowerCased_string = lowerCase(caixa_baixa)
print(lowerCased_string)
print("\n")


'''Funcoes com numeros variaveis de argumentos
   *vartuple significa que serao varios argumentos
   * = conjunto de parametros '''
def printVarInfo (arg1, *vartuple):
    '''Imprimindo o valor do primeiro argumento'''
    print("O parametro passado foi: ", arg1)

    '''Imprimindo o valor do segundo argumento'''
    for item in vartuple:
        print("O parametro passado foi: ", item)
    return;

print(printVarInfo(10))
print(printVarInfo('Chocolate', 'Morango', 'Baunilha'))
print("\n")
