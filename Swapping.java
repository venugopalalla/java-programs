package org.inetsolv;

// SWAPPING TWO NUMBERS 
public class Swapping {

	public static void main(String[] args) {
			
		// SWAPPING TWO NUMBER BY USING 3RD VARIABLE.....
		int a=10;
	    int b=20;
	    
	    int c=a+b;	    
	    b=c-b;
	    a=c-a;
	    
	    System.out.println("a="+a);
	    System.out.println("b="+b);
	    
	    // SWAPPING TWO NUMBERS WITH OUT USING 3RD VARIABLE.....

	    int firstNum=10;
	    int secondNum=20;
	    
	    firstNum=firstNum+secondNum;
	    secondNum=firstNum-secondNum;
	    firstNum=firstNum-secondNum;
	    
	    System.out.println("First Num :"+firstNum);
	    System.out.println("Second Num :"+secondNum);
	    	    
	}
}
/*
 * OUTPUT
 * 
a=20
b=10
First Num :20
Second Num :10
*/










