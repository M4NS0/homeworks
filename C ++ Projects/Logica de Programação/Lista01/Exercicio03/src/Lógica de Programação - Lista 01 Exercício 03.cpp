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

	cout << "Digite a base do retângulo: " << endl;
	int base;
	cin >> base;

	cout << "Digite a altura do retângulo: " << endl;
	int altura;
	cin >> altura;

	int area = base * altura;
	cout << "A Área do retângulo é: " <<  area << endl;


	return 0;
}
