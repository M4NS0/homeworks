//=========================================================================================================
// Name        : 	URI - 1002.cpp
// Author      : 	Bruno C. Manso
// Description :	The formula to calculate the area of a circumference is defined as A = π . R2.
//					Considering to this problem that π = 3.14159:
//	   				Calculate the area using the formula given in the problem description.
//					The input contains a value of floating point (double precision), that is the variable R.
//==========================================================================================================


#include <iostream>
using namespace std;

int main() {

	cout << "Insert the radius:  " << flush;
	float r;
	cin >> r;

	float a = 3.14159*r*2;

	cout << "The area is equals to: " << a << endl;

	return 0;
}
