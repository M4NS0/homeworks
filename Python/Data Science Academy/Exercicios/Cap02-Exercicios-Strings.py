# -*- coding: utf-8 -*-
# Criando uma String

print('oi')
print('ola como vai')
print("Testando 'strings' em Python")

s = "Data Science Academy - Python Fundamentos"
print(s)
print("\n")

# Imprimindo elementos da String
print(s[0])
print(s[1])
print(s[2])
print(s[3])

# Slicing
print(s[:4])
print(s[0:])
print(s[-20])
print(s[-19])
print(s[-18])
print(s[-17])
print(s[::1])
print(s[::2])
print(s[::3])
print(s[::-1])

s =  s + " é um curso online sobre os fundamentos da linguagem Python"
print(s)

letra = 'w'
print(letra * 3)

# Funcoes String

print(s.upper())
print(s.lower())
print(s.split())
print(s.split('y'))
print(s.capitalize())
print(s.count('a'))
print(s.find('y'))
print(s.center(20, 'z'))
print(s.isalnum())
print(s.isalpha())
print(s.islower())
print(s.isspace())
print(s.endswith('o'))
print(s.partition("!"))

# Comparando Strings

print("Python" == "Phiton")
print("Python" == "Python")
