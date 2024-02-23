package ejercicio01;

/**
 * Una clase para definir la cuenta corriente de un cliente
 * @author jlmejorada
 */
public class CuentaCorriente {

	/**
	 * Atributo que almacena el DNI
	 */
	String dni;
	/**
	 * Atributo que almacena el nombre
	 */
	String nombre;
	/**
	 * Atributo que almacena el saldo
	 */
	Double saldo;

	/**
	 * Constructor con parametros DNI del titular de la cuenta y un saldo inicial.
	 * @param dni Variable String
	 * @param saldo Varible double
	 */
	public CuentaCorriente(String dni, Double saldo) {
		this.dni = dni;
		this.saldo = saldo;
	}

	/**
	 * Constructor con parametros Con el DNI del cliente, nombre y el saldo inicial.
	 * @param dni Variable String
	 * @param nombre Variable String
	 * @param saldo Variable double
	 */
	public CuentaCorriente(String dni, String nombre, Double saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	/**
	 * El método debe indicar si ha sido posible llevar a cabo la operación, si
	 * existe saldo suficiente. Si es posible llevar a cabo la operación se resta la
	 * cantidad a sacar al saldo de la cuenta.
	 * 
	 * @param saldo Variable que tiene el saldo inicial de la cuenta del 
	 * @return true si se realiza la operación y false si no
	 */
	public boolean operacionRetirada(double retirada) {
		//Variable que recoge si la operación se ha realizado con exito
		boolean operacionEfectuada=false;
		
		//Devolvemos si se ha realizado la operación
		return operacionEfectuada;
	}

}
