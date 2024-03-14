package ejercicio11;

public class Alumno {

	private String nombre;
	
	private double notaMedia;

	public Alumno() {
	}

	public Alumno(String nombre, double notaMedia) {
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		String mostrar="";
		mostrar += "nombre=" + this.nombre + ", notaMedia=" + this.notaMedia ;
		mostrar += "----------------------------------------------------------------";
		return mostrar;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean esIgual=false;
		Alumno al = (Alumno) obj;
		if (this.nombre.equals(al.nombre)) {
			esIgual=true;
		}
		return esIgual;
	}
}
