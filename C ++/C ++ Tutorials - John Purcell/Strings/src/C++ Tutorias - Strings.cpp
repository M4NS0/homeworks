//============================================================================
// Name        : Strings.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	string text0 = "This is a String. ";
	string text1 = "This is another String. ";
	string text3 = text0 + text1;

	cout << text0 << endl;
	cout << text1 << endl;
	cout << text0 << text1 << endl;
	cout << text3 << endl;

	return 0;
}
