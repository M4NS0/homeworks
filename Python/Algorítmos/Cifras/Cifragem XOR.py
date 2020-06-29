text = input("Texto: ") #Ler texto a ser cifrado
key = input("Chave: ") #Ler a chave usada na cifragem/decifragem
n = len(text) #Obter o número de caracteres do texto

cipher = "" #variável que conterá o texto cifrado com a chave
for i in range(n): #Para cada posicao i de 0 até n-1
    t = text[i]    #Obter o caractere da posição do texto
    k = key[i % len(key)] #Obter o caractere correspondente à chave (com repetição)
    x = ord(t) ^ ord(k) #Obter o valor numérico de cada caractere (ord) e realizar XOR (operador ^)
    print(t, k, chr(x)) #Escrever na tela a letra original, a letra da chave e o caractere cifrado (zoado...)
    cipher = cipher + chr(x) #Acrescentar o caractere cifrado ao resultado
print(cipher.encode()) #Imprimir o resultado

#O procedimento a seguir usa o texto cifrado (cipher) e a chave (key) para obter o text
text = ""
for i in range(n):
    t = cipher[i]
    k = key[i % len(key)]
    x = ord(t) ^ ord(k) #O procedimento para decifrar é idêntico ao de cifrar
    print(t, k, chr(x))
    text = text + chr(x)
print(text)
