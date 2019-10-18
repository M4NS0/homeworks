'''

    Expressao inline, expressao anonima ou Lambda:
    - É um tipo especial de funcao
    - Possibilidade de criar funcoes ad-hoc sem a necessidade
      de definir uma funcao usando a palavra reservada def
    - Funcionam exatamente da mesma forma quando utilizado o def
    - O corpo do Lambda eh uma unica expressao, e nao um bloco
    - O corpo do Lambda eh semelhante a uma instrucao de retorno do corpo def
    - Funcoes Lambda sao uteis quando utilizadas em conjunto com as funcoes:
    - map(), filter(), reduce()
    - Funcoes Lambda sao uteis para funcoes in-line ou simples (anonimas)

    Sintaxe:
    lambda x:x ** 2
    - primeiro 'x' representa o parametro de entrada
    - o ':' divide a funcao entre entrada:retorno
    - x * * 2 eh o retorno da funcao elevada a segunda potencia

    Diferenca entre def e lambda para criar funcoes:
    - def: cria um objeto e atribui um nome a ele
    - lambda: cria um objeto, mas o retorna como um resultado em tempo de execucao
    - lambda: nao aceita varias funcoes e normalmente utilizada com as funcoes map(), filter(), reduce()
'''

def potencia(num):                      # simples
    result = num ** 2
    return result
print(potencia(5))
print('\n')


def potencia(num):                      # mais simples
    return num**2
print(potencia(5))
print('\n')


def potencia(num): return num ** 2      # ainda mais simples
print(potencia(5))
print('\n')


potencia = lambda num: num ** 2         # simples pra caraio
print(potencia(5))
print('\n')


Par = lambda x: x % 2 == 0
print(Par(5))
print(Par(4))
print('\n')


first = lambda s: s[0]
print(first("Python"))
print('\n')


reverso = lambda s: s[::-1]
print(reverso("Python"))
print('\n')


addNum = lambda x,y,z : x + y + z
print(addNum(2,3,7))
print('\n')
