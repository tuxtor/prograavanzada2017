//============================================================================
// Name        : democ.cpp
// Author      : Victor Orozco
// Version     :
// Copyright   : BSD
// Description : Hello World in C++, Ansi-style
//============================================================================
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include "funciones.h"
#include "demoheap.h"
using namespace std;

void testArray() {
	int foo[] = { 16, 2, 77, 40, 12071 };
	for (int i = 0; i < 5; i++) {
		cout << foo[i] << endl;
	}
}

void testArray2() {
	int foo[] = { 16, 2, 77, 40, 12071 };
	for (int i = 0; i < 5; i++) {
		int* dir = &foo[i];
		cout << dir << endl;
		cout << foo[i] << endl;
	}
}

void testArray3() {
	int foo[] = { 16, 2, 77, 40, 12071 };
	int* ptr = &foo[0];

	for (int i = 0; i < 5; i++) {
		cout << *(ptr + i) << endl;
	}
}

void testArray4() {
	const char* szString = "Panchito";
	cout << "The array is '" << szString << "'" << endl;
	cout << "Display the string as an array: ";
	for (int i = 0; i < 5; i++) {
		cout << szString[i];
	}
	cout << endl;
// now using typical pointer arithmetic
	cout << "Display string using a pointer: ";
	const char* pszString = szString;
	while(*pszString)
	{
		cout << *pszString;
		pszString++;
	}
	cout << endl;
// wait until user is ready before terminating program
	// to allow the user to see the program results
	cout << "Press Enter to continue..." << endl;
	cin.ignore(10, '\n');
	cin.get();
}

int main() {
	testArray4();
}

