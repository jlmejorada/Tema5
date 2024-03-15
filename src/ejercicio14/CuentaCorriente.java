package ejercicio14;

public class CuentaCorriente {
	private String dni = "";
	private String nombre = "";
	private double saldo;

	public CuentaCorriente(String dni, double saldo) {
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	public CuentaCorriente(String dni, String nombre, double saldo) {
		this(dni, saldo);
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @return
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		String cadena = "";

		cadena += "------------------------------\n";
		cadena += "Titular: " + this.nombre + "\n";
		cadena += "DNI: " + this.dni + "\n";
		cadena += "Saldo: " + this.saldo + "\n";
		cadena += "------------------------------";

		return cadena;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean esIgual=false;
		CuentaCorriente cc = (CuentaCorriente) obj;
		if (this.dni.equals(cc.dni)){
			esIgual=true;
		}
		return esIgual;
	}
	

}
