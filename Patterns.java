package org.inetsolv;

public class Patterns {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){
	         
			for(int j=5;j>=i;j--){
	             System.out.print("*");
		    }
	          System.out.println();
	     }
		/*
		 * 
		  OUTPUT
		 { 
		  *****
		  ****
		  ***
          **
          *
          *  }
          
		 */
		
		for(int i=5;i>=1;i--) {
			
	         for(int j=1;j<=i;j++) {
	             System.out.print(j);
		   }
	          System.out.println();
	    }
		/*
		 * OUTPUT
		 * 12345
		 * 1234
         * 123
         * 12
         * 1
		 */
		
		for(int i=1;i<=5;i++) {
			
	         for(int j=1;j<=i;j++) {
	             System.out.print(j);
		     }
	          System.out.println();
	    }
		
		/*
		 * OUTPUT
		 * 1
		 * 12
         * 123
         * 1234
         * 12345
		 */
		
	     int z=5;
	     
	     for(int i=5;i>=1;i--) {
	    	 
	         for(int j=5;j>i;j--) {
	             System.out.print(" ");
		     }
	         for(int k=1;k<=z;k++) {
	             System.out.print(i);
	         }
	           z--;
	          System.out.println();
	     }
	     
	     /*
	      * 55555
 		  *  4444
  		  *   333
   		  *    22
          *  	1
	      */
	     
	     z=5;
	     for(int i=5;i>=1;i--) {
	    	 
	         for(int j=5;j>i;j--) {
	             System.out.print(" ");
		     }
	         for(int k=1;k<=z;k++) {
	             System.out.print("*");
	         }
	             z--;
	          System.out.println();
	      }
	     /*
	       OUTPUT
	       
	        *****
             ****
              ***
               **
                *
	      */
	     
	     z=1;
	     for(int i=1;i<=5;i++){
	    	 
	          for(int j=5;j>i;j--){
	             System.out.print(" ");
		      }
	          for(int k=1;k<=z;k++) {
	             System.out.print(i);
	          }
	             z++;
	          System.out.println();
	      }
	     /*
	      * OUTPUT
	      * 
	      *     1
   		  *    22
          *   333
          *  4444
          * 55555
	      */
	}
}
