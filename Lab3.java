// Author: Jared Adamson
// Title: Lab 3

//Import the Scanner classes from the java.util package

import java.util.*;



//Declare the class (Lab3)

public class Lab3 {



     //Declare the main method

 public static void main(String[] args) {

        //Instantiate an object of type Scanner to read input from the keyboard

Scanner scan = new Scanner(System.in);

        // Part 1: you need to compare two integers, and output the smaller one

        //Prompt the user to enter two integer numbers, store them in two int variables: x and y

      System.out.println("Enter a value for x:");
        int x = scan.nextInt();
       
      System.out.println("Enter a value for y:");
       int y = scan.nextInt();
      
       // Compare the value of x and y, if x is smaller or equal to y, display x; otherwise, display y
      if (x <= y)
      {
         System.out.println("The smallest value was " + x);
      }
      else
      {
         System.out.println("The smallest value was " + y);
      }

      
      // -------------------------------------------------------------
      
       /* Part 2: Simulate a two-player game in which each person simultaneously chooses either rock, paper, or scissors.

Rock beats scissors but loses to paper, paper beats rock but loses to scissors, and scissors beats paper but loses to rock.

The following code prompts player 1 and player 2 to each enter a string: rock, paper, or scissors. Finish the code by

adding nested if statements to appropriately report ??Player 1 wins??, ??Player 2 wins??, or ??It is a tie."
*/
       // Declare 3 string variables to store 2 players' choices
      String strRock;
      String strPaper;
      String strSissors;

        System.out.println("Player 1: Choose rock, scissors, or paper:");
        //Load player1's choice in to the variable, convert it to lower case
        String  strPlay1 = scan.next().toLowerCase();

        System.out.println("Player 2: Choose rock, scissors, or paper:");
         //Load player2's choice in to the variable, convert it to lower case.
        String  strPlay2 = scan.next().toLowerCase();


     /* There are 9 cases in total lead to 3 results: Tie, player1 wins and play2 wins. Please use "if" statement and
boolean operators to describle these 9 cases. */

        // case 1: player1 chooses "rock" and player2 also chooses "rock", then this is a tie.
        if (strPlay1.equals("rock") && strPlay2.equals("rock"))
        {
           System.out.println("It is a tie.");
        }
        // case 2: player1 chooses "rock" and player2 chooses "scissors", then player1 wins.
        if (strPlay1.equals("rock") && strPlay2.equals("scissors"))
        {
           System.out.println("Player 1 wins.");
        }
        // Similar to the above 2 cases, please finish other 7 cases.
        if (strPlay1.equals("rock") && strPlay2.equals("paper"))
        {
           System.out.println("Player 2 wins.");
        }
        
        if (strPlay1.equals("paper") && strPlay2.equals("rock"))
        {
           System.out.println("Player 1 wins.");
          
        }
        
        if (strPlay1.equals("paper") && strPlay2.equals("paper"))
        {
           System.out.println("It is a Tie.");
        }
      
        if (strPlay1.equals("paper") && strPlay2.equals("scissors"))
        {
           System.out.println("Player 2 wins.");
           
        }
        
        if (strPlay1.equals("scissors") && strPlay2.equals("rock"))
        {
           System.out.println("Player 2 wins.");
        }
        
        if (strPlay1.equals("scissors") && strPlay2.equals("paper"))
        {
           System.out.println("Player 1 wins.");
        }
        
        if (strPlay1.equals("scissors") && strPlay2.equals("scissors"))
        {
           System.out.println("It is a tie.");
        }
        
        
        
 }
}
