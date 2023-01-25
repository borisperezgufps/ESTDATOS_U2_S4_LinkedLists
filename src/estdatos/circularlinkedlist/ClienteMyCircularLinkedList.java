package estdatos.circularlinkedlist;

public class ClienteMyCircularLinkedList {

	public static void main(String[] args) {
		
		MyCircularLinkedList<Integer> myD = new MyCircularLinkedList<Integer>();
		
		myD.add(5);
		myD.add(9);
		myD.add(7);
		
		myD.print(6);
		
		myD.remove(10);
		
		myD.print(6);
		
	}
	
	
	
}
