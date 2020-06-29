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
	cout << "Digite o valor da resistência: " << flush;
	float R;
	cin >> R;

	cout << "Digite o valor da corrente: " << flush;
	float i;
	cin >> i;

	cout << "O valor da resestência será: " << R*i << endl;
	return 0;
}
