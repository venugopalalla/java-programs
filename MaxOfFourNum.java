package org.inetsolv;
/*
 * Finding The Maximum Number In Four Numbers BY Using Conditional Operators...
 */
public class MaxOfFourNum {

	public static void main(String[] args) {
		
		//a,b,c,d are the four numbers...
		
		int a = 100;
		int b = 15;
		int c = 200;
		int d = 205;
		int maximumNumber = a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d));
		System.out.println("maximum number=" +maximumNumber);
 
	}
}
/*
 * output 
 * 
 * maximum number=205
 */
