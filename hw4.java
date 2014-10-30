import java.util.Scanner;
import java.util.ArrayList;
public class hw4
{

   public static void main(String [] args)
   {
      String month;
      double[] snowfall=new double[12];
      double[] rainfall=new double[12];
      String[] months = {"January", "February", "March", "April", "May", "June" , "July", "August", "September", "October", "November", "December"};
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> min = new ArrayList<Integer>();
      ArrayList<Integer> max = new ArrayList<Integer>();


      System.out.println("Please enter the city:");
      month=scan.nextLine();

      System.out.println("\t\t Entering rainfall");
      System.out.println("\t\t =================\n\n");
      for(int i = 0 ; i < 12 ; i++)
      {
        System.out.print("Enter the rainfall for the month of " + months[i] + "  ");
        rainfall[i]=scan.nextDouble();

      }

      System.out.println("\t\t Entering snowfall");
      System.out.println("\t\t =================\n\n");
      for(int i = 0 ; i < 12 ; i++)
      {
              System.out.print("Enter the snowfall for the month of " + months[i] + " ");
              snowfall[i]=scan.nextDouble();

      }



    // find the lowest rainfall and the location (array index) at witch lowest rainfall
    // occur
      double lowestr=rainfall[0];
      int li=0;
      for(int i = 0 ; i < 12 ; i++)
      {
        if(lowestr > rainfall[i])
        lowestr=rainfall[i];
        li=i;
      }


      // search the rainfall array to find locations at witch lowest rainfall occur and store these
      //locations in min array list
      for(int i = 0 ; i < 12 ; i++)
	  {
	          if(lowestr == rainfall[i])
	          min.add(i);
      }


     // find the Highest snowfall and the location (array index) at witch Highest snowfall
    // occur
      double heigsnow=snowfall[0];
      int hi=0;
      for(int i = 0 ; i < 12 ; i++)
      {
              if(heigsnow > snowfall[i])
              heigsnow=snowfall[i];
              hi =i;
      }

     // search the rainfall array to find locations at witch Highest snowfall occur and store these
      //locations in max array list

     for(int i = 0 ; i < 12 ; i++)
	  {
	          if(heigsnow == snowfall[i])
	          max.add(i);
      }




      System.out.println("\n Lowest rainfall =" + lowestr + "  was occured  in  " + min.size() + " months and months are");
      for(int i=0 ; i <min.size() ; i++)
      {
		System.out.print(months[min.get(i)] + "   ");
	  }

       System.out.println();

      System.out.println("\n Highest  rainfall =" + lowestr + "  was occured  in  " + max.size() + " months and months are");
	        for(int i=0 ; i <max.size() ; i++)
	        {
	  		System.out.print(months[max.get(i)] + "   ");
	  }

  }
  }

