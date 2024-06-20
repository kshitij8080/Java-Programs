import java.util.*;
class NumberisZero extends Exception
{
    public String toString()
    {
        return "Number is Zero..";
    }

}
class Number
{
    public static void main(String args[])
    {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number to Check:");
            int num=sc.nextInt();
            if(num==0)
                 throw new NumberisZero();
            int n=num;
            int rev=0;
            while(n>0)
            {
                int d=n%10;
                rev=(rev*10)+d;
                n=n/10;
            }
            if(num==rev)
              System.out.println("number is plaindrome....");
            else
               System.out.println("number is not plaindrome...");
            
            }
            catch(NumberisZero e)
            {
                System.out.println(e);
            }
            catch(Exception e1)
            {
                System.out.println("Inavlid number");
            }
    }
}