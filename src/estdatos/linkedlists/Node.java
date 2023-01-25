<<<<<<< HEAD
package estdatos.linkedlists;

public class Node<E> {

	private E data; 
	private Node<E> next;
	
	public Node(E ele) {
		data = ele;
	}
	
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	public Node<E> getNext(){
		return next;
	}
	
	public E getData() {
		return data;
	}
	
	/**
	 * Este metodo compara si el elemento actual es menor
	 * al elemento pasado como parámetro.
	 * @param element
	 * @return
	 */
	public boolean esMenor(Node<E> element) {
		boolean esMenor = false;
		
		Integer elementInteger = (int)element.getData();
		Integer thisInteger = (int) this.data;
		
		if(thisInteger<elementInteger)
			esMenor = true;
		
		return esMenor;
	}
	
}
=======
package estdatos.linkedlists;

public class Node<E> {

	private E data; 
	private Node<E> next;
	
	public Node(E ele) {
		data = ele;
	}
	
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	public Node<E> getNext(){
		return next;
	}
	
	public E getData() {
		return data;
	}

	
}
>>>>>>> 18f5cbedcabeff64e59dd0f8e61ef189b7cab8c3
