package gt.url.edu.demoestructuras.listas;

/**
 * Implementacion de lista enlazada utilizando generics
 * @author tuxtor
 *
 * @param <E>
 */
public class LinkedList<E> {

	/**
	 * Inner class
	 * @author tuxtor
	 *
	 * @param <E>
	 */
	private static class Node<E>{
		private E element; //Valor
		private Node<E> next; //Puntero en la lista
		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
	}

	private Node<E> head = null;
	private Node<E> tail = null;
	
	private int size = 0;
	
	public int size() {return size;}
	
	public boolean isEmpty() { return size == 0;}
	
	public E first() {
		if (isEmpty()) return null;
		return head.getElement();
	}
	
	public E last() {
		if (isEmpty()) return null;
		return tail.getElement();
	}
	
	public void addFirst(E e) {
		head = new Node<>(e, head);
		if (size == 0) tail = head;
		size++;
	}
	
	public void addLast(E e) {
		Node<E> newest = new Node<>(e, null);
		if(isEmpty())
			head = newest;
		else
			tail.setNext(newest);
		tail = newest;
		size++;
	}
	
	public E removeFirst() {
		if (isEmpty()) return null;
		E response = head.getElement();
		head = head.getNext( );
		size--;
		if(size == 0) tail = null;
		return response;
	}
	
	
}
