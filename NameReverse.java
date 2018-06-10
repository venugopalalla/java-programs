package org.inetsolv;

//THIS IS THE PROGRAM FOR FINDING THE REVERSE NAEM FOR ENTERED NAME.....
import java.util.Scanner;

public class NameReverse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// READING THE NAME FROM KEYBOARD.....
		
		System.out.println("ENTER NAME FOR REVERSE :");
		String name = scanner.nextLine();
		
		String reverseName="";

		for (int i = name.length()-1; i >=0; i--) {			
			reverseName =reverseName.concat(""+name.charAt(i));
		}
		System.out.println("REVERSE NAME FOR ENTERED NAME IS :"+reverseName);
	}
}
/*
 * OUTPUT
 * 
 * ENTER NAME FOR REVERSE :venu gopal reddy alla
 * REVERSE NAME FOR ENTERED NAME IS :alla ydder lapog unev
 */


