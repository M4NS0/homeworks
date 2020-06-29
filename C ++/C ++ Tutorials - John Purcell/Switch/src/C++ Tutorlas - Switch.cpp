//============================================================================
// Name        : C++.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	// switch is faster now! should be used

	// can uses an int down here too
	// char is in fact an integer type
	char value = 4;

	switch (value) {

	// is not allowed to name the case with a word,
	// can't use variables, only numbers

	case 4:
		cout << "Value is 4." << endl;
		break;

	case 5:
		cout << "Value is 5." << endl;
		break;

	case 6:
		cout << "Value is 6." << endl;
		break;

	default:
		cout << "Unrecognized value." << endl;
	}

	return 0;
}
