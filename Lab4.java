// Author: Jared Adamson
// Title: Lab 4


//	Import required packages
        import java.util.Scanner;
        
//	Declare class (Lab4)
public class Lab4
{
 public static void main(String[] args)
 {
  	//	Declare Constant integers SUM = 1, FACTORIAL = 2, QUIT = 3.
     final int SUM = 1;
     final int FACTORIAL = 2;
     final int QUIT = 3;      
    
     
	//	Create an integer variable named choice to store user's option.
     int usrChoice;
	
	//	Create a Scanner object
     Scanner scan = new Scanner(System.in);

	//	Create a do-while loop that exits only when the user chooses quit (choice = QUIT)
     do
     {
    //	Print options
	System.out.println("This proram does the following: ");
		//-->
	System.out.println("1. Sum of numbers from 1 to n");
		//-->
	System.out.println("2. Factorial of n");
		//-->
	System.out.println("3. Quit");
		//-->
	System.out.println("Please choose an option.");
		//-->
		//	Read the value the user enters and store it in an integer variable
	usrChoice = scan.nextInt();
     

		//	Create a switch statement with  the variable that stores the option as input for the 3 cases
		switch (usrChoice)	{
			//add up all the numbers from 1 to the number you entered
			//	case SUM:
			case SUM:
				//	Ask the user to enter a number,
				System.out.print("Please enter a number: ");
				// Take user input and put it into the variable
				int n = scan.nextInt();
				// Define 2 integer variables, one is to store the summation, the other is to store current  number; and initialize them to 0
				int intSum = 0; 
        int curNum = 0;
                                                                     
				//	Use a while loop to calculate the sum
				//	Add the while-statement with the condition that  variable is less than the number you entered
				while(curNum < n)
                                {
					// increment  the current number;
					curNum++;
					// Calculate the summation  by adding
					intSum = curNum + intSum;
				}
				//	Print the answer saying: 'Sum of numbers from 1 - '  ' is ' '
				System.out.println("The sum of numbers from 1 - " + n + " is " + intSum);
				//	exit from the switch with a break statement, what happens if you don't use one? will not end properly
				break;
				//Calculate the product of  all numbers from 1 to the number you entered
			case FACTORIAL:
                                System.out.println("Please enter a number to factor:  ");
				
				int n2 = scan.nextInt();
				//	Ask the user to enter a number, (if the number is too large, the factorial result will become negative, why?)
				//--> Negative factors
				// Take user input and put it into the variable
				//-->
				// Declare an long variable  to store current product and initialize it to 1
				long curProd = 1;
				//	Use a for loop to calculate the factorial of n
				//	Write a for loop with an integer variable  and initialize it to the number you entered,
				//  condition that  greater than 1, decrement  by 1
				for(int i= n2; i > 1 ; i--)
         {

					curProd = n2 * i;
				}
				//	Print the answer saying: 'Factorial of ' ' is ' '
				System.out.println("The factorial of " + n2 + " is " + curProd);
				//	exit from the switch with a break statement.
				break;
			//	case QUIT:
			case QUIT:
				//	Print 'Your choice was Quit, Quitting the program, '
				System.out.println("Your choice was Quit, Quitting the program.");
				//	exit from the switch with a break statement
				break;
			//	default:
			default:
				//	Print 'Incorrect choice '<display the incorrect number you entered>  ' Please choose again'
				System.out.println("Incorrect choice: " + usrChoice + "\nChoose again: ")  ;
				//	break statement here is optional, why?
				//--> Because it will loop around until you make a valid choice.
		//	Close the switch statement
                }
	//	Close the do-while loop with a condition that the user's choice  is not equal to QUIT
	}while(usrChoice != QUIT);
	//	Close the main method
	//-->
//Close the Class
 }
//-->
}
