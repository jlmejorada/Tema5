package ejercicio12;

/**
 * Contiene las funciones principales de la clase articulo
 */
public class ArrayArticulo {

	/**
	 * Array que recoge los Articulos de nuestro CRUD
	 */
	static Articulo[] art = new Articulo[20];

	public static void imprimir() {
		int contador=0;
		while (contador<art.length && art[contador]!=null) {
			System.out.println(art[contador]);
			contador++;
		}
	}
	
	public static boolean alta(Articulo nuevo) {
		boolean alta=false;
		int contador=0;
		while (contador<art.length && art[contador]!=null) {
			contador++;
		}
		if (contador<art.length) {
			art[contador] = nuevo;
			alta=true;
		}
		return alta;
	}
	
	public static int buscaArticulo(Articulo objeto) {
		int contador = 0;
		int posicion = -1;
		while (contador<art.length && posicion==-1) {
			if (art[contador] ) {
				
			}
			
			
			contador++;
		}
		return posicion;
	}
	
}
