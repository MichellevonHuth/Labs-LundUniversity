package org.lu.ics.labbar;
import java.util.Scanner; 

public class Uppgift1 {

	public static void main(String[] args) {
		
		
		Scanner scanner1 = new Scanner(System.in); 
		System.out.println("Skriv ett ord"); 
		String ord1 = scanner1.nextLine(); 
		
		Scanner scanner2 = new Scanner(System.in); 
		System.out.println("Skriv ett annat ord"); 
		String ord2 = scanner2.nextLine(); 
		
		String totalLength = ord1 + ord2; 
		int length = totalLength.length(); 
		

		System.out.println(ord1 + " " + ord2); 
		System.out.println(length + 1); 
		
		scanner1.close(); 
		scanner2.close(); 
			
	
	}

}
