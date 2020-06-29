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
	cout << "Digite o valor em milhas a ser convertido para quilometros: " << flush;
	float milha;
	cin >>  milha;

	cout << "O valor em quilômetro é: " << (milha*1852)/1000 << endl;

	return 0;
}
