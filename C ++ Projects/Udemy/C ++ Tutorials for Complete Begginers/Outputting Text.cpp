// Outputting Text

# include<iostream>

using namespace std;

// function, block of code
int main() {

	// this is a statement ending with semicolon
	cout << "Starting program..." << endl; // clean the memory to start the codes above don't generate a newline

	cout << "This is a text" << flush; // endl - blank new line after the text, and flush the output

	cout << "Banana." << " " << "Apple." << " " << "Orange." << endl;

	cout << "This is another text" << endl; // << chevron

	return 0; // like a typewriter, in the ending of a line u must roll and go to the next line
}
