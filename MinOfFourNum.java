package org.inetsolv;

/*
 * This Is The Program For Finding The Minimum Value In Four Numbers
 * By Using Logical Operators...
 */
public class MinOfFourNum {

	public static void main(String[] args) {
		/*
		 * a,b,c,d are the four values ...
		 */
		int a=15;
		int b=10;
		int c=20;
		int d=30;
		
		if (a<b && a<c && a<d) {
		    System.out.println(" MinimumValue=" +a);
		}
		else if(b<a && b<c && b<d){
		    System.out.println(" MinimumValue=" +b);
		}
		else if(c<a && c<b && c<d) {
		    System.out.println(" MinimumValue=" +c);
		 }
		else {
		    System.out.println(" MinimumValue=" +d);
	    }
	}
}
/*
 * output
 * MinimumValue=10

 */
