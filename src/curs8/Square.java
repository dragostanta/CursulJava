package curs8;

public class Square extends Shape {
	
	String nume = "Cerc";
	String culoare = "Verde";
	
	public Square(String culoare, String nume) {
		super(culoare, nume);
	}
	
	public Square() {
		
	}
	
	
	public void printDetails() {
		
		System.out.println( "numele este : " + super.nume + " si culoarea este : " + super.culoare);
			
	}
	
	
	public void printNameLenght() {
		System.out.println( "Lungimea numelui este : " + nume.length());
	}

}
