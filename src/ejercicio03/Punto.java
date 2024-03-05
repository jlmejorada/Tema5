package ejercicio03;

/**
 * representará un punto de dos dimensiones en un plano. Solo contendrá dos
 * atributos enteros llamadas x e y (coordenadas).
 * 
 * @author jlmejorada
 */
public class Punto {

	/**
	 * Atributo privado para almacenar la coordenada y
	 */
	private int y = 0;

	/**
	 * Atributo privado para almacenar la coordenada x
	 */
	private int x = 0;

	/**
	 * Un constructor con parámetros que copie las coordenadas pasadas como
	 * argumento a los atributos del objeto.
	 * 

	 */
	public Punto(int y, int x) {
		this.y = y;
		this.x = x;
	}

	/**
	 * Imprime por pantalla las coordenadas.
	 */
	public void imprime() {
		// Imprimimos por pantalla
		System.out.println("(" + x + ", " + y + ")");
	}
	
	/**
	 * Modifica ambas coordenadas.
	 * 
	 * @param y coordenada y a cambiar
	 * @param x coordenada x a cambiar
	 */
	public void setXY(int x, int y) {
		//Cambiamos la x
		this.x=x;
		//Cambiamos la y
		this.y=y;
	}
	
	/**
	 * Desplaza el punto la cantidad (dx,dy) indicada.
	 * @param dx Distancia a desplazar x
	 * @param dy Distancia a desplazar y
	 */
	public void desplaza(int dx, int dy) {
		//Le sumamos a x la distancia a moverse
		this.x+=dx;
		//Le sumamos a y la distancia a moverse
		this.y+=dy;
	}
	
	public double distancia(Punto p) {
		//Creamos una variable que guardara la distancia
        double distancia;
        //Calculamos la distancias entre dos puntos cardinales
        distancia = Math.sqrt(Math.pow(p.x - this.x, 2))+ (Math.pow((p.y - this.y), 2));
        //Devolvemos la distancia
        return distancia;
    }

}
