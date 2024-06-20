import java.util.*;
class NumberOutOfRange extends Exception
{
    public String toString()
    {
        return "Number is Out Of Range..";
    }
}
class Sumofdigit
{
    public static int s=0;
    public static void main(String args[])
    {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number:");
            int n=sc.nextInt();
            if(n>100)
                throw new NumberOutOfRange();

            while(n>0)
            {
               int d=n%10;
               s=s+d;
               n=n/10;
            }
            System.out.println("Addition of digit="+s);
        }
        catch(NumberOutOfRange e)
        {
            System.out.println(e);
        }
    }
}