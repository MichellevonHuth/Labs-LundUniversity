package org.lu.ics.labbar;
import java.util.Scanner; 

public class Uppgift1b {

	public static void main(String[] args) 
	{
		Scanner scanner1 = new Scanner(System.in); 
		System.out.println("Ange ditt namn:"); 
		String name = scanner1.nextLine(); 
		
		//get input from user and store in the String variable 'name'. 
		
		Scanner scanner2 = new Scanner(System.in); 
		System.out.println("Ange din timlön:"); 
		double timlön = Double.parseDouble(scanner2.nextLine()); 
		
		//get input from user and store in the double variable 'timlön'. 
				
		Scanner scanner3 = new Scanner(System.in); 
		System.out.println("Ange antalet arbetade timmar:"); 
		double timmar = Double.parseDouble(scanner2.nextLine()); 
		
		//get input from user and store in the double variable 'timmar'.
		
		double totalLön = timlön * timmar; 
		
		//calculate the total wage by multiplying timlön and timmar with each other. 
		//store the calculated result in the double variable 'totalLön'.
		
		System.out.println(name.toUpperCase() + " du tjänade " + String.format("%.2f", totalLön) + " kr förra veckan."); 
		
		//used method .toUpperCase() to make the letters capital.
		//used String.format("%.2f", totalLön) to display double in 2 decimal points
			
		scanner1.close(); 
		scanner2.close(); 
		scanner3.close(); 
	}

}
