package ar.edu.unlam.PrograBasica2.TP2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TragamonedasTest {


	@Test
	public void PosicionDeTamboresEntre1y10() {
		
		RandomNumberGenerator posicion = new RandomNumberGenerator();
		int esperado = posicion.generate();
		assertTrue(esperado >= 1 && esperado <= 10);
	}
	
	@Test
	public void comprobarQueLosTamboresEstenEnUnoAntesDeActivar(){
		
		Tragamonedas tragamonedas = new Tragamonedas();
		
		Integer esperado = 1;
		
		assertEquals(esperado, tragamonedas.Tambor1.getPosicion(), 0.01);
		assertEquals(tragamonedas.Tambor1.getPosicion(), tragamonedas.Tambor2.getPosicion() , 0.01);
		assertEquals(tragamonedas.Tambor1.getPosicion(), tragamonedas.Tambor3.getPosicion() , 0.01);
	}			


	@Test
	public void crearYComprobarElFuncionamientoDelTragamonedas() {
		
		Tragamonedas tragamonedas = new Tragamonedas();
		
		tragamonedas.activar();
		
		System.out.println(tragamonedas.Tambor1.getPosicion() + " | " + tragamonedas.Tambor2.getPosicion() + " | " + tragamonedas.Tambor3.getPosicion());
		
		if(tragamonedas.entregaPremio() == true){
			System.out.println("Felicidades,ganaste el premio!!.");
		} else {
			
			System.out.println("Que lastima! Mejor suerte la próxima.");
			
		}
		assertEquals(tragamonedas.Tambor1.getPosicion(),tragamonedas.Tambor2.getPosicion(), 0.01);
		assertEquals(tragamonedas.Tambor2.getPosicion(), tragamonedas.Tambor3.getPosicion() , 0.01);
	
	
	}
	
}