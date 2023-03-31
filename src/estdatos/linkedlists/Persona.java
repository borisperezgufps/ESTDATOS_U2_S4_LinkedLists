package estdatos.linkedlists;

public class Persona implements Comparable<Persona> {

	private int edad;
	private String nombre;
	private int anioNacimiento;

	public Persona(int edad, String nombre, int anioNacimiento) {
		this.edad = edad;
		this.nombre = nombre;
		this.anioNacimiento = anioNacimiento;
	}

	public Persona(int i) {
		edad = i;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	@Override
	public int compareTo(Persona o) {

		if (this.getEdad() > o.getEdad())
			return 1;
		else if (this.getEdad() < o.getEdad())
			return -1;

		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean equals(Object o) {

		if (o == null)
			return false;

		if (this.getClass() != o.getClass())
			return false;

		Persona p = (Persona) o;

		int atributosAcertados = 0;
		int totalAtributos = 0;

		if (!p.getNombre().isEmpty()) {
			totalAtributos++;
			if (this.getNombre().equals(p.getNombre())) {
				atributosAcertados++;
			}
		}

		if (p.getEdad() > 0) {
			totalAtributos++;
			if (this.getEdad() == p.getEdad()) {
				atributosAcertados++;
			}
		}

		if (p.getAnioNacimiento() > 1950) {
			totalAtributos++;
			if (this.getAnioNacimiento() == p.getAnioNacimiento()) {
				atributosAcertados++;
			}
		}

		if (atributosAcertados == totalAtributos) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		String valor = this.getNombre() + " (" + this.getEdad() + "): " + this.anioNacimiento;
		return valor;
	}

}
