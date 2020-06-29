//============================================================================
// Name        : 	URI.cpp
// Author      : 	Bruno Manso
// Description : 	Read three values (variables A, B and C), which are
//					the three student's grades. Then, calculate the
//					average, considering that grade A has weight 2,
//					grade B has weight 3 and the grade C has weight 5.
//					Consider that each grade can go from 0 to 10.0,
//					always with one decimal place.
//					The input file contains 3 values of floating points
//					with one digit after the decimal point.
//============================================================================

#include <iostream>
#include <iomanip>
using namespace std;

int main() {
	float a;
	float b;
	float c;
	float med;

	cout << "Insira A: " << flush;
	cin >> a;
	cout << "Insira B: " << flush;
	cin >> b;
	cout << "Insira C: " << flush;
	cin >> c;

	a = a*2;
	b = b*3;
	c = c*5;

	med = (a+b+c)/(2+3+5);
	cout << "A média é: " << med << fixed << setprecision(3) << endl;

	return 0;
}
