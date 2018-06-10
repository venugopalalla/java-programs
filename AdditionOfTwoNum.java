package org.inetsolv;
/*
 * This Is The Program For Finding The Addition Of Two Number
 * Taking The Values From KeyBoard...
 */
import java.util.Scanner;

public class AdditionOfTwoNum {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		//Reading The Values From KeyBoard
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter The Second Number: ");
	    int secondNumber = scanner.nextInt();
	    
	    //Calculating The Addition For Two Numbers...
	    
	    int addition =firstNumber*secondNumber;
	    System.out.println("Addition Of Two Numbers Is ="+addition);
	    	    
	}
}
/*
 * output
 * Enter The First Number: 30
 * Enter The Second Number: 20
 * Addition Of Two Numbers Is =600
 */
