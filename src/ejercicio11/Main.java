package ejercicio11;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc = 0;
		Alumno alum;
		String mensaje;
		boolean respuesta;

		do {
			pintaMenu();
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {
			case 1 -> {
				ArrayAlumnos.imprimeAl();
			}
			case 2 -> {
				alum = recogeDatos();
				respuesta = ArrayAlumnos.nuevoAl(alum);
				if (respuesta) {
					mensaje = "El alumno ha sido añadido";
				} else {
					mensaje = "Ese alumno ya existe";
				}
				System.out.println(mensaje);
			}
			case 3 -> {
				alum = recogeDatos();
				respuesta = ArrayAlumnos.modificaAl(alum);
				if (respuesta) {
					mensaje = "El alumno ha sido modificado";
				} else {
					mensaje = "El alumno a modificar no existe";
				}
				System.out.println(mensaje);
			}
			case 4 -> {
				alum = recogeDatos();
				respuesta = ArrayAlumnos.borraAl(alum);
				if (respuesta) {
					mensaje = "El alumno ha sido borrado";
				} else {
					mensaje = "El alumno a borrar no existe";
				}
				System.out.println(mensaje);
			}
			}

		} while (opc != 5);
		System.out.println("Saliendo...");

		sc.close();
	}

	public static void pintaMenu() {
		System.out.println("ALUMNOS/AS\r\n" + "===================\r\n" + "1. Listado.\r\n" + "2. Nuevo Alumno.\r\n"
				+ "3. Modificar.\r\n" + "4. Borrar.\r\n" + "5. Salir.\r\n");
		System.out.println("-------------------");
		;
	}

	public static Alumno recogeDatos() {
		String nombre = "";
		double notaMedia = 0;
		Alumno alumno;
		System.out.println("Dame el nombre del Alumno");
		nombre = sc.nextLine();
		System.out.println("Dame la nota media del Alumno");
		notaMedia = sc.nextDouble();
		sc.nextLine();
		alumno = new Alumno(nombre, notaMedia);
		return alumno;
	}

}
