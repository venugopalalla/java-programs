package org.inetsolv;

/*
 * This Is Program For Finding The Given Number Is Prime Or Not...
 */
import java.util.Scanner;

public class PrimeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Hear Reading The Value From Keyboard...
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number For Finding Prime Or Not: ");
		int number = scanner.nextInt();
		
		boolean isPrime = true;
		
	    for(int i=2; i<number; i++) {
	    	
		   if(number%i==0){ 
		     isPrime = false;
		     break;
		   }
	    }
	    	    
		if(isPrime){
		  System.out.println(number+" is a Prime number");
		}
		else {
		  System.out.println(number+" is not a Prime number");
	    }  
	}
}
/*
 * output
 * Enter The Number For Finding Prime Or Not: 5
 * 5 is a Prime number
 * 
 * Enter The Number For Finding Prime Or Not: 10
 * 10 is not a Prime number
 */
