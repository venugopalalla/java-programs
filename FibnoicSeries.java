package org.inetsolv;

//THIS IS THE PROGRAM FOR FINDING THE FIBNOIC SERIES.....
import java.util.Scanner;

public class FibnoicSeries {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		//HEAR READING THE NUMBER FROM KEYBOARD FOR FINDING STARTING N FEBNOIC NUMBERS.....
        System.out.println("ENTER THE NUMBER FOR FINDING STARTING N FIBNOIC NUMBERS ");		
        int number = scanner.nextInt();

		// FIRST METHOD FOR FIBNOIC 	
             
        System.out.print("STARTING "+number+" FEBNOIC NUMBERS ARE :"); 
		 
        int num1 = 0,num2 = 1,z;
		 
        for(int i=0;i<number;i++) {
		        
        	System.out.print(num1+",");		        
        	z = num1+num2;		        
        	num1 = num2;		         
        	num2 = z;		       
        }       
		 System.out.println();
		//SECOND METHOD FOR FIBNOIC
        System.out.print("STARTING "+number+" FEBNOIC NUMBERS ARE :");
        int a=0,c,b=1;		     
        for(int i=0;i<number;i++) {  
		 	  
        	if(i==0 ||i==1){          
        		System.out.print(i+",");
		    }
		 	 
        	else { 		  	     
        		c=a+b; 			       
        		a=b; 		          
        		b=c;         		          
        		System.out.print(c+",");      		           
        	}			
        }
	}
}
/*
 * OUTPUT 
ENTER THE NUMBER FOR FINDING STARTING N FIBNOIC NUMBERS 10
STARTING 10 FEBNOIC NUMBERS ARE :0,1,1,2,3,5,8,13,21,34
STARTING 10 FEBNOIC NUMBERS ARE :0,1,1,2,3,5,8,13,21,34
 */







