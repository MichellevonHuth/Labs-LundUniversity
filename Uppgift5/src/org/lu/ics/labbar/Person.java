package org.lu.ics.labbar;
import java.util.*; 

public class Person {

	private ArrayList <Account> hasAccounts; 
	private String name; 
	private String pNbr; 
	
	public Person()
	{
		this.setHasAccount(new ArrayList<Account>());
	}
	
	public String getName()
	{
		return name; 
	}
	
	public void setName(String newName)
	{
		name = newName; 
	}
	
	public ArrayList<Account> getHasAccount()
	{
		return hasAccounts; 
	}
	
	public void setHasAccount(ArrayList<Account> newHasAccounts)
	{
		hasAccounts = newHasAccounts; 
	}
	
	public void addAccount(Account aAccount)
	{
		this.getHasAccount().add(aAccount); 
	}

}
