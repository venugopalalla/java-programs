import java.util.*;

public class CrossSquarePattern{
	
	
	// THIS IS THE PROGRAM FOR SQUARE PATTERN AND WITH CROSS STARS.....
	
	public static void main(String[] ar){
		
		Scanner scanner =new Scanner(System.in);
		
		//HEAR READING THE NUMBER FROM USER....
		
		System.out.println("Enter Number for Pattern :");
		
		int number=scanner.nextInt();
		
		for(int i=1;i<=number;i++){
			
			for(int j=1;j<=number;j++){
				
				if(i==1 || i==number || j==1 || j== number || i==j || j==number-(i-1)) 
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

Enter Number for Pattern : 11

***********
**       **
* *     * *
*  *   *  *
*   * *   *
*    *    *
*   * *   *
*  *   *  *
* *     * *
**       **
***********


*/