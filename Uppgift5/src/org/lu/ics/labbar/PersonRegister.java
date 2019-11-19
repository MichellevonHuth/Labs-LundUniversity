package org.lu.ics.labbar;

import java.util.ArrayList;

public class PersonRegister {
	
	private ArrayList <Person> personList; 
	
	
	public PersonRegister()
	{
		personList = new ArrayList<Person>(); 
	}
	
	
	public ArrayList<Person> getpersonList()
	{
		return personList; 
	}
	
	
	public void setpersonList(ArrayList<Person> newpersonList)
	{
		personList = newpersonList; 
	}
	
	
	public void addPerson(Person p)
	{
		personList.add(p); 
	}
	
	public Person findPerson(String pNbr)
	{
		Person foundPerson = null;
		
		for (Person p : personList){
		    
			if (personList.contains(pNbr))
		    
		    {
				foundPerson = p; 

		    }

		}
		
		return foundPerson; 
	}
	

	public Person removePerson(String pNbr)
	{
		
		Person removedPerson = null;
		
		for (Person p : personList){
			
			if (personList.contains(pNbr)){
				removedPerson = p;
				
				this.getpersonList().remove(removedPerson); 
			}	
		}
		
		return removedPerson; 
		
	}


}
