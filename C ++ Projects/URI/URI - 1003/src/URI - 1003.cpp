//=============================================================================================
// Name        : 	URI - 1003.cpp
// Author      : 	Bruno C. Manso
// Description : 	Read two integer values, in this case, the variables A and B.
//					After this, calculate the sum between them and assign it to the variable SOMA.
//					Write the value of this variable.
//					The input file contains 2 integer numbers.
//=============================================================================================

#include <iostream>
using namespace std;

int main() {

	int A;
	int B;
	int SOMA;

	cout << "Insert A: " << endl;
	cin >> A;

	cout << "Insert B: " << endl;
	cin >> B;

	SOMA = A + B;

	cout << "SOMA= " << SOMA << endl;

	return 0;
}
