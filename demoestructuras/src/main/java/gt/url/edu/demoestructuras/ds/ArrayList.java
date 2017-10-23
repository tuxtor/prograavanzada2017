package gt.url.edu.demoestructuras.ds;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E>, Iterable<E> {
	
	/**
	 * Implementacion de iterador basado en el iterador oficial de Java
	 */
	private class ArrayIterator implements Iterator<E>{
		
		private int j = 0; 
		boolean removable = false; // can remove be called at this time?

		@Override
		public boolean hasNext() {
			return j < size;
		}

		@Override
		public E next() throws NoSuchElementException {
			if (j == size) throw new NoSuchElementException("No next element");
			removable = true;
			return data[j++];
		}
		
		public void remove() throws IllegalStateException {
			if (!removable) throw new IllegalStateException("nothing to remove");
				ArrayList.this.remove(j-1);
			j--;
			removable = false;
		}
	}
	
	public Iterator<E> iterator( ) {
		return new ArrayIterator();
	}

	public static final int CAPACITY = 16;
	private E[] data;
	private int size = 0;

	public ArrayList() {
		this(CAPACITY);
	}

	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E get(int i) {
		checkIndex(i, size);
		return data[i];
	}

	public E set(int i, E e) {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	public void add(int i, E e) {
		checkIndex(i, size + 1);
		if (size == data.length)
			resize(2 * data.length);
		for (int k = size - 1; k >= i; k--)
			data[k + 1] = data[k];
		data[i] = e; 
		size++;

	}

	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for (int k = i; k < size - 1; k++)
			data[k] = data[k + 1];
		data[size - 1] = null;
		size--;
		return temp;
	}

	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
	}

	/**
	 * Internal method to increase array capacity
	 * @param capacity
	 */
	protected void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity];
		for (int k=0; k < size; k++)
			temp[k] = data[k];
		data = temp;
	}

}
