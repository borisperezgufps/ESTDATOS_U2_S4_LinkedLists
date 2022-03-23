package estdatos.linkedlists;

public class MyLinkedList<E> {

	// Ojo, el apuntador a la cabeza de la lista nunca
	// debe moverse, de lo contrario perderá la referencia
	// al primer elemento.
	private Node<E> head;
	private int size = 0; // Number of elements in the list

	/**
	 * Agrega un elemento de tipo E a la lista
	 * @param e
	 */
	public void add(E element) {
		if(head==null) {
			// Si la lista está vacía, la cabeza será el nodo que se creará
			head = new Node<E>(element); 
			size++;
			// Se incluye return para que finalice el método
			return; 
		}

		// Y si no está vacía?
		
		// Variable temporal apuntando a la cabeza
		Node<E> current = head;
		
		// Recorro la lista moviendo el apuntador
		while(current.getNext()!=null) {
			current = current.getNext();
		}
		
		// Cuando se encuentra el último nodo, es decir, 
		// el nodo sin un nodo siguiente, entonces 
		// se crea el nuevo nodo asignándolo como current
		current.setNext(new Node<E>(element));
		size++;
		
	}
	
	/**
	 * Imprime la lista completa.
	 * @return String con la información de los elementos contenidos
	 */
	public String print() {
		// Se crea un objeto que guardará el resultado
		// de la concatenación. Se podría haber usado un
		// String también.
		StringBuffer sb = new StringBuffer("[");
		
		Node<E> current = head;
		for(int i=0;i<size;i++) {
			sb.append(current.getData());
			current = current.getNext();
			if(current != null)
				sb.append(", ");
			else
				sb.append("]");
		}
		
		return sb.toString();
	}
	
	/**
	 * Busca un elemento dentro de una lista, y lo elimina.
	 */
	public void remove(E element) {
		// TODO Considerar los posibles casos
		// 1) Si el elemento a borrar está en la cabeza
		// 2) Si el elemento a borrar está en la mitad
		// 3) Si el elemento a borrar está en la cola
		
		
		// ---------------------------
		// Se considera el caso (2)
		// ---------------------------
		
		// Se pregunta si hay un elemento luego de la cabeza
		if(head.getNext()!=null) {
		
			Node<E> previous = head;
			
			while(previous.getNext()!=null) {
					
				Node<E> toFind = previous.getNext();
				
				if(!element.equals(toFind.getData())){
					previous = toFind;
				}else {
					Node<E> current = toFind.getNext();
					previous.setNext(current);
					size--;
					return;
					// ¿Qué pasa con la relación que queda del 
					// nodo a eliminar y el nodo que le sigue? 
				}
								
			}
		
		}	
		
		// ---------------------------
		// Se considera el caso (1)
		// ---------------------------
		
		
		// ---------------------------
		// Se considera el caso (3)
		// ---------------------------
		
	}
	
	// *************************************
	// METODOS PARA IMPLEMENTAR POR LOS
	// ESTUDIANTES
	// *************************************
	
	
	/**
	 * 
	 * @param element
	 * @param pos
	 */
	public void add(E element, int pos) {
		
	}
	
	/**
	 * 
	 * @param pos
	 * @return
	 */
	public E remove(int pos) {
	
		
		return null;
	}
	
	/**
	 * 
	 */
	public void clear() {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	public Node<E> getFirst(){
		return null;
	}
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 */
	public void exchangeNodes(Node<E> n1, Node<E> n2) {
		
	}

}







