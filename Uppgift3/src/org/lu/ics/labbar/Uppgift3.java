package org.lu.ics.labbar;
import java.util.Scanner; 

public class Uppgift3 {

	public static void main(String[] args) 
	{

			  System.out.println("Please enter length of the array?");

			  Scanner scnr = new Scanner(System.in);
			  int length = scnr.nextInt();
			  int[] input = new int[length];
			  
			  
			  //store the input from the user in the variable length
			  //create an array named input, the length of the array is the number the user entered
			  

			  System.out.println("Please enter 5 numbers ");
			  

			  for (int i = 0; i < input.length; i++) 
			  {
				  input[i] = scnr.nextInt();
			  }
			  
			  
			  //use a loop to insert the inputs from user in each position in the array
			  

			  float average = average(input);
			  int sum = sumOfInput(input);
			  int biggestNumber = findBiggestNumber(input); 

			  //call on methods which calculates the average, total sum and the biggest number in the array
			  //the number returned from the methods is stored in the variables above 
			  

			  System.out.println("Average of all numbers in the array is " + average);
			  System.out.println("Total sum of all numbers in the array is " + sum);
			  System.out.println("The largest number of all numbers in the array is " + biggestNumber);
			  scnr.close();
			  
	}

		
	
			  public static float average(int[] input) 	//a method which calculates the average number
			  {
				  
				  float sum = 0f;
				  
				  for (int number : input) 
				  {
					  sum = sum + number;
				  }
				  
				  return sum / input.length;
			  }
			  
			  public static int sumOfInput(int[] input) //a method which calculates the sum of all numbers
				{
					int sum = 0; 
					
					for (int number : input)
					{
						sum = sum + number;
					}
					
					return sum;
					
				}
			  
			  public static int findBiggestNumber(int[] input) //a method which finds the biggest number in the array
			  {
				  int max = input[0];
				  
				  for(int i = 1; i < input.length;i++)
					{
						if(input[i] > max)
						{
							max = input[i];
						}
					}
				  
				  return max; 
				  
			  }
			  		  
}

	
	
	

	

