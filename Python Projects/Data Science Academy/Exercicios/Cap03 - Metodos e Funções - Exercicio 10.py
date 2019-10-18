# ************* Desafio ************* (pesquise na documentação Python)

# Exercício 10 - Crie uma função que receba o arquivo abaixo como argumento e retorne um resumo estatístico descritivo
# do arquivo. Dica, use Pandas e um de seus métodos, describe()
# Arquivo: "binary.csv"

import pandas as pd
file_name = "/home/linuxlite/Workspaces/Shell Projects/Autorais/Logger para aula de estatistica/Registro.csv"


def descreveArquivo(file_name):
    df = pd.read_csv(file_name)
    return df.describe()

print(descreveArquivo(file_name))

def retornaValores(file_name):
    df = pd.read_csv(file_name)
    return df.get_values()
print(retornaValores(file_name))

def retornaTudo(file_name):
    df = pd.read_csv(file_name)
    return df.all
print(retornaTudo(file_name))

def retornaEixos(file_name):
    df = pd.read_csv(file_name)
    return df.axes
print(retornaEixos(file_name))


