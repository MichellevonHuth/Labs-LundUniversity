package org.lu.ics.labbar;

import java.util.Scanner;

public class Uppgift2a {

	public static void main(String[] args) 
	{
		Scanner scanner1 = new Scanner(System.in); 
		System.out.println("Skriv in det första talet:"); 
		int tal1 = Integer.parseInt(scanner1.nextLine()); 
		
		//get input from user and store in variable 'tal1' 
		
		Scanner scanner2 = new Scanner(System.in); 
		System.out.println("Skriv in det andra talet:"); 
		int tal2 = Integer.parseInt(scanner2.nextLine()); 
		
		//get second input from user and store in variable 'tal2'
		
		if(tal1>tal2)
		{
			System.out.println(tal1 + " är större än " + tal2); 
		}
		else if(tal1<tal2)
		{
			System.out.println(tal2 + " är större än " + tal1); 
		}
		else
		{
			System.out.println("Talen är lika"); 
		}
		
		//take use of an if statement in order to see if one of the inputs are bigger or equal to the other input

	}

}
