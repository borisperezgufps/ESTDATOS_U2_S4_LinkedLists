package excepciones;

import javax.swing.JOptionPane;

public class Inicio {

	public static void main(String[] args) {

		Inicio i = new Inicio();
//		try {
//			i.guardarTelefono("84.8494904");
			JOptionPane.showMessageDialog(null, "Se guardó exitosamente");
//		}catch(Exception e) {
//			JOptionPane.showMessageDialog(null, "Hubo un error: "+e.getMessage());
//		}

	}	
	
	public void guardarTelefono(String telefono) throws Exception{
		
//		try {

			int val = Integer.valueOf(telefono);
			System.out.println("Realizando operaciones");

//		} catch (Exception e) {
//			mensaje = "Hubo un error. "+e.getMessage();
//			e.printStackTrace();
//		}

		
	}

}
