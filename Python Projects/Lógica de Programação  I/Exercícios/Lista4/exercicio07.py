print("\n\tUma escola com cursos em regime semestral, realiza duas avaliações durante o semestre" +
        "\n\te calcula a média do aluno, da seguinte maneira: MEDIA = (P1 + 2P2) / 3" +
        "\n\tFazer um programa para entrar via teclado com os valores das notas (P1 e P2)" +
        "\n\te calcular a média. Exibir a situação final do aluno (\"Aprovado ou Reprovado\")" +
        "\n\tsabendo que a média de aprovação é igual a cinco\n\n")

avaliacao1 = float(input("\n\t\tDigite o valor da primeira nota: "))
avaliacao2 = float(input("\n\t\tDigite o valor da segunda nota: "))

media = (avaliacao1 + 2*avaliacao2)/3

if media >= 50:
    print("\n\t\tParabens voce foi aprovado!!")
elif media < 50:
    print("\n\t\tVoce Bombou, infeliz! ")

