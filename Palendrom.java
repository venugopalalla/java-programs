package org.inetsolv;

//THIS IS THE PROGRME FOR FINDING THE ENTER NUMBER OR STRING IS A PALENDRO OR NOT.....

import java.util.Scanner;

public class Palendrom {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OR NAME FOR FINDING PALENDROM OR NOT  :");
		String name = scanner.next();
		String storeName="";
		
		for(int i=name.length()-1;i>=0;i--) {		
			storeName=storeName+name.charAt(i);
		}
		
		if(name.equals(storeName)) {
			System.out.println("THE ENTER NUMBER OR STRING IS A PALENDROM");
		}
		else {
			System.out.println("THE ENTER NUMBER OR STRING IS NOT A PALENDROM");
		}

	}

}
/*
 * OUTPUT
 
ENTER THE NUMBER OR NAME FOR FINDING PALENDROM OR NOT  : MADAM
THE ENTER NUMBER OR STRING IS A PALENDROM

ENTER THE NUMBER OR NAME FOR FINDING PALENDROM OR NOT  : APPLE
THE ENTER NUMBER OR STRING IS NOT A PALENDROM

ENTER THE NUMBER OR NAME FOR FINDING PALENDROM OR NOT  :123456
THE ENTER NUMBER OR STRING IS NOT A PALENDROM

*/