import java.util.*;
import java.io.*;
class Demo
{
    public static void main(String args[])throws Exception
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Source file name:");
       String sf=sc.nextLine();
       System.out.println("Enter Destination File name:");
       String df=sc.nextLine();
       FileReader f1=new FileReader(sf);
       FileWriter f2=new FileWriter(df);
       BufferedReader br=new BufferedReader(f1);
       BufferedWriter bw=new BufferedWriter(f2);
       String s1="";
       while((s1=br.readLine())!=null)
       {
           bw.write(s1+"\n");
       }

       bw.write("Comment:End of File..");
       br.close();
       bw.close();
       f1.close();
       f2.close();
       
       System.out.println("opreation complete....");

    }
}