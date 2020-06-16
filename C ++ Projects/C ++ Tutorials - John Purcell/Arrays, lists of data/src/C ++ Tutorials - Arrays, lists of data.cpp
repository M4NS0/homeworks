//============================================================================
// Name        : C.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Arrays (Lists of Data)  C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	cout << "Array of Integers" << endl;
	cout << "=================" << endl;
	// number inside the brackets is the length of the array
	int values[3];

	values[0] = 88;
	values[1] = 123;
	values[2] = 7;

	// this bad ass under us could crash your Pc or mess your O.S
	// cout << values[3] << " (an example of a garbage number)"<<endl;

	cout << values[0] << endl;
	cout << values[1] << endl;
	cout << values[2] << endl;

	// this endl will jump a line after the last cout
	cout << endl << "Array of Doubles" << endl;
	cout << "=================" << endl;

	double numbers[4] = { 4.5, 2.3, 7.2, 8.1 };
	// cout << numbers[0] << endl; this will print first number of the array

	for (int i = 0; i < 4; i++) {
		// numbers[i] = 77; this will fill overwriting the array with 77s
		cout << "Element at index " << i << ":  " << numbers[i] << endl;
	}
	cout << endl << "Initializing with zero value" << endl;
	cout << "============================" << endl;

	int numberArray[8] = { };
	for (int i = 0; i < 8; i++) {
		cout << "Element at index " << i << ":  " << numberArray[i] << endl;
	}

	cout << endl << "Arrays of Strings" << endl;
	cout << "==================" << endl;

	string texts[] = { "Apples", "Banana", "Oranges" }; // don't need the number between the brackets

	for (int i = 0; i < 3; i++) {
		cout << "Element at index " << i << ":  " << texts[i] << endl;
	}

	return 0;
}
