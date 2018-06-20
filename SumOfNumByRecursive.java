package org.inetsolv;

/*THIS IS THE PROGRAM FOR FINDING THE SUM OF ENTERED NUM
 *BY USING RECURSIVE METHOD.....
*/
import java.util.Scanner;

public class SumOfNumByRecursive {

	@SuppressWarnings("resource")
	public static void main(String[] ar) {

		SumOfNumByRecursive s = new SumOfNumByRecursive();
		Scanner scanner = new Scanner(System.in);
		
		//HEAR READING THE NUMBER FROM KEYBOARD.....
		System.out.println("ENTER THE NUMBER :");
		int number = scanner.nextInt();

		int sum = s.sumOfNum(number);
		System.out.println("sum :" + sum);
	}

	int sumOfNum(int number) {

		if (number == 0)
			return 0;

		int sum = (number % 10) + sumOfNum((number / 10));

		return sum;
	}
}

/*
 * OUTPUT
 * 
 * ENTER THE NUMBER : 12345
 * sum :15
 * 
 */
