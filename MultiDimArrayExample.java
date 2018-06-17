package org.inetsolv;

/*THIS IS THE EXAMPLE FOR MULTI DIMENSIONAL ARRAY
 *DISPLAYING THE ARRAYS IN THE FORM MATRIX
 *AND DOING ADDITION AND SUBTRACTION AND MULTIPLICATION
 */
public class MultiDimArrayExample {

	public static void main(String[] args) {
	
		int arr1[][]={{1,2,3},{3,4,7},{5,9,6}};
		int arr2[][]={{5,6,5},{7,8,7},{5,6,9}};
		
		//REPRESENTING ARR1 IN THE FORM OF MATRIX
				    
		System.out.println("REPRESENTING ARR1 IN THE FORM OF MATRIX");
		for(int i=0; i<arr1.length; i++) {		            
			for(int k=0; k<arr1.length;k++){		              
				System.out.print(arr1[i][k]+" ");			    
			}	           
			System.out.println(" ");		        
		}
		     
	   //REPRESENTING ARR2 IN THE FORM OF MATRIX
		 
		System.out.println("REPRESENTING ARR2 IN THE FORM OF MATRIX");
		for(int j=0;j<arr2.length;j++){		            
			for(int k=0;k<arr2.length;k++) {		                
				System.out.print(arr2[j][k]+"  ");			     
			}	     
			System.out.println(" ");		  
		}
		   
		//ADDITION OF THE ARR1 AND ARR2
		System.out.println("ADDITION OF THE ARR1 AND ARR2");
		for(int i=0,j=0; i<arr1.length && j<arr2.length; i++,j++) {		            
			for(int k=0; k<arr1.length && k<arr2.length;k++) {		           
				System.out.print(arr1[i][k]+arr2[j][k]+"  ");			 
			}		        
			System.out.println(" ");		  
		}
		 
		//SUBTRAACTION OF THE ARR1 AND ARR2
		System.out.println("SUBTRAACTION OF THE ARR1 AND ARR2");
		for(int i=0,j=0; i<arr1.length && j<arr2.length; i++,j++){		             
			for(int k=0; k<arr1.length && k<arr2.length;k++){		               
				System.out.print(arr1[i][k] - arr2[j][k]+"  ");			    
			}
		   
			System.out.println(" ");
		  
		}
		
		//MULTIPLICATION FO THE ARR1 AND ARR2
		System.out.println("MULTIPLICATION FO THE ARR1 AND ARR2");
		for(int i=0,j=0; i<arr1.length && j<arr2.length; i++,j++){		             
			for(int k=0; k<arr1.length && k<arr2.length;k++) {		              
				System.out.print(arr1[i][k] * arr2[j][k]+" ");			     
			}		          
			System.out.println(" ");
		       
		}
	}
}
/*
 * OUTPUT
 * 
 
REPRESENTING ARR1 IN THE FORM OF MATRIX

1 2 3  
3 4 7  
5 9 6  
REPRESENTING ARR2 IN THE FORM OF MATRIX

5  6  5   
7  8  7   
5  6  9   
ADDITION OF THE ARR1 AND ARR2

6  8  8   
10  12  14   
10  15  15   
SUBTRAACTION OF THE ARR1 AND ARR2

-4  -4  -2   
-4  -4  0   
0  3  -3   
MULTIPLICATION FO THE ARR1 AND ARR2

5 12 15  
21 32 49  
25 54 54  

 */