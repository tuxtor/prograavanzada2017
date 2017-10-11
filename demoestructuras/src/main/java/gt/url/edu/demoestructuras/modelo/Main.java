package gt.url.edu.demoestructuras.modelo;

import gt.url.edu.demoestructuras.ds.ArrayQueue;
import gt.url.edu.demoestructuras.ds.Queue;
import gt.url.edu.demoestructuras.ds.Stack;
import gt.url.edu.demoestructuras.listas.CircularLinkedList;
import gt.url.edu.demoestructuras.listas.DoubleLinkedList;
import gt.url.edu.demoestructuras.listas.LinkedList;

public class Main {

	public static void main(String[] args) {
//		Stack<String> laPila = new LinkedList<>();
//		
//		laPila.push("Hola");
//		laPila.push("Panchito");
//		laPila.push("Mundo");
//		laPila.push("Como estas");
//		
//		String valor = null;
//		do {
//			valor = laPila.pop();
//			System.out.println(valor);
//		} while (valor != null);
		
		Queue<String> laCola = new ArrayQueue<>();
		
		laCola.enqueue("Hola");
		laCola.enqueue("Mundo");
		laCola.enqueue("Panchito");
		laCola.enqueue("Lo mismo");
		
		String valor = null;
		do {
			valor = laCola.dequeue();
			System.out.println(valor);
		} while (valor != null);
		
		
	}
	

}
