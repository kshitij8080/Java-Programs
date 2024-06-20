import java.util.*;
class InavlidPanException extends Exception
{
    public String toString()
    {
        return "Invalid Pan Number..";
    }
}
class InvalidMobException extends Exception
{
    public String toString()
    {
        return "Invalid Mobile Number..";
    }
}
class Demo
{
    public static void main(String args[])
    {
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter PAN number:");
        String pan=sc.next();
        if(pan.length()>10)
               throw new InavlidPanException();
        for(int i=0; i<5; i++)
        {
            if(!Character.isUpperCase(pan.charAt(i)))
            {
                throw new InavlidPanException();
            }
        }
        for(int i=5; i<9; i++)
        {
            if(!Character.isDigit(pan.charAt(i)))
        {
                throw new InavlidPanException();
        }
        }
        if((!Character.isUpperCase(pan.charAt(9))))
        {
            throw new InavlidPanException();
        }
        System.out.println("Enter mobile NUmber:");
        String mob=sc.next();
        if(mob.length()!=10)
             throw new InvalidMobException();

        System.out.println("PAN NUMBER="+pan);
        System.out.println("MOBILE Number="+mob);
    }
    catch(InavlidPanException e)
    {
        System.out.println(e);
    }
    catch(InvalidMobException e1)
    {
        System.out.println(e1);
    }
    }
}