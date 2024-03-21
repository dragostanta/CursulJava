package curs6;
/*
 * scriem un program care calculeza TVA la o suma
 * TVA poate avea multiple valori
 * Vreau sa setez valoarea TVA pe obiect
 * vreau sa afisez numarul total de calcule ale TVA pe care le-am facut
 * 
 */
public class CalculatorTVA {

	private double tvaDouble;
	private static int nrTotalDeCalcule;
	
	public CalculatorTVA(int tva) {
		this.tvaDouble = tva/100.0;
	}
	
	public double adunaTVA(double suma) {
		nrTotalDeCalcule++;
		return suma * (1 + tvaDouble);
	}
	
	public static int getNrTotalDeCalcul() {
		return nrTotalDeCalcule;
	}
	
}
