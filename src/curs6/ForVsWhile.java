package curs6;

import java.util.Scanner;

/*
 * facem un program care ii cere userului numere incontinuu
 * numerele le inmulteste cu 10 si printeaza rezultatul
 * daca userul introduce 0 facem exit din program
 * 
 */
public class ForVsWhile {

	public static void main(String[] args) {
		//rezolvareCuFor();
		rezolvareCuWhile();
	}

	public static void rezolvareCuFor() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("introdu numar : ");
		int numar =  scan.nextInt();
		int result;
		
		for(;numar != 0;) {
			result = numar * 10;
			System.out.println("Result : " + result);
			System.out.println("introdu numar : ");
			numar =  scan.nextInt();
		}
		
		/*
		 * while(conditie boolean){
		 * }
		 * 
		 */
		
		
		//System.out.println();
		
	}
	
	public static void rezolvareCuWhile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("introdu numar : ");
		int numar =  scan.nextInt();
		int result;
		
		while(numar != 0) {
			result = numar * 10;
			System.out.println("Result : " + result);
			System.out.println("introdu numar : ");
			numar =  scan.nextInt();
		}
	}
	
	
}
