import java.io.*;
//import java.util.*;
class Demo
{
    public static void main(String args[])throws Exception
    {
        FileInputStream f1=new FileInputStream(args[0]);
        FileOutputStream f2=new FileOutputStream(args[1]);

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