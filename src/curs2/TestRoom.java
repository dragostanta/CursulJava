package curs2;

public class TestRoom {

	public static void main(String[] args) {

		Room baie = new Room(4, 2);
		System.out.println("Perimetru baie este: " + baie.calculPerimetru());
		System.out.println("Arie baie este: " + baie.calculArie());
		
		
		Room dormitor = new Room(8, 6);
		System.out.println("Perimetru baie este: " + dormitor.calculPerimetru());
		System.out.println("Arie baie este: " + dormitor.calculArie());

		
		Room dormitor2 = new Room(8, 6, "negru");

		
		System.out.println(123);//int
		
		System.out.println("123");//String
		
		System.out.println('c');//character


		
	}

}
