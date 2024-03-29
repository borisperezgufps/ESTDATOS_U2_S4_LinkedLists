package estdatos.linkedlists;

public class Node<E> implements Comparable<Node<E>>{

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

	@Override
	public int compareTo(Node<E> o) {
		
		return 0;
	}

	
}