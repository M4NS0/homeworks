//============================================================================
// Name        : Do-While.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	int value = 7;

	do { // 'do' will check the code and print, if the condition is false it will stop, do (conditions) while true or false
		cout << "Hi there!\n" << endl;
	} while (value < 5);

	const string password = "hello"; // 'const' means that the variable can't be reassign
	// password = 'auhouiahoi' is not gonna change the variable

	string input;

	do {
		cout << "Enter your password > " << flush;
		cin >> input;

		if (input != password) {
			cout << "Access denied!" << endl;
		}
	} while (input != password);

	cout << "Password accepted" << endl;

	return 0;
}
