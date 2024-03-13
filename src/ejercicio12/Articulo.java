package ejercicio12;

/**
 * Contiene las funciones principales de la clase articulo
 */
public class Articulo {

	/**
	 * atributo que recoge el codigo del articulo
	 */
	private int codigo;

	/**
	 * atributo que recoge la descripcion del articulo
	 */
	private String descripcion;

	/**
	 * atributo que recoge el precio de compra
	 */
	private double precioCompra;

	/**
	 * atributo que recoge el precio de venta
	 */
	private double precioVenta;

	/**
	 * atributo que recoge la cantidad que queda del producto
	 */
	private int stock;

	/**
	 * Constructor sin parametros
	 */
	public Articulo() {
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param codigo       Recoge el codigo del articulo
	 * @param descripcion  Recoge la descripcion del articulo
	 * @param precioCompra Recoge el precio de compra
	 * @param precioVenta  Recoge el precio de venta
	 * @param stock        Recoge la cantidad que queda del producto
	 */
	public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		if (codigo >= 0) {
			this.codigo = codigo;
		}
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	/**
	 * Para leer la descripción
	 * @return Devuelve la descripción
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Cambiar la descrip
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Para leer el precio de compra
	 * @return Devuelve el precio de compra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * Para leer el precio de venta
	 * @return Devuelve el precio de venta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * Para leer el stock
	 * @return Devuelve el stock
	 */
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * Para leer el codigo
	 * @return Devuelve el codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	
	
	

}
