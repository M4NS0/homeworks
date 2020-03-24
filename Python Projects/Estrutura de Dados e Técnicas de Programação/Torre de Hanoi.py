# coding: utf-8
# hanoi.py

def hanoi(n, inicial, destino, temporario):
    if n == 1:
        print ('Mova um anel do pino', inicial, 'para o pino', destino)
    else:
        hanoi(n - 1, inicial, temporario, destino)
        print ('Mova um anel do pino', inicial, 'para o pino', destino)
        hanoi(n - 1, temporario,  destino, inicial)

if __name__ == '__main__':
    n = int(input("Insira a quantidade de Discos da torre: "))
    hanoi(n, 1, 2, 3)
