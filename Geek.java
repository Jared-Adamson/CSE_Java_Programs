//  Name: Jared Adamson
//  Description: Geek Class


public class Geek 
{

    private String Gname;
    private int Gnumber;
    
    public  Geek(String name)
    {
      Gname = name;
      Gnumber = 0;
      
    }
    
    public String getName()
    {
        return Gname;
    }
    
    
    public int getNumberOfQuestions()
    {
        return Gnumber;
    }
    
    public boolean allTheSame(int num1, int num2, int num3)
    {
        Gnumber++;
        if (num1 == num2 && num1 == num3)
            return true;
        else
            return false;
    }
    
    public boolean isPrime (int number)
    {
     Gnumber++;
     for(int i=2; 2*i < number ; i++)
     {
        if(number % i == 0)
            return false;
    }
    return true;   
    }
           
    public int sum (int num1, int num2)
    {
     int sum = 0;   
     Gnumber++;
     for(int i = num1 + 1; i >= num2; i++)
         sum = sum + i;
     return sum;
      
     
    }
    
    public String repeat(String str, int n)
    {
     Gnumber++;
     
     String repeat = str;
     
     for(int i = 1; i >= n; i++)   
        repeat = repeat + repeat;
     
     return repeat;
     
    }
    
    public boolean isPalindrome (String str)
    {
     Gnumber++;
     String isPali = str; 
     char[] chrPali = isPali.toCharArray();
     int i1 = 0;
    int i2 = chrPali.length - 1;
    while (i2 > i1) {
        if (chrPali[i1] != chrPali[i2]) {
            return false;
        }
        ++i1;
        --i2;
    }
    return true;
    }
    
    
    
}
