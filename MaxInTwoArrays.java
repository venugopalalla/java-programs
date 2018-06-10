package org.inetsolv;

// THIS IS THE PROGRAM FOR FINDING THE MAXIMUM VALUE IN TWO ARRAYS.....
import java.util.Scanner;

public class MaxInTwoArrays {

	public static void main(String[] args) {
		
		 MaxInTwoArrays br1 = new MaxInTwoArrays();

	     @SuppressWarnings("resource")
		 Scanner scanner = new Scanner(System.in);
	     
	     //HEAR READING THE SIZE OF THE FIRST ARRAY.....
	     System.out.print("ENTER SIZE OF THE FIRST ARRAY :");
	     //HEAR READING THE SIZE OF THE FIRST ARRAY.....
	     int sizeOne = scanner.nextInt();	     
	     System.out.print("ENTER SIZE OF THE SECOND ARRAY :");
	     int sizeTwo = scanner.nextInt();	
	     
	     //HEAR CREATING THE DOUBLE ARRAYS WITH ENTERED SIZES.....
	     double[] arrOne = new  double[sizeOne];
	     double[] arrTwo = new  double[sizeTwo];

	     //HEAR STORING THE VALUES INTO FIRST ARRAY.....
	     for(int i=0;i<arrOne.length;i++)
	        {
	           System.out.print("ENTER "+(i+1)+"st VELUE INTO FIRST ARRAY :");
	           arrOne[i] = scanner.nextDouble();
	        }
	    
	     //HEAR STORING THE VALUS INTO SECOND ARRAY.....
	      for(int j=0;j<arrTwo.length;j++)
	        {
	           System.out.print("ENTER "+(j+1)+"st VELUE INTO SECOND ARRAY :");
	           arrTwo[j] = scanner.nextDouble();
	        }
	      
	      //HEAR INVOKING MAX METHD TO FIND MAX VALUE IN TWO ARRAYS.....
	      double maxVal = br1.max(arrOne,arrTwo);
	     System.out.println("MAXIMUM VALUE IN TWO ARRAYS IS :"+maxVal);
	}
	 
	
	//THIS IS THE METHOD TO FIND THE MAX VALUE IN TWO ARRAYS.....
	   double max(double[] arrOne, double[] arrTwo) {
		   
	       double arrOneFirstValue =arrOne[0];
	             for(int k=1;k<arrOne.length;k++) {
	                  if(arrOne[k]>arrOneFirstValue)  {
	                         arrOneFirstValue=arrOne[k];
	                  }
	             }
	       
	       double arrTwoFirstValue =arrTwo[0];
	             for(int l=1;l<arrTwo.length;l++){
	                  if(arrTwo[l]>arrTwoFirstValue) {
	                         arrTwoFirstValue=arrTwo[l];
	                  }
	             }
	       
	       double maxNumInTwoArr =arrOneFirstValue>arrTwoFirstValue?arrOneFirstValue:arrTwoFirstValue;
	             return maxNumInTwoArr;
	   }
}
/*
 * OUTPUT
 * 
ENTER SIZE OF THE FIRST ARRAY :4
ENTER SIZE OF THE SECOND ARRAY :5
ENTER 1st VELUE INTO FIRST ARRAY :1
ENTER 2st VELUE INTO FIRST ARRAY :2
ENTER 3st VELUE INTO FIRST ARRAY :3
ENTER 4st VELUE INTO FIRST ARRAY :4
ENTER 1st VELUE INTO SECOND ARRAY :5
ENTER 2st VELUE INTO SECOND ARRAY :6
ENTER 3st VELUE INTO SECOND ARRAY :7
ENTER 4st VELUE INTO SECOND ARRAY :8
ENTER 5st VELUE INTO SECOND ARRAY :6
MAXIMUM VALUE IN TWO ARRAYS IS :8.0
*/
