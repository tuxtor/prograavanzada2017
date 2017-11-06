package gt.url.edu.demoestructuras.modelo;

import gt.url.edu.demoestructuras.ds.ArrayList;
import gt.url.edu.demoestructuras.ds.List;
import gt.url.edu.demoestructuras.listas.LinkedPositionalList;
import gt.url.edu.demoestructuras.listas.Position;
import gt.url.edu.demoestructuras.listas.PositionalList;

public class Main {

	public static void main(String[] args) {
		PositionalList<String> alumnos = new
				LinkedPositionalList<>();
		
		Position<String> azul, gris1, gris2;
		
		azul = alumnos.addFirst("Pablo");
		azul = alumnos.addAfter(azul, "Jose");
		
		gris1 = alumnos.addAfter(azul, "Luis");
		gris1 = alumnos.addAfter(gris1, "Carlos");
		
		gris2 = alumnos.addAfter(gris1, "Walter");
		gris2 = alumnos.addAfter(gris2, "Andres");
				
		alumnos.addAfter(gris1, "Panchito");
		alumnos.addBefore(gris1, "Pedro");
		
		System.out.println(azul.getElement());
		System.out.println(gris1.getElement());
		System.out.println(gris2.getElement());
		
		System.out.println("=================");
		
		do {
			Position<String> primeraPosicion = alumnos.first();
			String resultado = alumnos.remove(primeraPosicion);
			System.out.println(resultado);
			
		} while (!alumnos.isEmpty());
		
		
		
	}
	

}
