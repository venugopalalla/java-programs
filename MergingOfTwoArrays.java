package org.inetsolv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * MERGING THE DOUBLE ARRAY VALUES...
 */
public class MergingOfTwoArrays {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * READING THE SIZES FROM KEY BOARD
		 */

	    System.out.print("ENTER THE SIZE OF THE FIRST ARRAY :=");
	    int size1=Integer.parseInt(br.readLine());

	    System.out.print("ENTER THE SIZE OF THE SECOND ARRAY :=");
	    int size2=Integer.parseInt(br.readLine());

	    System.out.println();

	    double[] firstArray=new double[size1];
	    double[] secondArray=new double[size2];
	    /*
	     * STORING THE VALUES INTO ARRAYS...
	     */
	      for(int i=0;i<size1;i++){
	          System.out.print("ENTER THE "+(i+1)+" VALUE INTO FIRST ARRAY :=");
	          firstArray[i]=Double.parseDouble(br.readLine());
	        }

	        System.out.println();

	      for(int i=0;i<size2;i++) {
	          System.out.print("ENTER THE "+(i+1)+" VALUE INTO SECOND ARRAY :=");
	          secondArray[i]=Double.parseDouble(br.readLine());
	        }

	        System.out.println();

	        /*
	         * INVOKING THE METHDO FOR TO PERFORM MERGING...
	         */
	    MergingOfTwoArrays mergingOfTwoArrays = new MergingOfTwoArrays();

	    double[] storingArray=mergingOfTwoArrays.mergeTwoArrays(firstArray,secondArray);

	      for(int i=0;i<storingArray.length;i++) {
	        System.out.print(storingArray[i]+" , ");
	        }
	 } 
	/*
	 * HEAR THE ENTIRE OPERATION GOING...
	 */
	  double[] mergeTwoArrays(double[] firstArray,double[] secondArray) {

	    int size3=firstArray.length+secondArray.length;
	    double[] storingArray=new double[size3];

	    int a=0;
	    int b=0;
	    int c=0;

	       if(firstArray.length>secondArray.length){
	         a=secondArray.length;
	       }
	       else{
	         a=firstArray.length; 
	       }
	       a=a*2;
	       for(int i=0;i<size3;i++){    
	         if(i<a){
	           if(i%2==0)  
	              storingArray[i]=firstArray[b++];           
	           else             
	              storingArray[i]=secondArray[c++];             
	         }    
	         else{
	           if(firstArray.length>secondArray.length)
	              storingArray[i]=firstArray[b++];
	            else 
	              storingArray[i]=secondArray[c++];
	         }	       
	    }
	     return storingArray;
	  }
}

/*
   output:
   
   ENTER THE SIZE OF THE FIRST ARRAY :=3
   ENTER THE SIZE OF THE SECOND ARRAY :=4

   ENTER THE 1 VALUE INTO FIRST ARRAY :=1
   ENTER THE 2 VALUE INTO FIRST ARRAY :=2
   ENTER THE 3 VALUE INTO FIRST ARRAY :=3

   ENTER THE 1 VALUE INTO SECOND ARRAY :=4
   ENTER THE 2 VALUE INTO SECOND ARRAY :=5
   ENTER THE 3 VALUE INTO SECOND ARRAY :=6
   ENTER THE 4 VALUE INTO SECOND ARRAY :=7

   MERGINH = 1.0 , 4.0 , 2.0 , 5.0 , 3.0 , 6.0 , 7.0 , 
     
 */
