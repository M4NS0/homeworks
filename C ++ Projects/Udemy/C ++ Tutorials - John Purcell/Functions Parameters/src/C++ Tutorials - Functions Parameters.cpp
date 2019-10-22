//============================================================================
// Name        : C++.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void showMenu() {
	cout << "1. Search" << endl;
	cout << "2. View recording" << endl;
	cout << "2. Quit" << endl;
}
int getInput() {
	cout << "Enter your choice: " << flush;

	int input;
	cin >> input;
	return input; // get this
}

void processSelection (int option) {
	switch (option) {

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
				cout << "Please choose a valid number in menu." << endl;
				getInput();
			}
}
int main() {
	showMenu();
	int selection = getInput (); // getters get input
	processSelection(selection); // passing variable // options receive variables from selection
	return 0;
}
