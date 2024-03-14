package ejercicio14;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean salida=false;
		String respuesta="";
		double dinero=0;
		int opc1 = 0;
		int opc2 = 0;
		String dni;
		do {
			System.out.println("¿Eres un usuario con cuenta?");
			System.out.println("1.Si");
			System.out.println("2.No");
			System.out.println("3.Salir");
			opc1 = sc.nextInt();
			sc.nextLine();
			switch (opc1) {
			case 1 -> {
				System.out.println("Introduzca su DNI");
				dni=sc.nextLine();
				do {
					menu();
					opc2=sc.nextInt();
					sc.nextLine();
					switch (opc2) {
					case 1 -> {
						Banco.muestra(dni);;
					}
					case 2 -> {
						System.out.println("Cuanto quieres ingresar");
						dinero=sc.nextInt();
						sc.nextLine();
						Banco.ingresa(dni, dinero);
						if (salida) {
							respuesta="Se ha agregado el dinero";
						} else {
							respuesta="No se ha podido agregar el dinero";
						}
						System.out.println(respuesta);
					}
					case 3 -> {
						System.out.println("Cuanto quieres retirar");
						dinero=sc.nextInt();
						sc.nextLine();
						Banco.retira(dni, dinero);
						if (salida) {
							respuesta="Se ha retirado el dinero";
						} else {
							respuesta="No se ha podido retirar el dinero";
						}
						System.out.println(respuesta);
					}
					case 4 -> {
						System.out.println("Saliendo...");
					}
					}
					
					
				}while (opc2!=4);
				
			}
			case 2 -> {
				CuentaCorriente usuario=recogeDatos();
				salida=Banco.agregaUsuario(usuario);
				if (salida) {
					respuesta="La cuenta ha sido agregada";
				} else {
					respuesta="DNI usado en otra cuenta";
				}
			}
			case 3 -> {
				System.out.println("Saliendo...");
			}
			}
		} while (opc1 != 3);

		sc.close();
	}

	public static void menu() {

		System.out.println("¿Qué quiere hacer?");
		System.out.println();
		System.out.println("1.Mostrar información");
		System.out.println("2.Ingresar dinero");
		System.out.println("3.Sacar dinero");
		System.out.println("3.Salir");
		System.out.println();

	}

	public static CuentaCorriente recogeDatos() {
		String nombre = "";
		double dinero = 0;
		String dni = "";
		CuentaCorriente cliente;
		System.out.println("Introduzca su DNI");
		dni = sc.nextLine();
		System.out.println("Introduzca su NOMBRE");
		nombre = sc.nextLine();
		cliente = new CuentaCorriente(dni, nombre, dinero);
		return cliente;
	}
}
