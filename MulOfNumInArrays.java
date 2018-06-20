package org.inetsolv;

/*THIS IS THE PROGRAM FOR FINDING THE MULTIPLICATION OF ALL NUMBERS 
 *IN ENTERED ARRAY
*/
import java.util.Scanner;

public class MulOfNumInArrays {

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

		double mulOfAllNumers = 1;
		for (int i = 0; i < size; i++) {

			mulOfAllNumers = mulOfAllNumers * nambers[i];
		}

		System.out.println("Multiplication Of All Numbers In Arrays Is :" + mulOfAllNumers);
	}

}

/*
 * OUTPUT
 * 
 * ENTER SIZE OF THE ARRAY :4 
 * ENTER THE 1 NUMBER INTO ARRAY :2.3 
 * ENTER THE 2 NUMBER INTO ARRAY :6.5 
 * ENTER THE 3 NUMBER INTO ARRAY :4.6 
 * ENTER THE 4 NUMBER INTO ARRAY :9 
 * Multiplication Of All Numbers In Arrays Is :618.93
 * 
 */
