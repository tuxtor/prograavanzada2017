package gt.url.edu.demoestructuras.modelo;

import gt.url.edu.demoestructuras.listas.CircularLinkedList;

public class Main {

	public static void main(String[] args) {

		CircularLinkedList<String> listaCircular = new CircularLinkedList<>();
		
		listaCircular.addFirst("GUA");
		listaCircular.addLast("SAL");
		listaCircular.addLast("HON");
		listaCircular.addFirst("MEX");
		listaCircular.addFirst("CAN");
		listaCircular.addLast("BRA");
		String pais = null;
		do {
			pais = listaCircular.removeFirst();
			System.out.println(pais);
		} while (pais != null);
		
	}
	

}
