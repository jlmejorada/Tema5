package ejercicio14;

import java.util.Scanner;

public class Banco {

	static CuentaCorriente[] usuario = new CuentaCorriente[30];

	static public void muestra(String dni) {
		int posicion;
		posicion = buscaUsuario(dni);
		if (posicion != -1) {
			System.out.println(usuario[posicion]);
		}
	}

	static public boolean ingresa(String dni, double dinero) {
		boolean anade = false;
		int posicion;
		posicion = buscaUsuario(dni);
		double total=usuario[posicion].getSaldo() + dinero;
		if (posicion != -1) {
			usuario[posicion].setSaldo(total);
			anade=true;
		}

		return anade;
	}
	
	static public boolean retira(String dni, double dinero) {
		boolean resta = false;
		int posicion;
		posicion = buscaUsuario(dni);
		double total=usuario[posicion].getSaldo() - dinero;
		if (posicion != -1) {
			usuario[posicion].setSaldo(total);
			resta=true;
		}

		return resta;
	}

	static public boolean agregaUsuario(CuentaCorriente contacto) {
		boolean agrega = false;
		int posicion;
		int contador = 0;
		posicion = buscaUsuario(contacto.getDni());
		if (posicion == -1) {
			while (contador < usuario.length && usuario[contador] != null) {
				contador++;
			}
			usuario[contador]=contacto;
			agrega=true;
		}

		return agrega;
	}

	static public int buscaUsuario(String dni) {
		int posicion = -1;
		int contador = 0;
		while (contador < usuario.length && posicion == -1) {
			if (usuario[contador] != null && usuario[contador].getDni().equals(dni)) {
				posicion = contador;
			}
			contador++;
		}
		return posicion;
	}
	
	/**
	public static int buscaObjeto(CuentaCorriente contacto) {
		int pos = -1;
		int cont=0;
		while(cont<usuario.length && pos==-1) {
			if (usuario[cont]!=null && usuario[cont].equals(contacto)) {
				pos=cont;
			}
			
			cont++;
		}
		return pos;
	}
	**/
	
	
}
