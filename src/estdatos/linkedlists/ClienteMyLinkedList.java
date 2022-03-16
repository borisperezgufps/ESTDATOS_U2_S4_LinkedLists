package estdatos.linkedlists;

public class ClienteMyLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList<String> mll = new MyLinkedList<>();
		
		mll.add("Carlos");
		mll.add("Rafael");
		mll.add("Arturo");
		mll.add("Maritza");
		
		System.out.println(mll.print());
		
		mll.remove("Rafael");
		
		System.out.println(mll.print());
	}
	
}
