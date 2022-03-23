package estdatos.linkedlists;

import java.util.Calendar;

public class ClienteMyLinkedList {

	public static void main(String[] args) {
		ClienteMyLinkedList cml = new ClienteMyLinkedList();
		cml.automaticInsert();
	}
	
	public void manualInsert() {
		
		MyLinkedList<String> mll = new MyLinkedList<>();
		
		mll.add("Carlos");
		mll.add("Rafael");
		mll.add("Arturo");
		mll.add("Maritza");
		
		System.out.println(mll.print());
				
		mll.remove("Rafael");
		
		System.out.println(mll.print());
		
	}
	
	public void automaticInsert() {
		
		MyLinkedList<String> mll = new MyLinkedList<>();
		String[] arreglo = new String[400]; 
		
		System.out.println("1 - " + Calendar.getInstance().getTimeInMillis());
		ClienteMyLinkedList.openAndReadFile(mll);
		System.out.println("2 - " + Calendar.getInstance().getTimeInMillis());
		ClienteMyLinkedList.openAndReadFile(arreglo);
		System.out.println("3 - " + Calendar.getInstance().getTimeInMillis());
		
		
		
		
	}
	
	private static void openAndReadFile(MyLinkedList<String> mll ) {	
		
		
			
			for(int i=0;i<400;i++) {
				mll.add("Carlos Romero "+Calendar.getInstance().getTimeInMillis());
//				Thread.sleep(100);
			}
		
		
	}
	
	private static void openAndReadFile(String[] arreglo) {	
		
		
			
			for(int i=0;i<400;i++) {
				arreglo[i] = "Carlos Romero "+Calendar.getInstance().getTimeInMillis();
//				Thread.sleep(100);
			}
		
		
	}
	
}
