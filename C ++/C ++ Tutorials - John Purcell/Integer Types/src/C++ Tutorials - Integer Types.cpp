//============================================================================
// Name        : Integer.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <climits> // parameter to allow kinds of integers
using namespace std;

int main() {
	int value = 703924769273409672304; // not permited, overflow (output: -731671440)
	cout << value << endl;
															// for above see: http://www.cplusplus.com/reference/climits/
															// values of min and max are slightly different
	cout << "Maximum Integer Value: " << INT_MAX << endl; 	// verifies the maximum amount of a integer (output: 2147483647)
	cout << "Minimum Integer Value: " << INT_MIN << endl; 	// verifies the maximum amount of a integer (output: -2147483648)

	cout << "Maximum Long Value: " << LONG_MAX << endl;
	cout << "Minimum Long Value: " << LONG_MIN << endl;

	cout << "Maximum Short Value: " << SHRT_MAX << endl;
	cout << "Minimum Short Value: " << SHRT_MIN << endl;

	cout << "Maximum Character Value: " << CHAR_MAX << endl;
	cout << "Minimum Character Value: " << CHAR_MIN << endl;

	long int longValue = 3452346524563;
	cout << "This is a long value: "<< longValue << endl;

	short int shortValue = 1335;
	cout << "This is a short value: "<< shortValue << endl;

	cout << "Size of a short integer: " << sizeof(int short)<< " Bytes" << endl; 	// sizeof prints the number of bytes that a short can hold
	cout << "Size of a integer: " << sizeof(int) << " Bytes" << endl;				// sizeof prints the number of bytes that a int can hold
	cout << "Size of a long integer: " << sizeof(int long)<< " Bytes" << endl;		// sizeof prints the number of bytes that a long can hold

	unsigned int unsignedValue = 3242342; // unsigned values can only hold positive numbers
	cout << "The unsigned value can't be a negative number: " << unsignedValue << endl;

	return 0;
}
