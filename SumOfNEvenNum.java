package org.inetsolv;

//THIS IS THE PROGRAM FOR FINDING SUM OF ALL BELOW EVEN NUMBER FOR ENTERED NUMBER...

import java.util.Scanner;

public class SumOfNEvenNum {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER TO SUM ALL EVEN NUMBERS BELOW THE ENTERED NUMBER :");
		int number = scanner.nextInt();
		
		int sum=0;
		for(int i=0;i<=number;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("SUM OF ALL EVEN NUMBERS :"+sum);
	}
}

/*
 * OUTPUT
 * 
 * ENTER THE NUMBER TO SUM ALL EVEN NUMBERS BELOW THE ENTERED NUMBER :5
 *SUM OF ALL EVEN NUMBERS :6
 */
