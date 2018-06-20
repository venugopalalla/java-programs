package org.inetsolv;

//THIS IS THE PROGRAM FOR REVERSING THE ALL ENTERED NAMES BY USING ARRAYS.....

import java.util.Scanner;

public class NameReverseInArrays {

	public static void main(String[] ar) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER SIZE OF THE ARRAY :");
		int size = scanner.nextInt();

		String[] names = new String[size];

		// HEAR READING ALL NAMES FROM THE KEYBOARD.....

		for (int i = 0; i < size; i++) {

			System.out.print("ENTER THE " + (i + 1) + " NAME INTO ARRAY :");
			names[i] = scanner.next();
		}

		System.out.println("The Reversed Names Are :");
		for (int i = 0; i < size; i++) {
			String reverseName = "";

			for (int j = names[i].length() - 1; j >= 0; j--) {
				reverseName = reverseName + names[i].charAt(j);
			}
			System.out.println(reverseName + ",");
		}

	}
}
/*
 * OUTPUT
 * 
 * ENTER SIZE OF THE ARRAY :5 
 * ENTER THE 1 NAME INTO ARRAY :APPLE
 * ENTER THE 2 NAME INTO ARRAY :BALL 
 * ENTER THE 3 NAME INTO ARRAY :CAPTURE 
 * ENTER THE 4 NAME INTO ARRAY :DANGER 
 * ENTER THE 5 NAME INTO ARRAY :EAGLE 
 * The Reversed Names Are : ELPPA, LLAB, ERUTPAC, REGNAD, ELGAE,
 * 
 */
