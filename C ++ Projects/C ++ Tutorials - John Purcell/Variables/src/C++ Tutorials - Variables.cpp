//============================================================================
// Name        : Variables.cpp
// Author      : Bruno Manso
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	// int 1stnum is wrong!
	// declaring label and value
	// int number_dogs = 5;
	int numberDogs = 5;
	int numberDawgs = 7;
	int totalDogos = numberDogs + numberDawgs;

	cout << "Number of Dogs " << numberDogs << endl;

	cout << "Number of Dawgs " <<  numberDawgs << endl;

	cout << "Total of Dogos: " << numberDogs + numberDawgs << endl;

	cout << "New Dogo acquired!!" << endl;

	numberDogs = numberDogs + 1;

	cout << "New number of Dogos: " << numberDogs << endl;

	cout << "Hello!" << endl;

	return 0;
}
