package curs9;
/*
 * Method override - suprascrierea metodei
 * - implica relatia de mostenire pentru ca 
 * suprascrierea se face in clasa copil (subclasa), si presupune
 * scrierea identica a metodei din clasa parinte (super clasa)
 * DAR cu o alta implementare
 * - este best practice ca metoda suprascrisa sa aiba
 * adnotarea @Override
 * 
 */
public class TestWildAnimal {

	public static void main(String[] args) {

		Lion simba = new Lion();
		simba.makeSound();//metoda suprascrisa
		simba.whereDoesItLives();
		simba.eatMeat();
		
		System.out.println("------------------------------");
		
		Deer bambi =  new Deer();
		bambi.makeSound();// method override 
	//	bambi.makesSound();
		bambi.whereDoesItLives();
		bambi.eatGrass();
		
		
		
	}

}
