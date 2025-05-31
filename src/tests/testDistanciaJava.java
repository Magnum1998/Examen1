package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import clases.Punto;
import clases.Segmento;
/**
 * Clase de pruebas para Segmento.
 * Se comprueban cálculos de la distancia con varios puntos positivos, negativos y una mezcla de ambos.
 */
public class testDistanciaJava {
    @Test
	public void CoordenadasPositivas() {
	Punto p1 = new Punto (2,3);
	Punto p2 = new Punto (6,7);
	Segmento s = new Segmento (p1,p2);
	double distanciaEsperada = Math.sqrt(32);
	 assertEquals(distanciaEsperada, s.distancia(), 0.001);
	}
    
    @Test
	public void CoordenadasNegativas() {
		Punto p1 = new Punto (-2,-3);
		Punto p2 = new Punto (-6,-7);
		Segmento s = new Segmento (p1,p2);
		double distanciaEsperada = Math.sqrt(32);
		 assertEquals(distanciaEsperada, s.distancia(), 0.001);
		}
    
    @Test
	public void CoordenadasPosYNeg() {
		Punto p1 = new Punto (2,3);
		Punto p2 = new Punto (-6,-7);
		Segmento s = new Segmento (p1,p2);
		double distanciaEsperada = Math.sqrt(164);
		 assertEquals(distanciaEsperada, s.distancia(), 0.001);
		}
    
    @Test
	public void CoordenadasIguales() {
		Punto p1 = new Punto (2,3);
		Punto p2 = new Punto (2,3);
		Segmento s = new Segmento (p1,p2);
		double distanciaEsperada = 0;
		 assertEquals(distanciaEsperada, s.distancia(), 0.001);
		}
}
