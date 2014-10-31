//  Name: Jared Adamson
//  Description: Assignment 4

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment4
{

   public static void main(String[] args) throws FileNotFoundException
   {

	File infile= new File("hw4input.txt");
	int digit=0, word=0, upper=0, lower=0;
	String line;

	Scanner in =  new Scanner(infile);

	Scanner keyboard = new Scanner(System.in);

	PrintWriter out= new PrintWriter("hw4output.txt");

	out.println("\t\t String Analysis Report");
	out.println("\t\t =====================");

	while(in.hasNextLine())
	{

       line = in.nextLine();

       for(int i=0; i<line.length() ; i++)
       {
		   if(Character.isDigit(line.charAt(i)))
		   digit++;
		   else if(Character.isUpperCase(line.charAt(i)))
		   		upper++;
		   		else if (Character.isLowerCase(line.charAt(i)))
		   			 lower++;
		   			 else if(Character.isWhitespace(line.charAt(i)))
		   				  word++;


	   }

	    out.println(line);
	    out.println("Upper count =" + upper);
	    out.println("Lower count =" +lower);
	    out.println("digit count =" + digit);
	    out.println("word count =" + (word +1));
	    out.println("\n");

	    digit=0;
	    word=0;
	    upper=0;
	    lower=0;

    }


 	in.close();
 	out.close();

  }
}
