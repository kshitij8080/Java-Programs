class Demo
{
    public static void main(String args[])
    {
        try
        {
            int a=10;
            int b=50/0;
            System.out.println("value of a="+a);
            System.out.println("Division a="+b);
        }
        catch(Exception e)
        {
           System.out.println("Error="+e);
        }
    }
}