package estdatos.doublelinkedlists;

public class Node<E> {

	private E data; 
	private Node<E> next;
	private Node<E> prev;
	
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

	public Node<E> getPrev() {
		return prev;
	}

	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}
	
}
