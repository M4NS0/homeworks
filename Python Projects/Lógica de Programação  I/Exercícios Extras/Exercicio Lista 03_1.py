print("Esse algoritmo pede que insira um numero e diz se ele é impar ou par")

numero = int(input("\n\nEscreva um numero qualquer: "))

resto = numero % 2


if resto==0:
   print("\nO número digitado é par\n")
else:
    print("\nO número é impar\n")
    
