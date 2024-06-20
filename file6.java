import java.io.*;
import java.util.*;
class Demo
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Source File Name:");
        String sf=sc.nextLine();
        System.out.println("Enter Destination File Name:");
        String df=sc.nextLine();
        FileInputStream f1=new FileInputStream(sf);
        FileOutputStream f2=new FileOutputStream(df);

        int k;
        while((k=f1.read())!=-1)
        {
            if(Character.isUpperCase(k))
                 f2.write(Character.toLowerCase((char)k));
            else if(Character.isLowerCase((char)k))
                 f2.write(Character.toUpperCase((char)k));
            else if(Character.isDigit((char)k))
                 f2.write('*');
            else
                f2.write(k);
        }

        f1.close();
        f2.close();

        System.out.println("opreation complete...");



    }
}