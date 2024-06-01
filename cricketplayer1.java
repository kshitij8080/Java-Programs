import java.util.*;
class CricketPlayer1
{
    String name;
    int pid,innings,notout,totalruns;
    float batavg;
     void accept()
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Player Id:");
       pid=sc.nextInt();
       System.out.println("Enter Name:");
       name=sc.next();
       System.out.println("Enter no of innings:");
       innings=sc.nextInt();
       System.out.println("Enter no of not out:");
       notout=sc.nextInt();
       System.out.println("Enter total runs:");
       totalruns=sc.nextInt();
       batavg=totalruns/(innings-notout); 
     }
   void disp()
   {
      System.out.println("Id="+pid);
      System.out.println("Player Name="+name);
      System.out.println("Innings="+innings);
      System.out.println("Not out="+notout);
      System.out.println("BAt Agerage="+batavg);
   }  
  public static void main(String arg[])
{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Limit:");
     int n=sc.nextInt();
   CricketPlayer1 ob[]=new CricketPlayer1[n]; 
    for(int i=0;i<n;i++)
     {
       ob[i]=new CricketPlayer1();
       ob[i].accept();
     }
   float max=ob[0].batavg;
   int index=0;
   for(int i=0;i<n;i++)
   {
      if(ob[i].batavg>max)
      {
        max=ob[i].batavg;
        index=i;
      }
   }
   ob[index].disp();
}
}