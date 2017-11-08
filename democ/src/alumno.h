/*
 * alumno.h
 *
 *  Created on: Sep 27, 2017
 *      Author: tuxtor
 */

#ifndef ALUMNO_H_
#define ALUMNO_H_

#include <iostream>
using namespace std;

class Alumno
{
public:
       int edad;
       string nombre;

       Alumno()
       {
              edad = 18;
              nombre = "panchito";
       }

       void decirNombre(){
    	   	   cout << "Hola soy " << this->nombre << endl;
       }
};



#endif /* ALUMNO_H_ */
