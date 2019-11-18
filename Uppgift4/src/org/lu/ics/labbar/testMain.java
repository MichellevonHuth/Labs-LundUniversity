package org.lu.ics.labbar;
import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount(0);
	
	
		Scanner scanner0 = new Scanner(System.in); 
		System.out.println("Insättning eller uttag (0-insättning, 1-uttag): "); 
		int insättningOrUttag = scanner0.nextInt(); 
		
		Scanner scanner2 = new Scanner(System.in); 
		System.out.println("Ange belopp: "); 
		double amount = scanner2.nextDouble();  
		 
			
		if(insättningOrUttag == 0)
		{		
			acc1.credit(amount);
		}
		
		else if(insättningOrUttag == 1)
		{
			acc1.withdraw(amount);
		}
		
		
		System.out.println("Saldo: " + acc1.getBalance()); 
		
		
		
		while(true)
		{
			System.out.println();
			
			Scanner scanner3 = new Scanner(System.in); 
			System.out.println("Vill du avsluta? "); 
			String avsluta = scanner3.nextLine(); 
			
			if(avsluta.equals("N"))
			{
				Scanner scanner4 = new Scanner(System.in); 
				System.out.println("Insättning eller uttag (0-insättning, 1-uttag): "); 
				insättningOrUttag = scanner4.nextInt(); 
				
				Scanner scanner5 = new Scanner(System.in); 
				System.out.println("Ange belopp: "); 
				amount = scanner5.nextDouble();  
				 
					
				if(insättningOrUttag == 0)
				{		
					acc1.credit(amount);
				}
				
				else if(insättningOrUttag == 1)
				{
					acc1.withdraw(amount);
				}
				
				
				System.out.println("Saldo: " + acc1.getBalance()); 
				
			}
			
			else if(avsluta.equals("J"))
			{
				System.out.println("Saldo: " + acc1.getBalance()); 
				break; 
			}			
		}
	}	
}