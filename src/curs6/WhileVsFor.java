package curs6;
/*
 * facem un program care printeaza nr pare de la 0 la 20 inclusiv
 * 
 */

public class WhileVsFor {

	public static void main(String[] args) {
		rezolvareCuFor();
		rezolvareCuWhile();
	}

	public static void rezolvareCuFor() {
		System.out.println("For:");

		for(int i=2; i <=20; i=i+2) {
			
			System.out.println(i);
		}
	}
	
	public static void rezolvareCuWhile() {
		System.out.println("While:");
		int i = 2;
		
		while(i<=20) {
			
			System.out.println(i);
			i=i+2;
		}
	}
	
}
