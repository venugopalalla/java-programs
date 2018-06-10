package org.inetsolv;

//THIS IS THE PROGRAM FOR ELIMINATING DUPLICATING VALUES WITH OUT USING COLLECTION.....

public class EliminateDuplicateNames {

	public static void main(String[] args) {
				
		//HEAR I TAKE SOME NAMES INTO ARRAY.....
		String name[]= {"venu","111"," ","gopal","reddy","gopal","reddy","gopal","reddy","gopal","reddy","alla","venu","111","mani"," ","236"};	
		
		System.out.print("THE NAMES ARE :");
		for(int i=0;i<name.length;i++) {
			int a=0;
			for(int j=0;j<i;j++) {					
			    if(name[j].equals(name[i])) {	
			    	a=1;
			    	break;
			    }
			}			
		    if(a==0) {
	     	  System.out.print(name[i]+",");
		    }
		}          
	}
}
/*
 * OUTPUT
 * 
 * THE NAMES ARE :venu,111, ,gopal,reddy,alla,mani,236,
 */

