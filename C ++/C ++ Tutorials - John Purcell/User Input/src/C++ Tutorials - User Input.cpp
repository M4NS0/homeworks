//============================================================================
// Name        : User.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

// cout is an object
// << is an operator
// >> extracting operator

	cout << "Enter your Name: " << flush;

	string input;
	cin >> input;

	cout << "Hello, " << input << "!!" << endl;

	cout << "Enter your age: " << flush;
	int value;
	cin >> value;
	cout << "Your age is: " << value << endl;

	return 0;
}
