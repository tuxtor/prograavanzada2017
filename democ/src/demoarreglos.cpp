/*
 * demoarreglos.cpp
 *
 *  Created on: Sep 27, 2017
 *      Author: tuxtor
 */
#include <iostream>

using namespace std;

void testArray() {
	//Declaramos un arrego y lo inicializamos
	int foo[] = { 16, 2, 77, 40, 12071 };

	for (int i = 0; i < 5; i++) {
		cout << foo[i] << endl;
	}
}

void testArray2() {
	long foo[] = { 16, 2, 77, 40, 12071 };
	for (long i = 0; i < 5; i++) {
		long* dir = &foo[i];
		cout << dir << endl;
		cout << foo[i] << endl;
	}
}

void testArray3() {
	int foo[] = { 16, 2, 77, 40, 12071 };
	int* ptr = &foo[0];

	for (int i = 0; i < 5; i++) {
		cout << (ptr + i) << endl;
		cout << *(ptr + i) << endl;
	}
}

void testArray4() {
	const char* szString = "Panchito";
//	cout << "The array is '" << szString << "'" << endl;
//	cout << "Display the string as an array: ";
//
//	for (int i = 0; i <= 5; i++) {
//		cout << szString[i];
//	}

	cout << endl;
// now using typical pointer arithmetic
	cout << "Display string using a pointer: ";
	const char* pszString = szString;
	cout << pszString <<endl;
	while(*pszString)
	{
		cout << pszString << endl;
		cout << *pszString << endl;
		pszString++;
	}

	int foo[] = { 16, 2, 77, 40, 12071 };
	int* ptr = &foo[0];

	while(*ptr)
	{
		cout << ptr << endl;
		cout << *ptr << endl;
		ptr++;
	}

//	cout << endl;
//// wait until user is ready before terminating program
//	// to allow the user to see the program results
//	cout << "Press Enter to continue..." << endl;
//	cin.ignore(10, '\n');
//	cin.get();


}

void test5(){
	const char* cadena = "Hola mundo";

	cout << cadena <<endl;
	cout << *cadena<<endl;

	while(*cadena)
	{
		cout << *cadena;
		cadena++;
	}

}





