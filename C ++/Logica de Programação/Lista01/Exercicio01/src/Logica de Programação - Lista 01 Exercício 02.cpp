//============================================================================
// Name        : Logica.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	cout << "Digite o divisor:" << endl;
	int divisor;
	cin >> divisor;

	cout << "Digite o dividendo:" << endl;
	int dividendo;
	cin >> dividendo;

	int resultado;
	resultado = divisor / dividendo;

	cout << "O resultado da divisão é: " << resultado << endl;
	return 0;

}
