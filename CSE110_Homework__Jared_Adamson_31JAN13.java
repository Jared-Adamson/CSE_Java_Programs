/*

Jared Adamson
CSE 110
Assignment 1
31 - Jan - 2013

1. [2 Points] Briefly explain the problem solving and program development process (no more than ½ page).

First there needs to be a problem to solve then ideas are generated to solve the issue.  a general outline is made and sudo code.
Then the program is made.  From there testing and refining is done until your have a working solution.



2.  [2 Points] Why do we need to compile java programs before executing them? Clearly explain your answer.

Java is a high level language is must be broken down into a machine level language so the computer or virtual machine can understand
and exicute the instructions. This is what the compiler does.

  */

  public class MadLibs
  {
  public static void main(String[] args)
  {
  System.out.print("Make a mad lib!");

  System.out.print("Enter your instructors name:");

  	string strInstructor = in.next0;

 System.out.print("Enter your name:");

  	string strName = in.next();

 System.out.print("Enter a food:");

 	 string strFood = in.next();

 System.out.print("Enter a number between 100 and 200:");

 	 int intNumber = in.next();

  System.out.print("Enter an adjective:");

 	 string strAdjective = in.next();

  System.out.print("Enter a color:");

  	string strColor = in.next();

 System.out.print("Enter an animal:");

  	string strAnimal = in.next();

  System.out.print("I am sorry that I am unable to turn in my homework at this time. First, I ate a rotten", strFood, ", which made me turn" , strColor, " and extremely ill. I come down with a fever of" intNumber, ". Next, my" , strAdjective, " pet", strAnimal," must have smelled the remains of the ", strFood, "  on my homework, because he ate it. I am currently rewriting my homework and hope you will accept it here.
  Sincerely,"
  ,
  strName);

  }
}

/*
BMI Calculator

import java.util.*;
public class BMICalc
{


    public static void main(String[] args)
{
        Scanner input=new Scanner(System.in);

        System.out.print("Enter height in feet and inches (Example - 5 foot 10 inches enter 5 10): ");

        int intFeet = input.nextInt();

        int intInches = input.nextInt();

       System.out.print("Enter your weight in pounds: ");

      int intWeight = input.nextInt();


        int intHeight = (intFeet * 12) + intInches;


        int intBmi = (intWeight * 703) /(intHeight * intHeight) ;

        System.out.println("Your BMI is: "+intBmi);
    }
}
*/