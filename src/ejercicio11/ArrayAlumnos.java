package ejercicio11;

public class ArrayAlumnos {

	static Alumno[] alumnos = new Alumno[30];

	static void imprimeAl() {
		for (Alumno alumno : alumnos) {
			if (alumno != null) {
				System.out.println(alumno);
			}
		}
	}

	static boolean nuevoAl(Alumno alumn) {
		boolean add = false;
		int cont = 0;
		int busca = buscaAl(alumn);
		if (busca == -1) {
			while (cont < alumnos.length && alumnos[cont] != null) {
				cont++;
			}
			if (cont < alumnos.length) {
				alumnos[cont] = alumn;
				add = true;
			}
		}
		return add;
	}
	
	static boolean modificaAl(Alumno alumn) {
		boolean mod = false;
		int busca = buscaAl(alumn);
		if (busca != -1) {
			alumnos[busca] = alumn;
			mod = true;
		}
		return mod;
	}
	
	static boolean borraAl(Alumno alumn) {
		boolean borr = false;
		int busca = buscaAl(alumn);
		if (busca != -1) {
			alumnos[busca] = null;
			borr = true;
		}
		return borr;
	}
	

	static private int buscaAl(Alumno alumn) {
		int pos = -1;
		int cont = 0;
		while (cont < alumnos.length && pos == -1) {
			if (alumnos[cont] != null && alumnos[cont].equals(alumn)) {
				pos = cont;
			}

			cont++;
		}

		return pos;
	}

}
