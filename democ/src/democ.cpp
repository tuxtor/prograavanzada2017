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
#include "alumno.h"
#include "demoarreglos.h"


using namespace std;


int main() {


	Alumno al1;
	al1.nombre = "Panchito reloaded";
	al1.decirNombre();
//
	Alumno* pAl1 = &al1;
	cout << pAl1<<endl;

	cout<< al1.nombre <<endl;
	//cout<< pAl1.nombre <<endl;


	cout<< pAl1->nombre <<endl;

}

