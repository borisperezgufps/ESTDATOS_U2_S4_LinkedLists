package estdatos.doublelinkedlists;

public class ClienteMyDoubleLinkedList {

	public static void main(String[] args) {
		
		MyDoubleLinkedList<String> myD = new MyDoubleLinkedList<String>();
		
		myD.add("Boris");
		myD.add("Perez");
		myD.print();
		
		
		MyDoubleLinkedList<Integer> myI = new MyDoubleLinkedList<Integer>();
		
		myI.add(5);
		myI.add(7);
		myI.print();
		
	}
	
	
	
}
