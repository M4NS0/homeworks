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
	cout << "Digite uma palavra aleatória: " << endl;
	string palavra;
	cin >> palavra;

	string caractere;
	caractere = palavra.substr(0,1);

	cout << "O Primeiro caractere da letra é: " << caractere << "\nO total de caracteres na palavra é: " << palavra.length() << endl;

	return 0;
}
