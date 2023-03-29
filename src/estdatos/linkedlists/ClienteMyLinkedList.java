package estdatos.linkedlists;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class ClienteMyLinkedList {

	public static void main(String[] args) {
//		MyLinkedList<String> lista = new MyLinkedList<String>();
//		lista.add("carro");
//		lista.add("avion");
//		lista.add("zarro");
//		lista.add("moto");
//		
//		lista.imprimirMayores("hola");
//		
//		MyLinkedList<Integer> lista2 = new MyLinkedList<Integer>();
//		lista2.add(6);
//		lista2.add(5);
//		lista2.add(4);
//		lista2.add(9);
//		
//		lista2.imprimirMayores(6);
//		
//		MyLinkedList<Persona> lista3 = new MyLinkedList<Persona>();
//		lista3.add(new Persona(34));
//		lista3.add(new Persona(37));
//		lista3.add(new Persona(33));
//		lista3.add(new Persona(31));
//		
//		lista3.imprimirMayores(new Persona(35));
		
		MyLinkedList<Persona> lista3 = new MyLinkedList<Persona>();
		lista3.add(new Persona(23, "Carlos", 1981));
		lista3.add(new Persona(12, "Vanessa", 1983));
		lista3.add(new Persona(21, "Sofia", 1985));
		
		lista3.imprimirMayores(new Persona(18));
		
	
		
		
	}
	
	public static void main2(String[] args) {
		MyLinkedList<Persona> lista = new MyLinkedList<Persona>();
		
		try {
		
			lista.add(new Persona(23, "Roberto", 1975));
			lista.add(new Persona(21, "Marcela", 1973));
			lista.add(new Persona(27, "Rafael", 1987));
			lista.add(new Persona(20, "Laura", 1980));
		
		}catch(Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
		Persona pComparar = new Persona(21,null,0);
		
		for(int i=0;i<lista.getSize();i++) {
			Persona p = lista.get(i);
			
			// Imprimir personas mayores a 21
			
			if(p.compareTo(pComparar)>0)
				System.out.println(p.getNombre() + " es mayor a 21.");
		}
	}
	
	public static void main3(String[] args) {

		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("Carlos");
		list.add("Pedro");
		list.add("Paola");
		list.add("Laura");
		list.add("Sofia");

		int pos = 7;
		try {
			
			System.out.println(list.remove(pos));
			System.out.println(list.print());
		} catch (Exception e) {
			System.err.println("Error = " + e.getMessage() + 
					". No se puede acceder a la posición "+pos);
		}

		try {
			System.out.println(list.remove(0));
		} catch (Exception e) {
			System.err.println("Error = " + e.getMessage());
		}

		try {

			System.out.println(list.remove(1));
			System.out.println(list.print());
		} catch (Exception e) {
			System.err.println("Error = " + e.getMessage());
		}

		try {
			System.out.println(list.remove(2));
			System.out.println(list.print());
		} catch (Exception e) {
			System.err.println("Error = " + e.getMessage());
		}

	}

	public void manualInsert() {

		MyLinkedList<String> mll = new MyLinkedList<>();

//		mll.add("Carlos");
//		mll.add("Rafael");
//		mll.add("Arturo");
//		mll.add("Maritza");

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

	private static void openAndReadFile(MyLinkedList<String> mll) {

		for (int i = 0; i < 400; i++) {
//			mll.add("Carlos Romero " + Calendar.getInstance().getTimeInMillis());
//				Thread.sleep(100);
		}

	}

	private static void openAndReadFile(String[] arreglo) {

		for (int i = 0; i < 400; i++) {
			arreglo[i] = "Carlos Romero " + Calendar.getInstance().getTimeInMillis();
//				Thread.sleep(100);
		}

	}

}
