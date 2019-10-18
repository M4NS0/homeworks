print("\n\tVerificar se três valores quaisquer (A,B, C) que serão" +
        "\n\tdigitados  formam  ou  não  um  triângulo  retângulo." +
        "\n\tLembre-se que o quadrado da hipotenusa é igual" +
        "\n\ta soma dos quadrados dos catetos.")

lado1 = int(input("\n\n\tDigite o tamanho do lado A:  "))
lado2 = int(input("\n\n\tDigite o tamanho do lado B:  "))
lado3 = int(input("\n\n\tDigite o tamanho do lado C:  "))

if ((lado1*lado1) + (lado2*lado2) <= (lado3*lado3) or (lado1*lado1) + (lado3*lado3) <= (lado2*lado2) or (lado3*lado3) + (lado2*lado2) <= (lado1*lado1)):
    print("\n\tÉ um Triangulo Retângulo ")
else:
    print("\n\tNão é um Triangulo Retângulo ")


