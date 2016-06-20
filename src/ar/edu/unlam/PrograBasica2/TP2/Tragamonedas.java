package ar.edu.unlam.PrograBasica2.TP2;

public class Tragamonedas {
	
	protected Tambor Tambor1;
	protected Tambor Tambor2;
	protected Tambor Tambor3;
	
	FixNumberGenerator generator = new FixNumberGenerator(1);
	
	public Tragamonedas(){
	/* post: los 3 Tambores del Tragamonedas están 
	* en la posición 1.*/ 
		
		Tambor1 = new Tambor(generator);
		Tambor2 = new Tambor(generator);
		Tambor3 = new Tambor(generator);	
	}
	
	public void activar(){
	/* post: activa el Tragamonedas haciendo girar 
	* sus 3 Tambores. */
		
		Tambor1.girar();
		Tambor2.girar();
		Tambor3.girar();
		
	}

	public Boolean entregaPremio(){
	/* post: indica si el Tragamonedas entrega un premio 
	* a partir de la posición de sus 3 Tambores. */
		
		if(Tambor1.getPosicion() == Tambor2.getPosicion()
		   && Tambor3.getPosicion() == Tambor1.getPosicion()){
			
			return true;
			
		} else {
			
			return false;
		}
		
	}
}
