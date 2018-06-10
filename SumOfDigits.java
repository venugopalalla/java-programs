package org.inetsolv;

/*
 * THIS IS THE PROGRAM FOR FINDING THE SUM OF DIGITS FOR GIVEN NUMBER...
 */
import java.util.Scanner;

public class SumOfDigits {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//READING THE NUMBER FROM KEYBOARD...
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER TO ADD :");
		int number = scanner.nextInt();
		int sum=0;
		int storeNum=0;
		    
		while(number>0) {
		       storeNum=number%10;
		       sum=sum+storeNum;
		       number=number/10;
		}
		System.out.println("SUM :"+sum);		
	}
}
/*
 *OUTPUT
 * 
 * ENTER THE NUMBER TO ADD : 12345
 * SUM :15
 */
