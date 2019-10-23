//======================================================================================
// Name        : 	URI - 1004.cpp
// Author      : 	Bruno Manso
// Description : 	Read two integer values. After this, calculate the product
//					between them and store the result in a variable named PROD.
//					The input file contains 2 integer numbers.
//					Print PROD according to the following example, with a blank
//					space before and after the equal signal.
//======================================================================================

#include <iostream>
using namespace std;

int main() {
	int A;
	int B;
	int PROD;

	cout << "Insira A: " << flush;
	cin >> A;

	cout << "Insira B: " << flush;
	cin >> B;


	PROD = A * B;
	cout << "O Produto entre A e B é: " << PROD << endl;
	return 0;
}
