package clases;
/**
 * Clase que representa un punto en eje x e y.
 */
public class Punto {
	private int x;
	private int y;
	
	public Punto() {
		super();
		this.x = 0;
		this.y = 0;
	}
	/**
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	/**
	 * @return eje x del punto
	 */
	public int getX() {
		return x;
	}
	/**
	 * Establece el valor de x
	 * @param al eje x del punto
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return eje y del punto
	 */
	public int getY() {
		return y;
	}
	/**
	 * Establece el valor de y
	 * @param al eje y del punto
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * Devuelve una representación textual del punto.
	 * @return Cadena con los valores del punto
	 */
	@Override
	public String toString() {
		String mensaje="("+this.x+","+this.y+")";
		return mensaje;
	}
}
