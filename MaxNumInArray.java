package org.inetsolv;

//THIS THE PROGRAM FOR FINDING THE MAX NUMBER IN ARRAY.....
import java.util.Scanner;

public class MaxNumInArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//HEAR I AM READING THE SIZE OF THE ARRAY FROM KEYBOARD.....
		System.out.println("ENTER THE SIZE OF THE ARRAY :");
		int size = scanner.nextInt();
		
        double[] numbers =new double[size];
        
        //HEAR I AM READING VALUES FROM KEYBOARD AND STORING THEM INTO ARRAY.....
        
        for(int i=0;i<numbers.length;i++) {
        	
        	System.out.println("ENTER THE "+(i+1)+" NUMBER :");
        	numbers[i]=scanner.nextDouble();
        }
       
        double maxNum=numbers[0];
       
        //HEAR I AM FINDING THE MAX VALUES IN THE ARRAY.....
        for(int i=1;i<numbers.length;i++){
        	
          if(numbers[i]>maxNum)
             {
                 maxNum=numbers[i];
             }
        }
        
      System.out.println("THE MAX NUMBER IN DOUBLE ARRAY IS :"+maxNum);
      
     }	
}
/*
 * OUTPUT
 * 
ENTER THE SIZE OF THE ARRAY :5
ENTER THE 1 NUMBER :12
ENTER THE 2 NUMBER :22
ENTER THE 3 NUMBER :33
ENTER THE 4 NUMBER :44
ENTER THE 5 NUMBER :55
THE MAX NUMBER IN DOUBLE ARRAY IS :55.0
*/

