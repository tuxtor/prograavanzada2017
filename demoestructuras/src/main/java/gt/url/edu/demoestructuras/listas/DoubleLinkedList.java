package gt.url.edu.demoestructuras.listas;

public class DoubleLinkedList<E> {

	private static class Node<E> {
		private E element;
		private Node<E> prev;//Anterior
		private Node<E> next;//Siguiente

		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getPrev() {
			return prev;
		}

		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

	}

	private Node<E> header = null;//Referencia
	private Node<E> trailer = null;
	private int size = 0;

	public DoubleLinkedList() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() {
		if (isEmpty())
			return null;
		return header.getNext().getElement();
	}

	public E last() {
		if (isEmpty())
			return null;
		return trailer.getPrev().getElement();
	}

	public void addFirst(E e) {
		addBetween(e, header, header.getNext());
	}

	public void addLast(E e) {
		addBetween(e, trailer.getPrev(), trailer);
	}

	public E removeFirst() {
		if (isEmpty())
			return null;
		return remove(header.getNext());
	}
	public E removeLast() {
		if (isEmpty())
			return null;
		return remove(trailer.getPrev());
	}
	
	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		Node<E> newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}
	
	private E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev( );
		Node<E> successor = node.getNext( );
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement( );
	}

}
