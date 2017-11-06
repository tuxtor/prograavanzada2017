package gt.url.edu.demoestructuras.arboles;

import gt.url.edu.demoestructuras.listas.Position;

public interface BinaryTree<E> extends Tree<E> {
	Position<E> left(Position<E> p) throws IllegalArgumentException;
	Position<E> right(Position<E> p) throws IllegalArgumentException;
	Position<E> sibling(Position<E> p) throws IllegalArgumentException;
}
