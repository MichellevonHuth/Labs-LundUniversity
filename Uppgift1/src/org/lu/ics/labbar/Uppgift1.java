package org.lu.ics.labbar;
import java.util.Scanner; 

public class Uppgift1 {

	public static void main(String[] args) {
		
		
		Scanner scanner1 = new Scanner(System.in); 
		System.out.println("Skriv ett ord"); 
		String ord1 = scanner1.nextLine(); 
		
		//get input from user and store in variable 'ord1' 
		
		Scanner scanner2 = new Scanner(System.in); 
		System.out.println("Skriv ett annat ord"); 
		String ord2 = scanner2.nextLine(); 
		
		//get second input from user and store in variable 'ord2' 
		
		String totalLength = ord1 + ord2; 
		
		//add a string of both inputs and store in variable 'totalLength'
		
		int length = totalLength.length(); 
		
		//use method .length() to count the amount of characters in variable 'totalLength' and store in an int variable
		

		System.out.println(ord1 + " " + ord2); 
		System.out.println(length + 1); 
		
		scanner1.close(); 
		scanner2.close(); 
			
	
	}

}
