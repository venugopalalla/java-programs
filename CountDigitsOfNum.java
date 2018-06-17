package org.inetsolv;

/*
 * THIS IS THE PROGRAM FOR FINDING THE NUMBER OF DIGITS OF THE OF ENTER NUMBER.....
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDigitsOfNum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	 
	    System.out.print("ENTER THE NUMBER :");
	    int num = Integer.parseInt(br.readLine());
	 
	    int a=0;
	    while(num>0)
	     {
	       num = num/10;
	       a++;
	     }
	   System.out.println("THE NUM OF DIGITS OF THE ENTER NUMBER IS :"+" "+a);

	}

}
/*
 * OUTPUT
 * 
 * ENTER THE NUMBER :123456
   THE NUM OF DIGITS OF THE ENTER NUMBER IS : 6
 */


