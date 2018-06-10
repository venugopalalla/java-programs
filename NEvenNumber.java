package org.inetsolv;

//THIS IS THE PROGRAM FOR FINDING  ALL BELOW EVEN NUMBER FOR ENTERED NUMBER...

import java.util.Scanner;

public class NEvenNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER TO FIND EVEN NUMBERS BELOW THE ENTERED NUMBER :");
		int number = scanner.nextInt();
		
		System.out.println("ALL EVEN NUMBERS :");
		for(int i=0;i<=number;i++) {
			if(i%2==0) {
				System.out.print(i+",");
			}
		}

	}

}
/*
 * OUTPUT
 * 
 * ENTER THE NUMBER TO FIND EVEN NUMBERS BELOW THE ENTERED NUMBER :20
 * ALL EVEN NUMBERS :0,2,4,6,8,10,12,14,16,18,20,
 */


