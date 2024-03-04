package curs1;

//comentariu pe o singura linie

/*
 * Multi line comment
 * comenatriu pe mai multe linii
 */

// Clasele le denumim folosind conventia UpperCamelCase --> ExempluClasa
// metode si variabile folosind lowerCamelCase --> exempluVariabila


public class FirstClass {

	public static void main(String[] args) {

		System.out.println("Test");
			
		FirstClass obiect = new FirstClass();
		obiect.greetings();
		
	}
	
	public void greetings() {
		
		System.out.println("Salut");
		
	}
	
	

}

