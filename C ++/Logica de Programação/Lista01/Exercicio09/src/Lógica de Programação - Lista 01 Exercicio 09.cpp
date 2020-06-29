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
	cout << "Escreva o valor em Dolares para a conversão em reais:" << flush;
	float dolares;
	cin >> dolares;

	cout << "Escreva o valor da cotação:" << flush;
	float cotacao;
	cin >> cotacao;
	cout << "O valor convertido em reais é de: " << dolares*cotacao << endl;

	return 0;
}
