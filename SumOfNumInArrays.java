package org.inetsolv;

/*THIS IS THE PROGRAM FOR FINDING THE SUM OF ALL NUMBERS 
 *IN ENTERED ARRAY
*/
import java.util.Scanner;

public class SumOfNumInArrays {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER SIZE OF THE ARRAY :");
		int size = scanner.nextInt();

		double[] nambers = new double[size];

		// HEAR READING THE ALL NUMBERD FROM THE KEYBOARD.....

		
		for (int i = 0; i < size; i++) {

			System.out.print("ENTER THE " + (i + 1) + " NUMBER INTO ARRAY :");
			nambers[i] = scanner.nextDouble();
		}

		double sumOfAllNumers = 0;
		for (int i = 0; i < size; i++) {

			sumOfAllNumers = sumOfAllNumers + nambers[i];
		}

		System.out.println("Sum Of All Numbers In Arrays Is :" + sumOfAllNumers);
	}

}

/*
 * OUTPUT
 * 
 * ENTER SIZE OF THE ARRAY :5 
 * ENTER THE 1 NUMBER INTO ARRAY :20 
 * ENTER THE 2 NUMBER INTO ARRAY :50 
 * ENTER THE 3 NUMBER INTO ARRAY :30 
 * ENTER THE 4 NUMBER INTO ARRAY :20.36 
 * ENTER THE 5 NUMBER INTO ARRAY :63.5 
 * Sum Of All Numbers In Arrays Is :183.86
 * 
 */
