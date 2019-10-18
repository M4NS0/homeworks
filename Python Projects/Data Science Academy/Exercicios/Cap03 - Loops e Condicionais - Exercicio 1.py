# Exercício 1 - Crie uma estrutura que pergunte ao usuário qual o dia da semana. Se o dia for igual a Domingo ou
# igual a sábado, imprima na tela "Hoje é dia de descanso", caso contrário imprima na tela "Você precisa trabalhar!"


dias = ['domingo', 'segunda', 'terça', 'quarta', 'quinta', 'sexta', 'sabado']

resposta = (input("Que dia da semana é hoje? "))
quantidadeDias = len(dias)

for contador in range(0, quantidadeDias):
    if resposta == 'domingo':
            print("Hoje é dia de descanso!\n")
            break
    else:
            print("Vá fazer algo de útil!\n")
            break


resposta = (input("Que dia da semana é hoje? "))
while contador <= quantidadeDias:
    if resposta == "domingo":
        print("Hoje é dia de descanso!\n")
        break
    else:
        print("Vá fazer algo de útil!\n")
        resposta = (input("Que dia da semana é hoje? "))