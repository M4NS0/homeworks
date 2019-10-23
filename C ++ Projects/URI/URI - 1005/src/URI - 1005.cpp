//==========================================================================================
// Name        : 	URI.cpp
// Author      : 	Bruno Manso
// Description : 	Read two floating points' values of double precision A and B,
//					corresponding to two student's grades. After this, calculate
//					the student's average, considering that grade A has weight 3.5
//					and B has weight 7.5. Each grade can be from zero to ten, always
//					with one digit after the decimal point.
//					The input file contains 2 floating points' values with one digit
//					after the decimal point.
//					Print MEDIA(average in Portuguese) according to the following
//					example, with 5 digits after the decimal point and with a blank
//					space before and after the equal signal.
//==========================================================================================

#include <iostream>
#include <iomanip>
using namespace std;

int main() {
	double a;
	double b;
	double med;

	cout << "Insira a nota do aluno A: " << flush;
	cin >> a;

	cout << "Insira a nota do aluno B: " << flush;
	cin >> b;

	med = ((a*3.5) + (b*7.5))/(3.5 + 7.5);

	cout << "A média é: " << fixed << setprecision(5) << med << endl;


	return 0;
}
