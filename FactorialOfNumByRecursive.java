package org.inetsolv;

/*THIS IS THE PROGRAM FOR FINDING THE FACORIAL OF ENTERED NUM
 *BY USING RECURSIVE METHOD.....
*/
import java.util.Scanner;

public class FactorialOfNumByRecursive {

	@SuppressWarnings("resource")
	public static void main(String[] ar) {

		FactorialOfNumByRecursive s = new FactorialOfNumByRecursive();
		Scanner scanner = new Scanner(System.in);

		// HEAR READING THE NUMBER FROM KEYBOARD.....
		System.out.println("ENTER THE NUMBER FOR FINDING FACTORIAL :");
		int number = scanner.nextInt();

		int factorial = s.factorialOfNum(number);
		System.out.println("FACTORAIL OF ENTERED NUMBER IS  :" + factorial);
	}

	int factorialOfNum(int number) {

		if (number == 0)
			return 1;

		int factorial = number * factorialOfNum((number - 1));

		return factorial;
	}
}

/*
 * OUTPUT
 * 
 * ENTER THE NUMBER FOR FINDING FACTORIAL : 5 
 * FACTORAIL OF ENTERED NUMBER IS :120
 */
