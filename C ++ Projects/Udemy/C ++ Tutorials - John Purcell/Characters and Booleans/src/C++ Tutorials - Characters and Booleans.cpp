//============================================================================
// Name        : Characters.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	bool booleanValue1 = true;
	cout << booleanValue1 << endl;

	bool booleanValue0 = false;
	cout << booleanValue0 << endl;

	cout << "The output of a boolean is always 0 for false and 1 for  true!" << endl;

	char charValue = 55; // represent single characters and it will find the number in an ascii table

	cout << "\nThe number 55 represents the #55 number in ascii table, \nand it is the character: " << endl;
	cout << charValue << endl;

	cout << "\nIf you put in a single quotes '7' \nwill print the actual number and his position, as above:" << endl;
	char characterValue = '7';
	cout << characterValue << endl;

	cout << "\nThe size of a char is: " << sizeof(char) << " Bytes (or 8 Bits)" <<   endl;

	wchar_t wValue = 'i';
	cout << "The wchar_t will shows the number of the value in ascii table, \nletter 'i' is number " << wValue << endl;
	cout << "\nThe size of wchar_t is " << sizeof(wchar_t) << " Bytes" << endl;

	return 0;

}
