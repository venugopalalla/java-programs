package org.inetsolv;

import java.util.Scanner;

//THIS IS THE PROGRAM FOR FINDING ALL THE SUM OF BELOW PRIME NUMERS FOR ENTERED NUMBER...

public class SumOfNPrimeNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// HEAR READING THE VALUE FROM KEYBOARD...
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER FOR FINDING ALL THE SUM OF BELOW PRIME NUMERS FOR ENTERED NUMBER :");
		int number = scanner.nextInt();
		int sum=0;
		
		for(int i=2;i<=number;i++) {
			
			boolean value=true;
			
			for(int j=2;j<i;j++) {				
				if(i%j==0) {
					value=false;
					break;
				}				
			}	
			if(value)
			sum=sum+i;				
		}
		System.out.println("THE SUM OF ALL PRIME NUMBERS ARE :"+sum);
	}
}

/*
 * OUTPUT
 * 
 * ENTER THE NUMBER FOR FINDING THE BELOW PRIME NUMBERS :50
 * THE PRIME NUMBERS ARE :2,3,5,7,11,13,17,19,23,29,31,37,41,43,47 
 */
