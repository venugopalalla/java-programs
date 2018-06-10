package org.inetsolv;

/*THIS IS THE PROGRAM FOR FINDING THE ADDITION,SUBTRACTION,MULTIPLICATION AND DIVISON 
 *BY USING SWITCH AND USING DIFFERENT METHODS FOR EVERY OPERATION.....
*/
import java.util.Scanner;

public class SwitchExampleWithMethods {

	public static void main(String[] args) {
		
		SwitchExampleWithMethods switchExampleWithMethods = new SwitchExampleWithMethods();
		
	    @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	    
	    //HEAR READING THE VALUS FROM KEYBOARD.....
	    System.out.println("Enter first value of a :");
	    double firstNumber = scanner.nextInt();
	    System.out.println("Enter Second value of b :");
	    double secondNumber = scanner.nextInt();
	    
	    //HEAR SELECT ONE OF THE BELOW OPTION TO DO TASK.....
	    System.out.println("For Addition Select = 1");
	    System.out.println("For Subtraction Select= 2");
	    System.out.println("For Multiplication Select= 3");
	    System.out.println("For Division Select= 4");
	    System.out.print("Choose any number to perform related task :");
        int task =scanner.nextInt();
        
	    switch(task)    {
	    case 1 : switchExampleWithMethods.add(firstNumber,secondNumber);
	            break;
	    case 2 : switchExampleWithMethods.sub(firstNumber,secondNumber);
	            break;
	    case 3 : switchExampleWithMethods.multi(firstNumber,secondNumber);	           
	            break;
	    case 4 : switchExampleWithMethods.div(firstNumber,secondNumber);	          
	            break;
	    default : System.out.println("GIVEN TASK IS NOT MATCHED");
	       }
	}
	
	void add(double firstNumber,double secondNumber){
    
		double addition=firstNumber+secondNumber;
		System.out.println("ADDITION :"+addition);
    } 
	
    void sub(double firstNumber,double secondNumber) {
     
    	double subtraction=firstNumber-secondNumber;
		System.out.println("SUBTRACTION :"+subtraction);
    }
    void multi(double firstNumber,double secondNumber){
  
    	double mult=firstNumber*secondNumber;
		System.out.println("MULTIPLICATION :"+mult);
    }
    void div(double firstNumber,double secondNumber) {
   
    	double div=firstNumber/secondNumber;
		System.out.println("DIVISION :"+div);
    }
}

/*
 * OUTPUT
 
 ADDITION:
 
 Enter first value of a :2
 Enter Second value of b :3
For Addition Select = 1
For Subtraction Select= 2
For Multiplication Select= 3
For Division Select= 4
Choose any number to perform related task :1
ADDITION :5.0

SUBTRACTION:

Enter first value of a :5
Enter Second value of b :2
For Addition Select = 1
For Subtraction Select= 2
For Multiplication Select= 3
For Division Select= 4
Choose any number to perform related task :2
SUBTRACTION :3.0

 MULTIPLICATION:
 
 Enter first value of a :2
Enter Second value of b :3
For Addition Select = 1
For Subtraction Select= 2
For Multiplication Select= 3
For Division Select= 4
Choose any number to perform related task :3
MULTIPLICATION :6.0

DIVISION:

Enter first value of a :6
Enter Second value of b :2
For Addition Select = 1
For Subtraction Select= 2
For Multiplication Select= 3
For Division Select= 4
Choose any number to perform related task :4
DIVISION :3.0

OTHERS:

Enter first value of a :5
Enter Second value of b :10
For Addition Select = 1
For Subtraction Select= 2
For Multiplication Select= 3
For Division Select= 4
Choose any number to perform related task :5
GIVEN TASK IS NOT MATCHED

 */






