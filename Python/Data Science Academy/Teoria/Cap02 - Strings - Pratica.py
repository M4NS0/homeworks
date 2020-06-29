print('\nCriando uma String')
print(' -Pode usar uma aspas ou aspas duplas')
print('Indexando Strings:')
print(' -String sempre sao gravadas entre aspas')
print("\n>> s = 'Data Science Academy'")
s = 'Data Science Academy'
print(">> print(s)")
print(s)
print("\nPara imprimir o primeiro termo da String: \n>> print(s[0])")
print(s[0])
print("\nPara imprimir o segundo termo da String: \n>> print(s[1])")
print(s[1])
print("\nPara imprimir o terceiro termo da String: \n>> print(s[2])")
print(s[2])
print ('\nSlicing: \n -Faz a leitura de tudo até um ponto designado')
print('\nExemplos:')
print(s)
print('>> print(s[1:])')
print(s[1:])
print('>> print(s[2:])')
print(s[2:])
print('>> print(s[3:])...')
print(s[3:])
print(s[4:])
print(s[5:])
print(s[6:])
print(s[7:])
print(s[8:])
print(s[9:])
print(s[10:])
print(s[11:])
print(s[12:])
print(s[13:])
print(s[14:])
print(s[15:])
print(s[16:])
print(s[17:])
print(s[18:])
print(s[19:])
print(s[20:])
print('\n -Dois pontos isoladamente faz imprimir todos os caracteres:')
print(">> print(s[:])")
print(s[:])

print('\n -Pode se usar indexação negativa para retornar a ultima letra:')
print('>> print(s[-1])')
print(s[-1])

print('\n -Para retornar tudo exceto a ultima letra: ')
print('>> print(s[:-1])')
print(s[:-1])

print('\n -Para retornar um texto mas indica a frequencia de imressão: ')
print('>> print(s[::2])')
print(s[::2])

print('>> print(s[::3])')
print(s[::3])

print('\n -Para retornar texto invertido:')
print('>> print(s[::-1])')
print(s[::-1])

print('\n -Para somar dois textos (concatenação)')
print(">> s = s + ' - Fundamentos em Python'\n")
s = s + " - Fundamentos em Python\n"
print('>> print(s)')
print(s)

print('\n -O python permite a multiplicação de strings: ')
print('>> print(s*3)')
print(s*3)

print("\nFunções Built-in de Strings")
print("\n -Caixa Alta:")
print(">> print(s.upper())")
print(s.upper())

print("\n -Caixa Baixa:")
print(">> print(s.lower())")
print(s.lower())

print("\n -Função que isola palavras entre espaços em brancos: ")
print(">> print(s.split())")
print(s.split())

print("\n -Ou por uma letra especifica no caso abaixo a letra 'c':")
print("print(s.split('c'))")
print(s.split('c'))

print('\nFunções String')
print('\n -Primeira letra fica maiuscula')
print(">> print(s.capitalize())")
print(s.capitalize())

print("\n -Conta o numero de letras existentes na string no caso abaixo a letra 'c':")
print(">> print(s.count('c'))")
print(s.count('c'))

print("\n -Acha a letra pedida e imprime sua posição: ")
print("print(s.find('D'))")
print(s.find('D'))

print("\n -Verifica se a String é numeral ou não: ")
print(">> print(s.isalnum())")
print(s.isalnum())

print("\n [Deletando a String antiga e reinserindo reformatada]")
del s
s = "Data Science Academy - Fundamentos em Python"
print(s)

print("\n [Alterando todas as letras para minusculas] ")
print(s.lower())

print("\n -Verifica se esta digitada em letras maiusculas")
print(">> print(s.isupper())")
print(s.isupper())

print("\n -Verifica se a String termina com determinada palavra no caso a palavra 'n':")
print(">> print(s.endswith('n'))")
print(s.endswith('n'))

print("\n -Verifica se a String inicia com determinada palavra no caso a palavra 'C':")
print("print(s.startswith('C'))")
print(s.startswith('C'))

print("\nComparando Strings")
print(">> print('Python'=='python')")
print('Python' == 'python')

print("\n>> print('python'=='python')")
print('python' == 'python')






