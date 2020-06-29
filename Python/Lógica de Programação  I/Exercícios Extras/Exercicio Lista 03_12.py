print("\nFazer um algoritmo que dado os lados de um triângulo A, B e C."
      + "\nDizer se os lados dados formam um triângulo:"
      + "\nretângulo(A² = B² +C²) \nobtusângulo (A² > B² + C²) \nacutângulo (A² < B² + C²)")

A = int(input("\nInsira a medida do lado A: "))
B = int(input("\nInsira a medida do lado B: "))
C = int(input("\nInsira a medida do lado C: "))


if (B^2 + C^2) == A^2:
    print("\nEsse é um triangulo Retângulo!\n")
elif (B^2 + C^2) < A^2:
    print("\nEsse é um triangulo Obtusângulo!\n")
elif (B^2 + C^2) > A^2:
    print("\nEsse é um triangulo Acutângulo!\n")
