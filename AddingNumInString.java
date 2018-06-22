package org.inetsolv;

/*
 * THIS IS THE PROGRAM FOR ADDING THE ALL THE NUMBER IN THE 
 * ENTERED STRING....
 * 
 */
import java.util.Scanner;

public class AddingNumInString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE STRING :");
		String name = scanner.nextLine();

		int sum = 0;
		int sumOne = 0;
		String NumInString = "0";
		for (int i = 0; i < name.length(); i++) {

			int num = name.charAt(i);
			if (num >= 48 && num <= 57) {
				NumInString = NumInString + (num - 48);
			} else {
				sumOne = Integer.parseInt(NumInString);
				System.out.println("Number Is :" + sumOne);
				sum = sum + sumOne;
				NumInString = "0";
			}
			if (i == (name.length()) - 1) {
				sumOne = Integer.parseInt(NumInString);
				System.out.println("Number Is :" + sumOne);
				sum = sum + sumOne;
			}

		}
		System.out.println(" Addition Of All Numbers In String Is :" + sum);
	}

	/*
	 * OUTPUT
	 * 
	 * ENTER THE STRING : a12b23c34d45
	 * 
	 *  Number Is :0
	 *  Number Is :12 
	 *  Number Is :23
	 *  Number Is :34 
	 *  Number Is :45 
	 *  Addition Of All Numbers In String Is :114
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
