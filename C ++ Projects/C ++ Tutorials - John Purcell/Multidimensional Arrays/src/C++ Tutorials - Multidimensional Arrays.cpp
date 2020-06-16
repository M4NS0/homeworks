//============================================================================
// Name        : C++.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Multidimensional Arrars C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	// code beyond is
	// x and y axis two dimensional array
	// is a outer array with 2 elements
	// can suppress the x axis (number 2) and C++ will recognize 2 x axis

	string animals[2][3] = {
			{ "    fox", "       dog", "     cat" },
			{ "  mouse", "  squirrel",			"  parrot" } };
	// beyond we have a nested for loop
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
			cout << animals [i][j] << " " << flush;
		}
		cout << endl;
}

return 0;
}
