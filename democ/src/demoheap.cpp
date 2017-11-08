/*
 * demoheap.cpp
 *
 *  Created on: Sep 27, 2017
 *      Author: tuxtor
 */
#include <iostream>
using namespace std;

double* child(void) {
	double dLocalVariable = 9;
	return &dLocalVariable;

//	double* pdLocalVariable = new double;
//	return pdLocalVariable;
}
void parent(void) {
	double* pdLocal;
	pdLocal = child();
	cout << *pdLocal << endl;
	*pdLocal = 1.0;
	cout << *pdLocal << endl;

//	double* pdMyDouble = child();
//	// store a value there
//	*pdMyDouble = 1.1;
//	// ...
//	// now return the memory to the heap
//	delete pdMyDouble;
//	pdMyDouble = 0;
}



