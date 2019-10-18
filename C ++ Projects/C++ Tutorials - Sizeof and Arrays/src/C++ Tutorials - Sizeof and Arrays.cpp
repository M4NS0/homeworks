//============================================================================
// Name        : C++.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Sizeof and Arrays, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	int value = 34;

	// sizeof is an operator
	cout << sizeof(value) << " Bytes" << endl;
	cout << sizeof(int) << " Bytes" << endl;

	int values[] = {4, 7, 3, 4};
	cout << sizeof(values) << " Bytes" << endl;

	for (int i = 0; i < 4; i++ ) {
		cout <<  values[i] << " " << flush;
	}
	cout << endl;

	// unsigned means that the variable i can't be negative
	// just paying respect to the IDE silly warning (!)
	for (unsigned i = 0; i < sizeof(values) / sizeof(int); i++) {
		cout << values[i] << " " << flush;
	}



	return 0;
}
