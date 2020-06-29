//============================================================================
// Name        : C++.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Break and Continue, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	/*
	 for (int i = 0; i < 5; i++) {
	 cout << "i is: " << i << endl;

	 // break jumps immediately out of the loop
	 if (i == 3) {
	 break;
	 }
	 cout << "Looping ... " << endl;
	 }

	 for (int i = 0; i < 7; i++) {
	 cout << "i is: " << i << endl;

	 // continue jumps cout under the condition
	 if (i == 3) {
	 cout << " ^^^^ " << endl;
	 continue;
	 }
	 cout << "Looping ... " << endl;

	 }
	 */
	const string password = "hello";
	string input;

	do {
		cout << "Enter your password: " << flush;
		cin >> input;

		if (input == password) {
			break;
		}
		else {
			cout << "Access Denied!" << endl;
		}

	} while (true); // making an infinite loop unless you break it

	cout << "Password Accepted!" << endl;

	return 0;
}
