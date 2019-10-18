//============================================================================
// Name        : Lógica.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	cout << "Escreva o valor do primeiro produto: " << flush;
	float p1;
	cin >> p1;

	cout << "Escreva o valor do segundo produto: " << flush;
	float p2;
	cin >> p2;

	cout << "Escreva o valor do terceiro produto: " << flush;
	float p3;
	cin >> p3;

	cout << "Escreva o valor do quarto produto: " << flush;
	float p4;
	cin >> p4;

	cout << "Escreva o valor do quinto produto: " << flush;
	float p5;
	cin >> p5;

	cout << "Escreva o valor do pagamento efetuado: " << flush;
	float pagamento;
	cin >> pagamento;

	cout << "A soma dos valores é de : " << p1+p2+p3+p4+p5 << "R$" << endl;
	cout << "O troco correspondente é: " << pagamento - (p1+p2+p3+p4+p5) << "R$" << endl;

	return 0;
}
