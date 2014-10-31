// Author: Jared Adamson
// Title: Lab 2

import java.util.Scanner;
public class Lab2
{
   public static void main(String[] args)
   {


     Scanner keyboard = new Scanner(System.in);

     final int BASE_HEIGHT = 60, BASE_WEIGHT_MAN=106, BASE_WEIGHT_WOMAN=100, WEIGHT_FACTOR_MAN=6, WEIGHT_FACTOR_WOMAN=5, IN_PER_FOOT=12;
     int feet, inches, totalHeight_in_Inches, ideal_weight_man, ideal_weight_woman;

     System.out.println("Enter the height feet followed by inches (eg: 5 3): ");

     feet = keyboard.nextInt();
     inches = keyboard.nextInt();

     totalHeight_in_Inches = feet*IN_PER_FOOT + inches;


     ideal_weight_man = BASE_WEIGHT_MAN + (totalHeight_in_Inches - BASE_HEIGHT)*WEIGHT_FACTOR_MAN;

     ideal_weight_woman = BASE_WEIGHT_WOMAN + (totalHeight_in_Inches - BASE_HEIGHT)*WEIGHT_FACTOR_WOMAN;


     System.out.println("Your ideal weight should be "+ ideal_weight_man + " if you are a man");
     System.out.println("Your ideal weight should be "+ ideal_weight_woman + " if you are a woman");




 }
}
