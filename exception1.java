class Demo
{
    public static void main(String args[])
    {
        try
        {
        int a[]=new int[5];
        System.out.println("create an array=");
        a[0]=11;
        a[1]=12;
        a[7]=55;
        System.out.println("insert values succefully.......");
        System.out.println("value="+a[7]);
        }
        catch(Exception e)
        {
            System.out.println("Error="+e);
        }
    }
}