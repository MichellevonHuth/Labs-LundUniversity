package org.lu.ics.labbar;

import java.util.Scanner;

public class Uppgift2b {

	public static void main(String[] args) 
	{
		
			while(true)
			{
				Scanner scanner1 = new Scanner(System.in); 
				System.out.println("Skriv in det första talet:"); 
				int tal1 = scanner1.nextInt(); 
				
				//get input from user and store in variable 'tal1' 
				

				if(tal1 == 0)
				{
					System.out.println("Tackar."); 
					break;
				}
				
				//if the first input is 0 the while loop will break and print "Tackar".
				//if the first input is not 0 the while loop will continue to ask questions
				
				Scanner scanner2 = new Scanner(System.in); 
				System.out.println("Skriv in det andra talet:"); 
				int tal2 = scanner2.nextInt(); 
				
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
				
				
				
				System.out.println(); 
				
				//make a space line 

								
			}
			
			
		}
		

	}






















