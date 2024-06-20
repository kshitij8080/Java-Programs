import java.util.*;
class city
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        int n=sc.nextInt();
        String a[]=new String[n];
        System.out.println("enter n city names:");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.next();
        }
        System.out.println("citys is sorted order=");
        for(int pass=1; pass<n; pass++)
        {
            for(int i=0; i<n-pass; i++)
            {
                if((a[i].compareTo(a[i+1]))<0)
                {
                String t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                }
            }
        }
        for(int i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }
    }
}