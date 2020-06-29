# Exercício 1 - Crie uma função que imprima a sequência de números pares entre 1 e 20 (a função não recebe parâmetro) e
# depois faça uma chamada à função para listar os números


def funImprime ():
    for i in range(1, 20):
        if i%2 == 0:
            print(i)
funImprime()