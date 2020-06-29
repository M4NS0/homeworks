print("\n\tA partir de três valores que serão digitados, verificar se"
+ "\n\tformam ou não um triângulo. Em caso positivo, exibir sua classificação:"
+ "\n\t\"Isósceles, escaleno ou eqüilátero\".Um triângulo escaleno possui todos"
+ "\n\tos lados iguais. Para existir triângulo é necessário que a soma de dois "
+ "\n\tlados quaisquer seja maior que o outro, isto, para os três lados.")

lado1 = float(input("\n\n\tDigite o tamanho do primeiro lado: "))
lado2 = float(input("\n\n\tDigite o tamanho do segundo lado: "))
lado3 = float(input("\n\n\tDigite o tamanho do terceiro lado: "))

if (lado1 == lado2) & (lado2 == lado3):
print("\n\n\tEssa é a medida de um triangulo EQUILATERO")
elif (lado1==lado2) | (lado1==lado3) | (lado2==lado3):
print("\n\n\tEssa é a medida de um triangulo ISOCELES")
else:
print("\n\n\tEssa é a medida nao é de um ESCALENO")
