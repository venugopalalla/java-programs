package org.inetsolv;

public class PatternsOne {

	public static void main(String[] args) {

		// FIRST METHOD

		System.out.println("FIRST METHOD");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k > i; k--) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		// SECOND METHOD

		System.out.println("SECOND METHOD");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k > i; k--) {
				System.out.print(5 - (i));
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// THIRD METHOD
		
		System.out.println("THIRD METHOD");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 5; i > 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k + 1);
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i < 3; i++) {
			System.out.println();
		}
		
		// FOURTH PROGRAM
		
		System.out.println("FOURTH PROGRAM");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print((char) (64 + i));
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k > i; k--) {
				System.out.print((char) (69 - i));
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i < 3; i++) {
			System.out.println();
		}
		
		// FIFTH PROBLEM
		
		System.out.println("FIFTH PROBLEM");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print((char) (64 + k));
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 5; i > 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print((char) (k + 65));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


/*
 * OUTPUT
 * 
 * FIRST METHOD
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

SECOND METHOD
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
 4 4 4 4 
  3 3 3 
   2 2 
    1 

THIRD METHOD
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 2 3 4 5 
  2 3 4 
   2 3 
    2 


FOURTH PROGRAM
    A 
   B B 
  C C C 
 D D D D 
E E E E E 
 D D D D 
  C C C 
   B B 
    A 


FIFTH PROBLEM
    A 
   A B 
  A B C 
 A B C D 
A B C D E 
 B C D E 
  B C D 
   B C 
    B 

 */














