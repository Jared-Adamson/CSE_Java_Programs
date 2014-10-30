package javaapplication2;

/**
 *
 * @author Jared Adamson
 */ 
import java.util.*;

public class JavaApplication2 {

   


    public static void main(String[] args) {
        // TODO code application logic here
String g = "ABCD";
int j = 0;
 String[] strArray = {"abcd", "abdc", "bcda"};
for (String search : strArray)
{

    if (search.toLowerCase().contains(g.toLowerCase()))
    {
       
    j = 1;
    }   
}
  if (j == 1)
          System.out.println(g +" is in the Array");
else 
        System.out.println(g+ " is not in the Array"); 
    }
}

