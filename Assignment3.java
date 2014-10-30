// AUTHOR: Jared Adamson
// SPECIFICATION: description of the program CSE 110 - Homework 3
/*
Part 1: Written Exercises: (4
pts)
1.
(2 pts)
Rewrite the following set of if statements using a nested if - else structure.
(page 96)
if (score >= 90) grade = 'A';
if (score >= 80 && score < 90) grade = 'B';
if (score >= 70 && score < 80) grade = 'C';
if (score >= 60 && score < 70) grade = 'D';
if (score < 60) grade = 'F';

* ANSWER: 
if (score >= 90)
Grade = 'A';
else if (score >= 80 && score < 90)
grade = 'B';
else if (score >= 70 && score < 80)
grade = 'C';
else if (score >= 60 && score < 70)
grade = 'D';
else 
Grade = 'f';
  
 
2. (2 pts)
Rewrite the following nested if
-
else statement as an equivalent
switch statement.
(page 99)

if (letter =='A'| | letter =='a')
System.out.println("Excellent");
else if (letter =='B'| | letter =='b')
System.out.println("You can do better");
else if (letter =='C'| | letter =='c')
System.out.println("Try harder");
else if (letter =='D'| | letter =='d')
System.out.println("Try much harder");
else 
System.out.println("Try another major!");
 
  ANSWER:
switch (letter)
{
 case 'A': System.out.println("Excellent"); break;
 case 'B': System.out.println("You csn do better"); break;
 case 'C': System.out.println("Try harder"); break;
 case 'D': System.out.println("Try Much harder"); break;
 default:  System.out.println("Try another major"); break;
 }
 */
import java.util.Scanner;

public class Assignment3 {

   
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int intComp = 0;
        // Ask for two strings to compaire
        System.out.println("Please Enter a String:");
        String usrString1 = scan.next();
        System.out.println("Please Enter Another String:");
        String usrString2 = scan.next();
        
        //Checks if each string's length is odd or even.
        if (usrString1.length() %2 == 0)
            System.out.println("Your First String is Even");
        else
            System.out.println("Your First String is Odd");
        
        if (usrString2.length() %2 == 0)
            System.out.println("Your Second String is Even");
        else
            System.out.println("Your Second String is Odd");
        
        //Checks if two strings are same or different.
        if (usrString1.equals(usrString2))
            System.out.println("Your Strings are the Same");
        else
            System.out.println("Your Strings are Diffrent");

        //Checks which string is lexically larger, or they are same.
         intComp = usrString1.toLowerCase().compareTo(usrString2.toLowerCase());
         if (intComp > 0)
            {
              System.out.println("Your Fist Strings is Lexically Larger By: " + intComp);  
            } 
         else
         {
             if (intComp < 0)
               System.out.println("Your Fist String is Lexically Smaller By: " + (intComp));
            else
               System.out.println("Your Strings are Lexically the Same");  
         }  
        
        //Prints out the first character (index 0) of each string
         System.out.println("The First Character of your First String is: " + usrString1.substring(0,1)); 
         System.out.println("The First Character of your Second String is: " + usrString2.substring(0,1)); 
       
         //Prints out a new string consisting of the first string concatenated (appended) with thesecond string.
         System.out.println("Your Two Strings Concatenated is: " + usrString1.concat(usrString2));
        
         // Prints out two strings using upper case letters.
        System.out.println("Your First String in Uppercase Letters: " + usrString1.toUpperCase());
        System.out.println("Your Second String in Uppercase Letters: " + usrString2.toUpperCase());
    }
}
