//============================================================================
// Name        : Lógica.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <math.h>
using namespace std;

int main() {
	cout << "Digite o primeiro valor: " << flush;
	float n1;
	cin >> n1;

	cout << "Digite o segundo valor: " << flush;
	int n2;
	cin >> n2;

	cout << "Digite o terceiro valor: " << flush;
	int n3;
	cin >> n3;

	cout << "Digite o quarto valor: " << flush;
	int n4;
	cin >> n4;

	float calc1 = sqrtf(n1);
	cout << "\nA raiz quadrada do primeiro número é: " << calc1  << endl;

	float calc2 = n2*10;
	cout << "O segundo valor multiplicado por 10 é: " << calc2 << endl;

	float calc3 = (n3-1);
	cout << "O terceiro valor menos 1 é: " << calc3 << endl;

	float calc4;
	calc4 = calc1 + calc2 + calc3 + n4;

	cout << "O resultado da quarta conta é: " << calc4 << endl;
	return 0;
}
