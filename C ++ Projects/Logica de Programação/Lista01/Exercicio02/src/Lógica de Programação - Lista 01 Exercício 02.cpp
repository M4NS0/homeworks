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
	cout << "Digite seu nome:" << endl;
	string nome;
	cin >> nome;

	cout << "Digite seu endereço:" << endl;
	string end;
	cin >> end;

	cout << "Digite seu E-Mail:" << endl;
	string email;
	cin >> email;

	cout << "Digite seu fone:" << endl;
	string fone;
	cin >> fone;

	cout << "  Nome:" << nome << endl;
	cout << "   End:" << end << endl;
	cout << "E-Mail:" << email << endl;
	cout << "  Fone:" << fone << endl;

	return 0;
}
