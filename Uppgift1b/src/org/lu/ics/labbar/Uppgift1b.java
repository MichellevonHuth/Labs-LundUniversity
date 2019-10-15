package org.lu.ics.labbar;
import java.util.Scanner; 

public class Uppgift1b {

	public static void main(String[] args) 
	{
		Scanner scanner1 = new Scanner(System.in); 
		System.out.println("Ange ditt namn:"); 
		String name = scanner1.nextLine(); 
		
		Scanner scanner2 = new Scanner(System.in); 
		System.out.println("Ange din timlön:"); 
		double timlön = Double.parseDouble(scanner2.nextLine()); 
				
		Scanner scanner3 = new Scanner(System.in); 
		System.out.println("Ange antalet arbetade timmar:"); 
		double timmar = Double.parseDouble(scanner2.nextLine()); 
		
		
		double totalLön = timlön * timmar; 
		
		System.out.println(name.toUpperCase() + " du tjänade " + String.format("%.2f", totalLön) + " kr förra veckan."); 
			
		scanner1.close(); 
		scanner2.close(); 
		scanner3.close(); 
	}

}
