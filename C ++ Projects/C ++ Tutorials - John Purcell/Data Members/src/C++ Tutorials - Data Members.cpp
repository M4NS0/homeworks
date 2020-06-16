//============================================================================
// Name        : C++.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Data Members
//============================================================================

#include <iostream> // standard header file
#include "Cat.h" 	// local header file
using namespace std;

int main() {
	Cat jim;
	jim.makeHappy();
	jim.speak();


	Cat bob;
	bob.makeSad();
	bob.speak();

	return 0;
}
