package ejercicio02;

/**
 * una clase que guarde la información de cada uno de los libros de una
 * biblioteca.
 * 
 * @author jlmejorada
 */
public class Libro {

	/**
	 * título del libro
	 */
	private String titulo = "";

	/**
	 * autor del libro
	 */
	private String autor = "";

	/**
	 * ejemplares totales del libro
	 */
	private int ejemplares = 0;

	/**
	 * ejemplares prestados del libro
	 */
	private int prestados = 0;

	/**
	 * Constructor sin parametros
	 */
	public Libro() {
		super();
	}
	
	/**
	 * Constructor con parametros
	 * 
	 * @param titulo
	 * @param autor
	 * @param ejemplares
	 * @param prestados
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}
	
	/**
	 * Devuelve el titulo
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Asigna el titulo
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Devuelve el autor
	 * @return
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Asigna el autor
	 * @param titulo
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}


	/**
	 * Incrementa el atributo correspondiente cada vez que se realice un préstamo.
	 * No se pueden prestar libros si no quedan ejemplares disponibles para prestar.
	 * Devuelve true si se ha podido realizar el préstamo y false en caso contrario.
	 * 
	 * @return si es o no prestado
	 */
	public boolean Prestamo() {
		// Creamos una variable booleana
		boolean esPrestado = false;
		// Si quedan ejemplares libres
		if (this.ejemplares >= this.prestados) {
			// Marcamos es prestado como true
			esPrestado = true;
		}
		// Devolvemos si hay sido prestado o no
		return esPrestado;
	}

	/**
	 * decrementa el atributo correspondiente cada vez que se devuelva un libro. No
	 * se podrán devolver libros que no se hayan prestado. Devuelve true si se ha
	 * podido realizar la operación y false en caso contrario.
	 * 
	 * @return si se ha devuelto o no
	 */
	public boolean Devolucion() {
		// Creamos una variable booleana
		boolean esDevuelto = false;
		// Si quedan ejemplares libres
		/*
		 * if (this.ejemplares >= this.prestados) { // Marcamos es devuelto como true
		 * esDevuelto = true; }
		 */
		// Devolvemos si hay sido devuelto o no
		return esDevuelto;
	}

}
