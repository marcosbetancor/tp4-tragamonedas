package ar.edu.unlam.PrograBasica2.TP2;

public class Tambor {
 
	private Integer posicion;
	
	public Tambor(NumberGenerator generator){
		
		posicion = generator.generate();
	}
	
	public Integer getPosicion(){
	/* post: devuelve el número de posición en la que se 
	* encuentra el Tambor. Es un valor comprendido 
	* entre 1 y 10. */
		
		return posicion;
		
	}
	
	public void girar(){
		
		RandomNumberGenerator numero = new RandomNumberGenerator();
		posicion = numero.generate();
		
	}
		
}
