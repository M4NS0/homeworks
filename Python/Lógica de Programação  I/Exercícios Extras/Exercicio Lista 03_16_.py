print("\nDesenvolver um algoritmo que determine imposto de renda cobrado de um funcionário pelo governo. Seu programa deverá ler o"
    +"\nnúmero de dependentes, o salário do funcionário e o imposto normal pago. O imposto bruto é de 20% do salário do funcionário se o"
    +"\nfuncionário ganha mais de 12 salários mínimos; o imposto bruto é de 8% do salário do funcionário se o funcionário ganha mais de 5"
    +"\nsalários mínimos; e quem ganha 5 salários mínimos ou menos não é cobrado o imposto de renda. Sabe-se que o governo cobra 4% de"
    +"\ntaxa adicional sobre o imposto bruto. Determine o imposto líquido a ser pago pelo funcionário subtraindo R$ 300,00 para cada"
    +"\ndependente do mesmo, no imposto bruto. O programa calculará e imprimirá o imposto a ser pago ou devolvido, que é a diferença entre o"
    +"\nimposto normal descontado e o imposto líquido. Se a diferença for negativa mostrar a mensagem “imposto `a pagar”, caso contrário"
    +"\n“imposto a receber”. Considere o salário mínimo como uma constante no seu programa.")

dependentes = float(input("\nInsira o número de dependentes: "))
salario = float(input("\nInsira o salário: "))
impostonormal = float(input("\nInsira o valor do imposto 'normal': "))
salariominimo = 950


if salario >= (12*salariominimo):
    impostobruto = salario * 20% + salario
    impostototal = (impostobruto * 4/100) + impostobruto
    impostoliquido = impostototal - (dependentes*300)
    if impostoliquido>

elif salario > (5*salariominimo):
    impostobruto = salario * 8% + salario
    impostototal = (impostobruto * 4/100) + impostobruto
    impostoliquido = impostototal - (dependentes*300)

elif salario <= (5*salariominimo):
    impostobruto = 0


