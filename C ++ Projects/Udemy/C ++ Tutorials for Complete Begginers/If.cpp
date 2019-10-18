//============================================================================
// Name        : If.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	string password = "hello"; // = Attributes to the string

	cout << "Enter your password > " << flush;

	string input; // variables should be declared as near as possible not at the top of the script
	cin >> input; // cin get from

	cout << "'" <<"input" << "'" <<endl; // just a checkpoint to see if the lines above are all right to proceed to next step

	if (input == password) { // similar  to int main() { // == checking the value
		cout << "Password Accepted!" << endl;
	}
	if (input != password) {
		cout << "Access Denied!" << endl;
	}
	return 0;
}
