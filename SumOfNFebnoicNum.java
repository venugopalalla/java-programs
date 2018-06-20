package org.inetsolv;

//THIS IS THE PROGRAM FOR FINDING THE SUM OF 'N' FIBNOIC NUBERS
import java.math.BigInteger;
import java.util.Scanner;

public class SumOfNFebnoicNum {

	@SuppressWarnings("resource")
	public static void main(String[] ar) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("ENTER THE NUMBER FOR FINDING SUM OF N FIBNOIC NUMBERS :");
		int number = scanner.nextInt();
		BigInteger a = new BigInteger("" + 0);
		BigInteger b = new BigInteger("" + 1);
		BigInteger c = new BigInteger("" + 0);
		BigInteger sum = new BigInteger("0");

		for (int i = 1; i <= number; i++) {
			sum = sum.add(new BigInteger("" + a));
			c = c.add(new BigInteger("" + b));
			a = b;
			b = c;

		}

		System.out.println();
		System.out.println("SUM OF " + number + " FIBNOIC NUBER IS :" + sum);
	}
}
/*
 * OUTPUT
 * 
 * ENTER THE NUMBER FOR FINDING SUM OF N FIBNOIC NUMBERS : 50
 * 
 * SUM OF 50 FIBNOIC NUBER IS :281474976710656
 * 
 */
