import java.io.*;
class Demo
{
    public static void main(String args[])throws Exception
    {
        FileInputStream f1=new FileInputStream("abc.txt");
        
        int k;
        while((k=f1.read())!=-1)
        {
            System.out.print((char)k);
        }
        f1.close();
        System.out.println("file print Successfully..");
    }
}