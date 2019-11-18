package org.lu.ics.labbar;

import java.util.Scanner;

public class BankAccount {
	
	private String number; 
	private double balance; //this is how much money you have on your account 
	private double amount; //this is what the user wants to add the balance 
	
	public BankAccount(double initialBalance)
	{
		balance = initialBalance; 
		
	}
	
	public BankAccount()
	{
		number = "";
		amount = 0; 
		
	}
	
	public void credit(double amount) //ökar värdet på instansvariabeln balance
	{
		balance = balance + amount;
		
	}
	
	public void withdraw(double amount) //minskarvärdet på instansvariabeln balance 
	{
		balance = balance - amount;
	}
	

	public void setBalance(double inBalance)
	{
		balance = inBalance; 
		
	}
	
	public double getBalance()
	{
	    return balance;
	}
	

}
