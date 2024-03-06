package ejercicio04;

/**
 * Clase que representa los articulos de una tienda, con los que vamos a
 * trabajar
 * 
 * @author jlmejorada
 */
public class Articulo {

	/**
	 * Atributo variable de tipo string que registra el nombre del producto
	 */
	private String nombre = "";

	/**
	 * Atributo variable de tipo double que registra el precio del producto
	 */
	private double precio = 0;

	/**
	 * Atributo variable de tipo int que registra el stock del producto
	 */
	private int cuantosQuedan = 0;

	/**
	 * Atributo constante de tipo int que registra el IVA del producto
	 */
	public static final double IVA = 21;

	/**
	 * Constructor con parametros para el nombre, precio y el stock del objeto
	 * 
	 * @param nombre        Nombre del articulo
	 * @param precio        Precio del articulo
	 * @param cuantosQuedan Cantidad de stock del articulo
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {

		// Si el nombre introducido por parametros no es null o cadena vacia
		if (nombre != null && !nombre.equals("")) {
			// Asignamos el parametro al atributo correspondiente
			this.nombre = nombre;
		}

		// Si el precio introducido por parametros es mayor que 0
		if (precio > 0) {
			// Asignamos el parametro al atributo correspondiente
			this.precio = precio;
		}

		// Si el stock introducido por parametros es mayor que 0
		if (cuantosQuedan > 0) {
			// Asignamos el parametro al atributo correspondiente
			this.cuantosQuedan = cuantosQuedan;
		}

	}

	/**
	 * Método para imprimir la información del artículo por pantalla.
	 */
	public void imprimirArt() {
		// Imprimimos el nombre
		System.out.println("Articulo: " + nombre);
		// Imprimimos el precio
		System.out.println("Precio: " + precio);
		// Imprimimos el stock
		System.out.println("Stock: " + cuantosQuedan);
		System.out.println("-----------------------------------");
	}

	/**
	 * Devuelve el precio de venta al público (PVP) con iva.
	 * 
	 * @return Devuelve el precio final con IVA
	 */
	public double getPVP() {
		// Creamos una variable que recogerá el precio final del articulo
		double precioFinal = 0;
		// Calculamos el precio final (precio * 1.21)
		precioFinal = precio * ((IVA / 100) + 1);
		// Devolvemos el precio final del articulo
		return precioFinal;
	}

	/**
	 * Devuelva el PVP con un descuento pasado como argumento.
	 * 
	 * @param descuento Porcentaje de descuento a aplicar
	 * @return Devuelve el precio final con descuento
	 */
	public double getPVPDescuento(double descuento) {
		// Creamos una variable que recogerá el precio final del articulo
		double precioFinal = 0;
		// Calculamos el precio final (ej descuento 20%, precio*0,8)
		precioFinal = getPVP() * (1 - (descuento / 100));
		// Devolvemos el precio final del articulo
		return precioFinal;
	}

	/**
	 * Actualiza los atributos del objeto tras vender una cantidad ‘x’
	 * 
	 * @param x La cantidad que nos han pedido
	 * @return Devolvemos si se ha podido vender o no
	 */
	public boolean vendido(int x) {
		// Creamos una variable booleana
		boolean esVendido = false;
		// Si queda stock con respecto a los que vamos a vender
		if (this.cuantosQuedan >= x) {
			// Marcamos es prestado como true
			esVendido = true;
			// Marcamos cuantos quedan
			cuantosQuedan -= x;
		}
		// Devolvemos si hay sido prestado o no
		return esVendido;
	}

	/**
	 * Actualiza los atributos del objeto tras almacenar una cantidad ‘x’
	 * 
	 * @param x La cantidad que nos han pedido
	 */
	public void almacena(int x) {
		// Añadimos cuantos quedan
		cuantosQuedan += x;
	}
}
