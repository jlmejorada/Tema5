package ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable que guarda una opción
		int opc = 0;
		//Variable que recoge el articulo con el que se quiere trabajar
		int artic=0;
		// Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		// Creamos diferentes productos
		Articulo art1 = new Articulo("Movil", 150, 5);
		Articulo art2 = new Articulo("Tablet", 500, 5);
		Articulo art3 = new Articulo("Cascos", 30, 5);

		do {
			// Imprimimos el menu
			imprimeMenu();
			// Registramos la opcion
			opc = sc.nextInt();
			//Imprimimos los articulos
			art1.imprimirArt();
			art2.imprimirArt();
			art3.imprimirArt();
			System.out.println("¿Con que articulo quieres trabajar?");
			artic = sc.nextInt();
			switch (opc) {
			case 1 -> {
				switch (artic) {
				case 1 -> {
					
				}
				case 2 -> {

				}
				case 3 -> {

				}
				default ->{
					System.out.println("Articulo no disponible");
				}
				}
			}
			case 2 -> {

			}
			case 3 -> {
				System.out.println("Saliendo...");
			}
			default ->{
				System.out.println("No es una opción valida");
			}
			}
			// Se repite mientras la opción seleccionada no sea 4
		} while (opc != 4);

		// Cerramos el escaner
		sc.close();
	}

	/**
	 * Imprime nuestro menú con sus opciones
	 */
	public static void imprimeMenu() {
		System.out.println("----------------------");
		System.out.println("---------Menú---------");
		System.out.println("----------------------");
		System.out.println("1. Venta");
		System.out.println("2. Rellenar");
		System.out.println("3. Salir");
		System.out.println("----------------------");
		System.out.println("Seleccione una opción");
	}

}
