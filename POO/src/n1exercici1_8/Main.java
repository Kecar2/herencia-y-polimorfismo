package n1exercici1_8;

public class Main {
	
	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		v1.iniciar();
		v1.accelerar();
		Vehicle.parar();
		
		Animal a1 = new Animal();
		a1.correr();
		a1.correr(0);
		a1.correr(0, 0);
		
		Gat g1 = new Gat();
		g1.correr();
		g1.correr(4);
		g1.correr(0);
		g1.correr(0, 0);
		
		Frog ranita = new Frog();
		ranita.menjar();
		ranita.moure();
		ranita.respirar();
		ranita.saltar();
		
		Amphibian am = ranita;
		am.menjar();
		am.moure();
		am.respirar();
	}
}
