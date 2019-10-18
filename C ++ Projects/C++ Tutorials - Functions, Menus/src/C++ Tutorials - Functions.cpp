//============================================================================
// Name        : C++.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

// void will not return any data to the calling function
// now  the function beyond can be invoked any time
// the functions must be placed on top of the code (for top-down compiler)

void showMenu() {
	cout << "1. Search" << endl;
	cout << "2. View Record" << endl;
	cout << "3. Quit" << endl;
}

void processSelection() {
	cout << "Enter selection:" << flush;

	int input;
	cin >> input;

	switch (input) {

	case 1:
		cout << "Searching..." << endl;
		break;
	case 2:
		cout << "Viewing..." << endl;
		break;
	case 3:
		cout << "Quitting..." << endl;
		break;

	default:
		cout << "Please select an item from the menu: " << flush;
	}
	}
int main() {
	// showMenu();
	processSelection();

	return 0;
}
	/*
	 // old one


	 int main() {

	 showMenu();

	 int input;
	 cin >> input;

	 switch (input) {

	 case 1:
	 cout << "Searching..." << endl;
	 break;
	 case 2:
	 cout << "Viewing..." << endl;
	 break;
	 case 3:
	 cout << "Quitting..." << endl;
	 break;

	 default:
	 cout << "Please select an item from the menu: " << flush;

	 }
	 */

