package org.inetsolv;

// THIS IS THE PROGRAM FOR FINDING THE TABLES FOR ENTER NUMBER.....

import java.util.Scanner;

public class TableForEnterNum {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER TO FIND TABLE  :");
		int number = scanner.nextInt();
		System.out.println("ENTER THE NUMBER FOR UPTO WHICH NUMBER DO U WANT THE TABLE  :");
		int numberOne = scanner.nextInt();
		
		for(int i=1;i<=numberOne;i++) {
			 System.out.println(number+"*"+i+"="+(number*i));
		}
	}
}
/*
 * OUTPUT
 * 
ENTER THE NUMBER TO FIND TABLE  :9
ENTER THE NUMBER FOR UPTO WHICH NUMBER DO U WANT THE TABLE  :5
9*1=9
9*2=18
9*3=27
9*4=36
9*5=45
*/
