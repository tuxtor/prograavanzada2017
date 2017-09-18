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
using namespace std;


int main() {
	int a = 7, b = 8;

//	demostrarPuntero();

	printf("a=%d b=%d\n",a,b);

	intercambia(&a,&b);
	printf("a=%d b=%d\n",a,b);
	return 0;
}




