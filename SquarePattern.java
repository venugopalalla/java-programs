import java.util.*;

public class SquarePattern{
	
	// THIS IS THE PROGRAM FOR SQUARE PATTERN .....
	
	public static void main(String[] ar){
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Number for Pattern :");
		
		//HEAR READING THE NUMBER FROM USER....
		
		int number=scanner.nextInt();
		
		for(int i=1;i<=number;i++){
			
			for(int j=1;j<=number;j++){
				
				if(i==1 || i==number || j==1 || j== number) 
				   System.out.print("*");
				
				else
				 System.out.print(" ");				
			}
			 System.out.println();
		}
		
	}
	
}
/*

Output:

*****
*   *
*   *
*   *
*****
*/