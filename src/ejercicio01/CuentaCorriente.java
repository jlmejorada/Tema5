package ejercicio01;

/**
 * Una clase para definir la cuenta corriente de un cliente
 * 
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
	 * 
	 * @param dni   Variable String
	 * @param saldo Varible double
	 */
	CuentaCorriente(String dni, Double saldo) {
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		this.saldo = saldo;
	}

	/**
	 * Constructor con parametros Con el DNI del cliente, nombre y el saldo inicial.
	 * 
	 * @param dni    Variable String
	 * @param nombre Variable String
	 * @param saldo  Variable double
	 */
	CuentaCorriente(String dni, String nombre, Double saldo) {
		// Si no es nulo o cadena vacia
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
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
	boolean operacionRetirada(double retirada) {
		// Variable que recoge si la operación se ha realizado con exito
		boolean operacionEfectuada = false;
		// Si el saldo es superior o igual a lo que se intenta sacar
		if (this.saldo >= retirada) {
			// Marcamos la operación como true
			operacionEfectuada = true;
			// Y lo retiramos del saldo
			this.saldo -= retirada;
		}
		// Devolvemos si se ha realizado la operación
		return operacionEfectuada;
	}

	/**
	 * se incrementa el saldo.
	 * 
	 * @param ingreso Dinero que se desea ingresar
	 */
	void operacionIgreso(double ingreso) {
		// Añadimos el dinero al saldo
		this.saldo += ingreso;
	}

	/**
	 * muestra la información disponible de la cuenta corriente.
	 * 
	 */
	void consulta() {
		System.out.println("Nombre del titular: " + nombre);
		System.out.println("Dni del titular: " + dni);
		System.out.println("Saldo de la cuenta: " + saldo);
	}

}
