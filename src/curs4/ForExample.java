package curs4;

public class ForExample {

	public static void main(String[] args) {

		// initializare, conditie, iterator
		for(int i=0; i < 10; i++) {
			
			System.out.println("Valoarea lui i este " + i);
		}
		System.out.println("------------------------------");
		
		for(int i = 0; i <10 ; i++) {
			
			if(i == 5) {
				//break;//intrerupe executia buclei
				continue;
			}
			System.out.println(i);
			
		}
		
	}

}
