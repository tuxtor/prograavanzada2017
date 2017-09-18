/*
 * funciones.cpp
 *
 *  Created on: Sep 18, 2017
 *      Author: tuxtor
 */
#include <stdlib.h>
#include <stdio.h>
void intercambia(int x, int y){
	int z;
	z = x;
	x = y;
	y = z;
}

void demostrarPuntero(){
	int i = 10;
	int * p = &i;
	printf("%d", *p);
}

