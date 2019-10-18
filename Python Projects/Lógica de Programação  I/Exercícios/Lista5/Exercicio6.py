contador: int = 0
escolha: str = "s"

while (escolha == "s" or escolha =="S"):
    contador = contador + 1
    nome = str(input("\n\n      NOME: "))
    desc = str(input(" DESCRIÇÂO: "))
    freq = str(input("FREQUÊNCIA: "))
    nota = str(input("      NOTA: "))

    print("\n\t {}".format(nome) )
    print("\t {}".format(desc) )
    print("\t {}".format(freq) )
    print("\t {}\n\n".format(nota) )

    escolha = str(input("para inserir novos nomes digite 's' caso contrario digite 'n':"))


print("\n\n\n [FIM DO PROGRAMA]\n\n\n\n")