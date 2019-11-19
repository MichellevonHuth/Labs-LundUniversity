package org.lu.ics.labbar;

public class Account {
	
	private String nbr; 
	private double balance; //this is how much money you have on your account 
	private double amount; //this is what the user wants to add the balance 
	private Person owner; 
	
	public Account(double initialBalance)
	{
		balance = initialBalance; 
		
	}
	
	public Account()
	{
		nbr = "";
		amount = 0; 
		
	}
	
	public void credit(double amount) 
	{
		balance = balance + amount;
		
	}
	
	public void withdraw(double amount) 
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
	
	public void setNbr(String newNbr)
	{
		nbr = newNbr; 
		
	}
	
	public String getNbr()
	{
	    return nbr;
	}
	
	public void setOwner(Person newOwner)
	{
		owner = newOwner; 
		
	}
	
	public Person getOwner()
	{
	    return owner;
	}
	
	

}
