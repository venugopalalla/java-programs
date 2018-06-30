package org.inetsolv;
import java.util.*;
public class MiddleLineSquarePattern{
	
	// THIS IS THE PROGRAM FOR SQUARE PATTERN AND WITH STARS IN MIDDLE LINE ALSO....
	
	public static void main(String[] ar){
		
		Scanner scanner =new Scanner(System.in);
		
		//HEAR READING THE NUMBER FROM USER....
		
		System.out.println("Enter Number for Pattern :");				
		double number=scanner.nextDouble();
		
		for(int i=1;i<=number;i++){
			
			for(int j=1;j<=number;j++){
				
				if(i==1 || i==number || j==1 || j==number || i==(int)((number/2)+0.5) || j==(int)((number/2)+0.5))
				   System.out.print("*");
				
				else
				 System.out.print(" ");				
			}
			 System.out.println();
		}		
	}
}
/*

output

Enter Number for Pattern :7
*******
*  *  *
*  *  *
*******
*  *  *
*  *  *
*******
*/