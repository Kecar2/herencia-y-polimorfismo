package n1exercici1_8;

public class Main {
	
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		v1.iniciar();
		v1.accelerar();
		Vehicle.parar();
		
		Animal a1 = new Animal();
		a1.correr();
		
		Amphibian amp = new Amphibian();
		amp.moure();
		amp.menjar();
		amp.respirar();
		
		Frog rana = new Frog();
		rana.moure();
		rana.menjar();
		rana.respirar();
	}
}
