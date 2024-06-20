import java.util.*;
class InvalidAgeException extends Exception
{
    public String toString()
    {
        return "Invalid age Exception";
    }
}
class Voter
{
   public static void main(String args[])
   {
        try{
         Scanner sc=new Scanner(System.in);
         System.out.println("enter age to check:");
         int age=sc.nextInt();
         if(age<18)
            throw new InvalidAgeException();

        System.out.println("Voter is Eligible for voting="+age);
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
   }
}