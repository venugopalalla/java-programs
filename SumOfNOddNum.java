package org.inetsolv;

//THIS IS THE PROGRAM FOR FINDING SUM OF ALL BELOW ODD NUMBER FOR ENTERED NUMBER...

import java.util.Scanner;

public class SumOfNOddNum {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER TO SUM ALL ODD NUMBERS BELOW THE ENTERED NUMBER :");
		int number = scanner.nextInt();
		
		int sum=0;
		for(int i=0;i<=number;i++) {
			if(i%2==1) {
				sum=sum+i;
			}
		}
		System.out.println("SUM OF ALL ODD NUMBERS :"+sum);
	}
}

/*
 * OUTPUT
 * 
 * ENTER THE NUMBER TO SUM ALL ODD NUMBERS BELOW THE ENTERED NUMBER :5
 * SUM OF ALL ODD NUMBERS :9
 */
