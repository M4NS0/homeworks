//============================================================================
// Name        : Comparing.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <iomanip>
using namespace std;

int main() {

	float value1 = 1.1;

	if (value1 == 1.1) {
		cout << "equals" << endl;
	} else {
		cout << "not equal" << endl;
	}

	cout << setprecision(2) << value1 << endl;

	return 0;

}
