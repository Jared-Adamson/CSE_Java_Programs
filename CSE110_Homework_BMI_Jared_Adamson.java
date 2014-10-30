// Jared Adamson

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
    }hygfh
}
