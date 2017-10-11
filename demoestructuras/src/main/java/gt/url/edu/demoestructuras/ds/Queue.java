package gt.url.edu.demoestructuras.ds;

/**
 * Simple stack ADT representation
 * 
 * @author Víctor Orozco based on code from:
 ∗ @author Michael T. Goodrich
 ∗ @author Roberto Tamassia
 ∗ @author Michael H. Goldwasser
 */

public interface Queue<E> {

	/**
	 * Returns queue elements count
	 * @return number of elements in stack
	 */
	int size();
	
	/**
	 * Checks if queue is empty
	 * @return true if queue is empty, false otherwise
	 */
	boolean isEmpty();
	
	/**
	 * Inserts an element in the queue
	 * @param e element to be inserted
	 */
	void enqueue(E e);
	
	/**
	 * Retrieves the first element of the queue without remotion
	 * @return First queue element (null if empty)
	 */
	E first();
	
	/**
	 * Retrieves the first element of the queue removing it
	 * @return First stack element (null if empty)
	 */
	E dequeue();
}
