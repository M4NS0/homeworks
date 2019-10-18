//============================================================================
// Name        : Floating.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <iomanip> // calls parameters:  fixed/scientific/setprecision/
using namespace std;

int main() {

	float floatValue = 76.4 ; 	// floats allegates a fixed size of memory
								// float have less precision

	cout << scientific << floatValue << " is a scientific  representation" << endl;
	cout << fixed << floatValue << endl;
	cout << "\nThe size of a float is: " << sizeof(float) << " Bytes" << endl;
	cout << "The numbers of bytes of the variable floatValue is: " << sizeof(floatValue) << " Bytes" << endl;
	cout << "\nTo gain precision of a float number,\nuse the method setprecision(): \n" << setprecision(20) << fixed << floatValue << "\nso, it will use  20 digits on output " << endl;

	double doubleValue = 123.456789;
	cout << "\n" << setprecision(20) << fixed << doubleValue << " - Is a double number " << endl;

	long double longDoubleValue = 123.45678909876543210;
	cout << setprecision(20) << fixed << longDoubleValue << " - This is a precise long double value until the 16o number" << endl;

	return 0;
}
