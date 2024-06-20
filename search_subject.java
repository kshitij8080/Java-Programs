import java.util.*;
class Teacher
{
    int tid;
    String tname,desig,subject;
    float sal;

    void accept()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter teacher id:");
       tid=sc.nextInt();
       System.out.println("enter teacher name:");
       tname=sc.next();
       System.out.println("enter teacher subject:");
       subject=sc.next();
       System.out.println("enter teacher designation:");
       desig=sc.next();
       System.out.println("enter teacher salary:");
       sal=sc.nextFloat();
    }
    void disp()
    {
        System.out.println("teacher id="+tid);
        System.out.println("teacher name="+tname);
        System.out.println("teacher subject="+tname);
        System.out.println("teacher designation="+desig);
        System.out.println("teacher salary="+sal);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        int n=sc.nextInt();
        Teacher ob[]=new Teacher[n];
        System.out.println("enter n teacher inforamation:");
        for(int i=0; i<n; i++)
        {
            ob[i]=new Teacher();
            ob[i].accept();
        }
        for(int i=1; i<n; i++)
        {
            if(ob[i].subject.equals("java"))
            {
                ob[i].disp();
            }
        }
    }
}