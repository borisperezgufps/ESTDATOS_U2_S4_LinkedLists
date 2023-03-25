package estdatos.linkedlist.iterator;

import java.util.Iterator;

public class LinkedListIterator<E> implements Iterable<E>, Iterator<E> {

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		return this;
	}
	
	/**
	 * Elimina el elemento retornado por next().
	 */
	@Override
	public void remove() {
		
	}
	
	/**
	 * Recorre la lista eliminando los elementos duplicados
	 */
	public void removeDuplicate() {
	
	}
	
	/**
	 * Combina la lista
	 * @param secondList
	 */
	public void mergeList(LinkedListIterator<E> secondList) {
		
	}
	
	/**
	 * Obtiene el elemento de la mitad de la lista
	 * @return
	 */
	public E getMiddle() {
		return null;
	}
	
	public E getLast() {
		return null;
	}
	
	/**
	 * Invierte la dirección de la lista.
	 */
	public void reverse() {
		
	}
	
	/**
	 * Remove the last element of the list
	 * @param data
	 * @return
	 */
	public boolean remove(E data) {
		return false;
	}
	
	public boolean removeFirts(E data) {
		return false;
	}
	
	public boolean removeByIndex(int index) {
		return false;
	}
	
	public String toString() {
		return null;
	}
	
	public void add(E data) {
		
	}
	
	public void addAtFirst(E data) {
		
	}
	
	public void add(E data, int index) throws IndexOutOfBoundsException {
		
	}
	
	public E get(int index) {
		return null;
	}

}
