//============================================================================
// Name        : DemoMemoria.cpp
// Author      : Victor Orozco
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void cambiarValor(int*,int*);//Prototipo
void cambiarValor2(int&,int&);//Prototipo

int demoMemoria() {
	int a = 10;
	int b = 20;
	int* pa;
	int* pb;

	//Valor en punteros
	pa = &a;
	pb = &b;

	cout << a << "  " << b << endl; // prints !!!Hello World!!!
	cambiarValor2(a, b);
	cout << a << "  " << b << endl; // prints !!!Hello World!!!
	cout << *pa << "  " << *pb << endl; // prints !!!Hello World!!!
	return 0;
}

void cambiarValor2(int &a, int &b){
	int c = a;
	a = b;
	b = c;
}


void cambiarValor(int *a, int *b){
	int c = *a;
	*a = *b;
	*b = c;

}
