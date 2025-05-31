package clases;

public class Segmento {
	Punto a;
	Punto b;
	 /**
     * Constructor por defecto.
     * Crea un segmento entre los puntos (0,0) y (1,1).
     */
	public Segmento() {
		this.a= new Punto (0,0);
		this.b= new Punto (1,1);
	}

    /**
     * Constructor que recibe dos puntos.
     * @param a Punto inicial del segmento
     * @param b Punto final del segmento
     * @throws IllegalArgumentException si los dos puntos son iguales
     */
	public Segmento (Punto a, Punto b) {
		if(a.getX()==b.getX()&& a.getY()==b.getY()){
			throw new IllegalArgumentException("Los puntos no pueden ser iguales.");
		}
		this.a=a;
		this.b=b;
	}
	/**
	 * Calcula y devuelve la distancia entre los puntos del segmento.
	 * @return Distancia entre el punto a y el punto b
	 */
	public double distancia() {
		int x1=this.a.getX();
		int y1=this.a.getY();
		int x2=this.b.getX();
		int y2=this.b.getY();
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
    /**
     * @return Punto inicial del segmento
     */
	public Punto getA() {
		return a;
	}
    /**
     * @param a Establece el punto inicial del segmento
     */
	public void setA(Punto a) {
		this.a = a;
	}
    /**
     * @return Punto final del segmento
     */
	public Punto getB() {
		return b;
	}
    /**
     * @param b Establece el punto final del segmento
     */
	public void setB(Punto b) {
		this.b = b;
	}
	  /**
     * Devuelve una representación textual del segmento.
     * @return Cadena con los puntos del segmento
     */
    @Override
    public String toString() {
        return "[" + a + "," + b + "]";
    }
	
}
