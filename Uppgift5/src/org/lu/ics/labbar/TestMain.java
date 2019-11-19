package org.lu.ics.labbar;

public class TestMain {

	public static void main(String[] args) {
		
		
		Account a1 = new Account(); 
		a1.setNbr("1234567"); 
		
		Account a2 = new Account(); 
		a2.setNbr("8910111");
		
		Account a3 = new Account(); 
		a3.setNbr("1213141");
		
		Account a4 = new Account(); 
		a4.setNbr("1516171");
	
		
		Person p1 = new Person(); 
		p1.setName("Mr x");
		
		Person p2 = new Person(); 
		p2.setName("Mrs y");
		
		
		
		p1.addAccount(a1);
		a1.setOwner(p1);
		
		p1.addAccount(a2); 
		a2.setOwner(p1);
		
		p2.addAccount(a3);
		a3.setOwner(p2);
		
		p2.addAccount(a4); 
		a4.setOwner(p2);
		
		
		PersonRegister pr = new PersonRegister(); 
		pr.addPerson(p1);
		pr.addPerson(p2);
		
		
		
		System.out.println(p1.getName() + " har följande konton: ");
		System.out.println();
		
		for(Account a : p1.getHasAccount())
		{
			System.out.print(a.getNbr() + "-> "); 
			System.out.print(a.getOwner().getName());
			System.out.println();
		}
		
		System.out.println();
		
		
		System.out.println(p2.getName() + " har följande konton: ");
		System.out.println();
		
		for(Account a : p2.getHasAccount())
		{
			System.out.print(a.getNbr() + "-> "); 
			System.out.print(a.getOwner().getName());
			System.out.println();
		}
		

	}

}
