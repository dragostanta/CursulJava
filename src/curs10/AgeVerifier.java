package curs10;

public class AgeVerifier {

	public void checkAgeLimit(int age) throws InvalidAgeException {
		
		if(age <18) {
			throw new InvalidAgeException("Invalid age to proceed");
		}
		
	}
	
	
}
