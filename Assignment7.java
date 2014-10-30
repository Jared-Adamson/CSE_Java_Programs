//  Name: Jared Adamson
//  Description: This class prompts a user to enter a size for the array
//                and create a NumberCollection object. Then it displays
//                a menu to a user, and process a requested task accordingly.
//----------------------------------------------------------------------*/
/*
 * 1. Which of the following are valid array declarations? Explain your answers. (2 pts)
a. char[] charArray = new char[26];
* Answer: This is valid.  Proper santax. 
* b. int[] words = new words[10];
* Answer: Not Valid bad santax new words[10]
* c. char[] charArray = "Computer Science";
* Answer: not valid, "Computer Science is not a char and bad santax.
* d. double[3] nums = {3.5, 35.1, 32.0};
 * Answer: This is Vaild, makes an array of 3 with the given values.
 * 
 * 2. Write the output of the following program: (2 pts)
public class Hw7
{ 
public static void main(String[] args) { 
int[] x = {0, 1, 2, 3, 4, 5};
xMethod(x, 5);}
public static void xMethod(int[] x, int length) 
{ 
for (int i = 0; i < length; i++)
System.out.print(" " + x[i]);
}
}
* Answer: 0 1 2 3 4 5
* 
3. Write the output of the following code: (2 pts)
public class Hw7
{ 
public static void main(String[] args) 
{ 
int[] x = new int[5]; 
for (int i = 0; i < x.length; i++)
x[i] = i;
System.out.println(x[i]);
}
}
* Answer: 
* 1
* 2
* 3
* 4
* 
* 
4. Find and fix all errors in the following program: (2 pts)
//Fixed code:
* public class Hw7 {
public static void main(String[] args) {
double[] list = {3, 4, 5, 6.3};
xMethod(list); 
}
public static double xMethod(double[] list) {
double sum = 0;
for (int i=0; i < list.length; i++) {
sum += list[i];
}
return sum;
}
}
* 
* 
 */

import java.util.Scanner;
 public class Assignment7
 {
  public static void main(String[] args)
   {
      int number, size;
      String choice;
      char command;

      Scanner keyboard = new Scanner(System.in);
      // ask a user for a array size
      System.out.println("Please enter a size for the array.\n");
      size = keyboard.nextInt();

      // instantiate a NumberCollection object
      NumberCollection collection = new NumberCollection(size);

      // print the menu
      printMenu();

      do
       {
           // ask a user to choose a command
           System.out.println("\nPlease enter a command or type ?");
           choice = keyboard.next().toLowerCase();
           command = choice.charAt(0);

           switch (command)
            {
                 case 'a': // add a number
                      System.out.println("\nPlease enter an integer to add.");
                      number = keyboard.nextInt();
                      collection.addNumber(number);
                      break;
                 case 'b': // remove a number
                      System.out.println("\nPlease enter an integer to remove.");
                      number = keyboard.nextInt();
                      collection.removeNumber(number);
                      break;
                 case 'c': // display the array
                      System.out.print(collection);
                      break;
                 case 'd': // compute and display the maximum
                      System.out.println("\nThe maximum is: " + collection.findMax());
                      break;
                 case 'e': // compute and display the minimum
                      System.out.println("\nThe minimum is: " + collection.findMin());
                      break;
                 case 'f': // compute and display the sum
                      System.out.println("\nThe sum is: " + collection.computeSum());
                      break;
                 case '?':
                      printMenu();
                      break;
                 case 'q':
                      break;
                 default:
                 	  System.out.println("Invalid input!");

            }

        } while (command != 'q');

    }  //end of the main method


  // this method prints out the menu to a user
  public static void printMenu()
   {
    System.out.print("\nCommand Options\n"
                   + "-----------------------------------\n"
                   + "a: add an integer in the array\n"
                   + "b: remove an integer from the array\n"
                   + "c: display the array\n"
                   + "d: compute and display the maximum\n"
                   + "e: compute and display the minimum\n"
                   + "f: compute and display the sum\n"
                   + "?: display the menu again\n"
                   + "q: quit this program\n\n");

    } // end of the printMenu method


 } // end of the class








