//  Name: Jared Adamson
//  Description:: This program shows an N and Out menu with prices then allow the customer to
// order there food, then computer the total price.
 

/*
 Part 1 Answers
  
1. (1 pt)Write a statement that prints the number of characters in a String object called myString
(Page 63)

Answer:
int strCount = myString.length();
System.out.println(strCount);

2. (2 pts.)Write statements to prompt for and read user’s age using Scanner variable (page 48)

Answer:   
Scanner scan = new Scanner(system.in);
System.out.println("What is your age?")
int intAge = scan.nextInt(); 
System.out.println("Your age is: " + intAge)

3. (2 pts.)What does the following statement sequence print? (page 63)
String str = “Harry”;
int n = str.length();
String mystery = str.substring(0,1) + str.substring(n-1, n);
System.out.println(mystery);
 
  Answer:  Hy
 
 
 
 
 */
import java.text.NumberFormat;
import java.lang.*;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
// Scanner for taking inputs from user
        Scanner scan = new Scanner(System.in);

// Variables to store user order inputs
 int intHam;
 int intCheese;
 int intFry;
 int intDrink;

// Prints out the Burger menu for the user.        
System.out.println("Welcome to the In-N-Out Burger menu:" +
"\n------------------------------------------------------" +
"\nHamburger:\t  $2.75" + 
"\nCheeseburger:\t  $3.25" + 
"\nFrench Fries:\t  $2.50" + 
"\nShake & Beverage: $1.50" );


// Asks user questions to take their order, then stores order are variables to compute price.
System.out.println("How many hamburger(s)would you like to buy?");

intHam = scan.nextInt();

System.out.println("How many cheeseburger(s) would you like to buy?");

intCheese = scan.nextInt();

System.out.println("How many French fries would you like to buy?");

intFry = scan.nextInt();

System.out.println("How many drinks would you like to buy? ");

intDrink = scan.nextInt();

 // The program will now compute the cost of the order.
double costH = intHam * 2.75;
double costC = intCheese * 3.25;
double costF = intFry * 2.5;
double costD = intDrink * 1.5;
// Create number format instance to make it easer to format a viriety of numbers.

NumberFormat nf = NumberFormat.getCurrencyInstance(); 

// Program prints price for each type ordered and the total converting it into Currency Format.
System.out.println("\nTotal cost for Hamburgers: "+ nf.format(costH) + "\nTotal cost for Cheeseburgers: " +
nf.format(costC) + "\nTotal cost for Frys: " + nf.format(costF) + "\nTotal cost for Drinks: " +
nf.format(costD) + "\nOrder Total: " + nf.format(costH + costC + costF + costD));


        
        
    }
}
