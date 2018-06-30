import java.util.*;

public class DiamondMidLinePattern{
		
	// THIS IS THE PROGRAM FOR DIAMOND PATTERN AND WITH MIDLINE STARS.....
	
	public static void main(String[] ar){
		
		Scanner scanner =new Scanner(System.in);
		
		//HEAR READING THE NUMBER FROM USER....
		
		System.out.println("Enter Odd Number for Pattern :");
		
		double number=scanner.nextDouble();
		
		int num1= (int) ((number/2)+0.5);
		int num2= (int) ((number/2)+0.5);
		
		for(int i=1;i<=number;i++){
			
			for(int j=1;j<=number;j++){			
				if(j==num1 || j==num2 || i==((number/2)+0.5) || j==((number/2)+0.5))
					 System.out.print("*");
				else
					 System.out.print(" ");
			}
			
			if(i>=((number/2)+0.5)){
				num1++;
				num2--;
			} else{
				num1--;
				num2++;			
			}
			 System.out.println();
		}		
	}	
}
/*

output

Enter Odd Number for Pattern :11
     *
    ***
   * * *
  *  *  *
 *   *   *
***********
 *   *   *
  *  *  *
   * * *
    ***
     *
*/