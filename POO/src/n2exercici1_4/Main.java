package n2exercici1_4;

public class Main {

	public static void ride(Cycle c) {
		System.out.println(c.wheels());
	}

	public static void main(String[] args) {
		Cycle cy[] = new Cycle[3];

		Bicycle bi = new Bicycle();
		Unicycle uni = new Unicycle();
		Tricycle tri = new Tricycle();

		cy[0] = uni;
		cy[1] = bi;
		cy[2] = tri;

		for (Cycle ciclo : cy) {
			if (ciclo instanceof Unicycle)
				((Unicycle) ciclo).Balance();
			else if (ciclo instanceof Bicycle)
				((Bicycle) ciclo).Balance();
			else if (ciclo instanceof Tricycle)
				((Tricycle) ciclo).Balance();
		}

	}

}
