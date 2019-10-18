# Game Ping-Pong

# imports
# tkinter é o responsavel pela parte grafica
from tkinter import *
import random
import time

# variavel inserida pelo usuario
level = int(input("Qual nível você gostaria de jogar? 1/2/3/4/5 \n"))
# variavel para definir o tamanho da barra pelo nivel escolhido
length = 500 / level


root = Tk()
# titulo em janela tkinter

root.title("Ping Pong")
root.resizable(0, 0)
root.wm_attributes("-topmost", -1)

# canvas - caracteristicas de janela
# Variável recebendo o resultado da função Canvas
canvas = Canvas(root, width=800, height=600, bd=0, highlightthickness=0)
canvas.pack()

root.update()

# Variável  de contador de pontos
count = 0
# Variável de derrota
lost = False

    # tarefa exercida pela bola
class Bola:
    # definindo caracteristicas fisicas da bola dimensoes, cor
    # variaveis de caracteristica
    def __init__(self, canvas, Barra, color):
        self.canvas = canvas
        self.Barra = Barra
        self.id = canvas.create_oval(0, 0, 15, 15, fill=color)

    # definindo limites de movimento
        self.canvas.move(self.id, 245, 200)

    # Listas de posicoes do objeto
        starts_x = [-3, -2, -1, 1, 2, 3]
    # definindo ponto de inicio do movimento com uma Tupla?
        random.shuffle(starts_x)

    # variaveis - iniciando por determinado ponto em lista
        self.x = starts_x[0]
        self.y = -3

        self.canvas_height = self.canvas.winfo_height()
        self.canvas_width = self.canvas.winfo_width()

    # output e condicoes para movimentos
    # funcao
    def draw(self):
        # variaveis de posicao e moviemento
        self.canvas.move(self.id, self.x, self.y)
        pos = self.canvas.coords(self.id)

        # condicionais if buscando em lista de posicoes
        if pos[1] <= 0:
            self.y = 3

        # condicionais if verificando altura da bola na janela (limite)
        if pos[3] >= self.canvas_height:
            self.y = -3

        if pos[0] <= 0:
            self.x = 3

        # condicionais if verificando largura da bola na janela (limite)
        if pos[2] >= self.canvas_width:
            self.x = -3

        # variavel de posicao de barra
        self.Barra_pos = self.canvas.coords(self.Barra.id)

        # condicionais if aninhados - para ganho de pontos
        # se a posicao  da bola em numero 2 da lista for maior ou igual a posicao  em numero 0 da barra
        # e se a posicao da bola em numero 0 for menor q a posicao da barra em numero 2 da lista
        if pos[2] >= self.Barra_pos[0] and pos[0] <= self.Barra_pos[2]:
            if pos[3] >= self.Barra_pos[1] and pos[3] <= self.Barra_pos[3]:
                self.y = -3
        # variaveis - calculo de pontos - contador
                global count
                count += 1
                score()
        # condicao if quando a bola bate na janela, nao havendo pontuacao
        if pos[3] <= self.canvas_height:
            self.canvas.after(10, self.draw)

        # Função - fora das condicoes acima nao ha pontuacao e aparece game over função é chamada
        else:
            game_over()
            global lost
            lost = True

# Classe
class Barra:

    # variaveis - definindo caracteristicas fisicas da barra: altura largura cor
    def __init__(self, canvas, color):
        self.canvas = canvas
        self.id = canvas.create_rectangle(0, 0, length, 10, fill=color)

    # variaveis - definindo limite do movimento
        self.canvas.move(self.id, 200, 400)
        self.x = 0
        self.canvas_width = self.canvas.winfo_width()

    # variaveis - leitura do teclado
        self.canvas.bind_all("<KeyPress-Left>", self.move_left)
        self.canvas.bind_all("<KeyPress-Right>", self.move_right)

    # Função - output e condicoes de movimento e pontuacao
    def draw(self):

    # limite de movimento em janela
    # chamada ao metodo
        self.canvas.move(self.id, self.x, 0)

    # variavel de posicao
        self.pos = self.canvas.coords(self.id)

    # condicional if
        if self.pos[0] <= 0:

    # variavel de posicao horizontal
            self.x = 0

        if self.pos[2] >= self.canvas_width:
            self.x = 0

        global lost

    # condicional if para vitoria/derrota
        if lost == False:
            self.canvas.after(10, self.draw)


    def move_left(self, event):
    # conficional if
        if self.pos[0] >= 0:
    # variavel - definindo sentido do movimento (eixo x = horizontal)
            self.x = -3

    # função
    def move_right(self, event):

    # condicional if
        if self.pos[2] <= self.canvas_width:

    # variavel de posicao horizontal
            self.x = 3

# chamada à função de inicializacao do game
def start_game(event):
    global lost, count
    # variavel de vencedor
    lost = False
    #variavel de contador
    count = 0

    # chamada à função de pontuação
    score()
    canvas.itemconfig(game, text=" ")

    # metodo dos objetos
    time.sleep(1)
    Barra.draw()
    Bola.draw()

# Função de leitura de pontuacao
def score():
    canvas.itemconfig(score_now, text="Pontos: " + str(count))

# Função de finalizacao do game
def game_over():
    canvas.itemconfig(game, text="Game over!")

# Instâncias dos objetos Barra e Bola
Barra = Barra(canvas, "orange")
Bola = Bola(canvas, Barra, "purple")

# Variáveis que recebem o resultado das funções
score_now = canvas.create_text(430, 20, text="Pontos: " + str(count), fill="green", font=("Arial", 16))
game = canvas.create_text(400, 300, text=" ", fill="red", font=("Arial", 40))
canvas.bind_all("<Button-1>", start_game)

# executa o programa
root.mainloop()