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
	cout << "Digite o peso da primeira pessoa: " << endl;
	int peso1;
	cin >> peso1;

	cout << "Digite o peso da primeira segunda: " << endl;
	int peso2;
	cin >> peso2;

	cout << "Digite o peso da terceira pessoa: " << endl;
	int peso3;
	cin >> peso3;

	int resultado = (peso1 + peso2 + peso3) / 3;
	cout << "A média de peso é: " << resultado << endl;



	return 0;
}
