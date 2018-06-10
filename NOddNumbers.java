package org.inetsolv;

//THIS IS THE PROGRAM FOR FINDING  ALL BELOW ODD NUMBER FOR ENTERED NUMBER...

import java.util.Scanner;

public class NOddNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER TO FIND ODD NUMBERS BELOW THE ENTERED NUMBER :");
		int number = scanner.nextInt();
		
		System.out.println("ALL ODD NUMBERS :");
		for(int i=0;i<=number;i++) {
			if(i%2==1) {
				System.out.print(i+",");
			}
		}
	}
}

/*
 * OUTPUT
 * 
 * ENTER THE NUMBER TO FIND ODD NUMBERS BELOW THE ENTERED NUMBER :20
 * ALL ODD NUMBERS :1,3,5,7,9,11,13,15,17,19,
 */
