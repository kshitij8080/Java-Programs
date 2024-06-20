import java.util.*;
class NumberisSmallException extends Exception
{
    public String toString()
    {
        return "number is Small..";
    }
}
class NumberisGreaterException extends Exception
{
    public String toString()
    {
        return "number is Greater..";
    }
}
class Demo
{
    public static void main(String args[])
    {
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        if(n<5)
           throw new NumberisSmallException();
        else if(n>10)
           throw new NumberisGreaterException();

        int f=1;
        for(int i=1; i<=n; i++)
        {
            f=f*i;
        }
        System.out.println("factorial of number="+f);
        }
        catch(NumberisGreaterException e)
        {
            System.out.println(e);
        }
        catch(NumberisSmallException e1)
        {
            System.out.println(e1);
        }
    }
}