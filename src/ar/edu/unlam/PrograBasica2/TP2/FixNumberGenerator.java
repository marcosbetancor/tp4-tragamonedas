package ar.edu.unlam.PrograBasica2.TP2;

public class FixNumberGenerator implements NumberGenerator{
	
	private Integer valor;
	
	public FixNumberGenerator(Integer number){
	/* Este generador devolverá siempre number cuando se llame al método generate()*/ 
		
		valor = number;
	}
	
	@Override
	public Integer generate(){
	/* post: devuelve el número de posición en la que se 
	* encuentra el Tambor. Es un valor comprendido 
	* entre 1 y 10. */
		
		return valor;
	}

}
