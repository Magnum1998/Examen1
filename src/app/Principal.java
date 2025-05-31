package app;
import clases.Punto;
import clases.Segmento;
public class Principal {

	public static void main(String[] args) {
		Punto p1 = new Punto ((int) (Math.random() * 11),(int) (Math.random() * 11));
		Punto p2 = new Punto ((int) (Math.random() * 11),(int) (Math.random() * 11));
		Punto p3 = new Punto ((int) (Math.random() * 11),(int) (Math.random() * 11));
		Punto p4 = new Punto ((int) (Math.random() * 11),(int) (Math.random() * 11));
		Segmento s1 = new Segmento(p1,p2);
		Segmento s2 = new Segmento(p3,p4);
		s1.distancia();
		s2.distancia();
		
	}

}

