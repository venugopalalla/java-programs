package org.inetsolv;

//THIS IS THE PROGRAM FOR FINDING FACTORIAL, FOR ENTERED NUMBER.....
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		//HEAR READING THE NUBER FROM KEYBOARD.....
		System.out.println("ENTER THE NUMBER FOR FINDING THE FACTORIL :");
		int number = scanner.nextInt();

		BigInteger factorial = new BigInteger("1");
		
		for (int i = number; i>=1; i--) {
			factorial=factorial.multiply(new BigInteger(""+i));
		} 
		
		System.out.println("FACTORIAL FOR ENTER NUMBER IS :"+factorial);
	}
}
/*
 * OUTPUT
 * 
 * ENTER THE NUMBER FOR FINDING THE FACTORIL :5
 * FACTORIAL FOR ENTER NUMBER IS :120 
 */

