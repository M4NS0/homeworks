//============================================================================
// Name        : Conditions.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

/*
 * == equality test operator
 * != not equals
 * < less than
 * > greater than
 * <= less than or equal to
 * >= greater than equal to
 */

int main() {

	int value1 = 7;
	int value2 = 4;

	if (value1 >= 5) {
		cout << "Condition 1: true" << endl;
	} else {
		cout << "Condition 1: false" << endl;
	}

	if (value1 == 7 && value2 < 3) { // && is and one is true and the other is false > false
		cout << "Condition 2: true" << endl;
	} else {
		cout << "Condition 2: false" << endl;
	}

	if (value1 == 7 || value2 < 3) { // || is or if the first is true doesn't have to validate the second condition
		cout << "Condition 3: true" << endl;
	} else {
		cout << "Condition 3: false" << endl;
	}

	if ((value2 != 8 && value1 == 10) || value1 < 10) { // validate left to right
		cout << "Condition 4: true" << endl;
	} else {
		cout << "Condition 4: false" << endl;
	}

	bool condition1 = (value2 != 8) && (value1 == 10); // the program is going to validate this line, permitting the operation on the line above
	cout << condition1 << endl;

	bool condition2 = value1 < 10;
	cout << condition2 << endl;

	if (condition1 || condition2) { // validate left to right
		cout << "Condition 5: true" << endl;
	} else {
		cout << "Condition 5: false" << endl;
	}

	return 0;

}
