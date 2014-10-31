//  Name: Jared Adamson
//  Description: Assignment 5

import java.util.Scanner;

public class Assignment5
{

    
    
    public static void main(String[] args)
    {
      // Variables
      Scanner scan = new Scanner(System.in);
      int number1, number2;
      String pick, name;
      char choice;
      System.out.println("\nPlease enter a name:");
      name = scan.next();
      Geek gName = new Geek(name);
      boolean again = true;
      // List Command options
      do
      {
      System.out.println("\n          Command Options"+
      "\n-----------------------------------" +
      "\na : Geek's name" + 
      "\nb: Num Questions asked" +
      "\nc: All numbers are the same" +
      "\nd: Is prime" +
      "\ne: Sum between two integers" + 
      "\nf: Repeat the string" +
      "\ng: It is palindrome" +
      "\n?: Display" +
      "\nq: Quit");
      pick = scan.next();
      choice = pick.charAt(0);
       
         switch (choice)
            {
                 case 'a': 
                     // add a number
                      System.out.println("\nYour geeks name is: " + gName.getName());
                      break;
                 case 'b':
                     // show the number of questions asked
                      System.out.println("\nGeek has answered " + gName.getNumberOfQuestions() + " Questions.");
                      break;
                 case 'c':
                     // Check if same
                      System.out.println("Enter a number:");
                      int num1 = scan.nextInt();
                      System.out.println("Enter another number:");
                      int num2 = scan.nextInt();
                      System.out.println("Enter one more number:");
                      int num3 = scan.nextInt();
                      boolean same = gName.allTheSame(num1, num2, num3);
                      if (same == true)
                         System.out.print("Your numbers are the same.");
                      else
                         System.out.print("Your numbers are NOT the same."); 
                      break;
                 case 'd':
                     // Check prime
                      System.out.print("Enter a number:");
                      int num = scan.nextInt();
                      boolean prime = gName.isPrime(num);
                      if (prime == true)
                         System.out.print("Your number is prime.");
                      else
                         System.out.print("Your number is NOT prime."); 
                      break;
                 case 'e': 
                     // Sum 2 ints
                      System.out.println("\nEnter your first number:");
                      int sum1 = scan.nextInt();
                      System.out.println("\nEnter your second number:");
                      int sum2 = scan.nextInt();
                      int totalsum = gName.sum(sum1, sum2);
                      System.out.println("\nThe sum is: " + totalsum);
                      break;
                 case 'f': 
                     // repeat a string
                      System.out.println("\nEnter a string:");
                      String reString = scan.next();
                      System.out.println("\nEnter the number of times to repeat the string:");
                      int reNum = scan.nextInt();
                      System.out.println(gName.repeat(reString, reNum));
                      break;
                 case '?':
                     // Prints info
                     System.out.println("You have asked " + gName.getNumberOfQuestions() + " Questions.");
                      break;
                 case 'q':
                     again = false;
                      break;
                 default:
                 	  System.out.println("Invalid input!");

            }
        
      }while (again == true);
        
    }
}
