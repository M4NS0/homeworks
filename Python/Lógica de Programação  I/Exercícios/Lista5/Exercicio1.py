nome: str = ""

nome = str(input("Digite seu nome ou 'fim' para sair: "))
while nome != "fim":
    cpf = str(input(nome +" digite o CPF: "))
    rg = str(input(nome +" digite o RG: "))
    endereco = str(input(nome +" digite o Endereço: "))
    cidade = str(input(nome +" digite a Cidade: "))
    uf = str(input(nome +" digite o Estado: "))
    cep = str(input(nome +" digite o CEP: "))
    fone = str(input(nome +" digite o Telefone: "))
    nascimento = str(input(nome +" digite a data de nascimento: "))
    escolaridade = str(input(nome +" digite o Grau de Escolaridade: "))
    curso = str(input(nome +" digite o Curso: "))

    print("\n\n         NOME: " + nome)
    print("          CPF: " + cpf)
    print("           RG: " + rg)
    print("     ENDEREÇO: " + endereco)
    print("       CIDADE: " + cidade)
    print("       ESTADO: " + uf)
    print("          CEP: " + cep)
    print("         FONE: " + fone)
    print("   NASCIMENTO: " + nascimento)
    print(" ESCOLARIDADE: " + escolaridade)
    print("        CURSO: " + curso)

    nome = str(input("\n\nDigite seu nome ou 'fim' para sair: "))
print("     [FIM do PROGRAMA]")