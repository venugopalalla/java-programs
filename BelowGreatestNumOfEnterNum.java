package org.inetsolv;

/*
 * THIS IS THE PRORAM FOR FINDING THE BELOW GREATEST NUM
 * OF ENTERED NUM AND, THAT GREATEST NUM NUM DIGITS MUST 
 * NOT MATCH WITH THE ENTERED NUMBER.....
 */
import java.util.Scanner;

public class BelowGreatestNumOfEnterNum {

	public static void main(String[] ar) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NUM FOR FINDNG THE GREATEST NUM :");
		int num = scanner.nextInt();

		for (int i = (num - 1); i >= 0; i--) {

			String a = "" + i;
			String b = "" + num;
			int a1 = 0;
			for (int j = 0; j < b.length(); j++) {

				for (int k = 0; k < a.length(); k++) {

					int c = b.charAt(j) - 48;
					int d = a.charAt(k) - 48;

					if (c == d) {
						a1++;
						break;
					}
				}
				if (a1 == 1)
					break;
			}

			if (a1 == 0) {
				System.out.println("The Greatest Number Is :" + i);
				break;
			}
		}
	}
}

/*
 * OUTPUT
 * 
 * ENTER THE NUM FOR FINDNG THE GREATEST NUM : 4325 The Greatest Number Is :1999
 * 
 */
