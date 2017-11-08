/*
 * funciones.cpp
 *
 *  Created on: Sep 18, 2017
 *      Author: tuxtor
 */
#include <stdlib.h>
#include <stdio.h>
void intercambia(int * x, int * y){

	int z;
	z = *x;
	*x = *y;
	*y = z;
}

void demostrarPuntero(){
	int i = 30;
	int * p = &i;
	int * q = p;

	*q=40;
	printf("p= %d %d \n",*p, *q);
	*p=50;
	printf("p=%d\n",*q);
	printf("qdir=%d\n",q);
	printf("pdir=%d\n",p);

}

