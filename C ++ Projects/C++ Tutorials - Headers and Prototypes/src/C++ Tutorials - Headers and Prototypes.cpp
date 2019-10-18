//============================================================================
// Name        : C++.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : C++ Tutorials - Headers and Prototypes
//============================================================================

#include <iostream> 	// < >  means special location on your machine

#include "utils.h"		// permit to see the file utils.h
						// double quotes is in project

						// pre-process use to looks first the # harsh symbols to execute when its build

using namespace std;

// void doSomething(); 	// C++ is down to top main must be is in final
						// unless if u use the prototype here
						// allowing the function to be accessed even under the main

						// you can generate a text file with routines:
						// On project click >> New >> Other...>> C++ >> Headers >> <yourfilename>.h
						// to make it work, add #include "<yourfilename>.h" under <iostream>
						// see at utils.h

int main() {

	doSomething();

	return 0;
}

void doSomething() {
	cout << "Hello" << endl;
}
