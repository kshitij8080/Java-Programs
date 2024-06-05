import java.util.*;
abstract class staff {
    String name,add;
    abstract void disp();
}
class fulltimestaff extends staff {
    String dept;
    int sal;
    fulltimestaff(String name,String add,String dept,int sal) {
        this.name=name;
        this.add=add;
        this.dept=dept;
        this.sal=sal;
    }
    void disp(){
    	System.out.println("Staff name:"+name);
    	System.out.println("Staff address:"+add);
    	System.out.println("Staff department:"+dept);
    	System.out.println("Staff salary:"+sal);
    }
}

class parttimestaff extends staff {
    int hours,rate;
    parttimestaff(String name,String add,int hours,int rate) {
    	this.name=name;
    	this.add=add;
    	this.hours=hours;
    	this.rate=rate;
    }
    void disp() {
    	System.out.println("Staff name:"+name);
    	System.out.println("Staff address:"+add);
    	System.out.println("Staff no of hours:"+hours);
    	System.out.println("Staff rate per hour:"+rate);
    }
}

class MD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        
        fulltimestaff ob[]=new fulltimestaff[n];
        parttimestaff ob1[]=new parttimestaff[n];
        int ch;
        do{
            System.out.println("Enter Choice \n 1-FullTime \n 2-PartTime:");
            ch=sc.nextInt();
            switch(ch) {
                case 1: for(int i=0;i<n;i++) {
                            System.out.println("Enter Name:");
                            String name=sc.next();
                            System.out.println("Enter address:");
                            String add=sc.next();
                            System.out.println("Enter department:");
                            String dept=sc.next();
                            System.out.println("Enter salary:");
                            int sal=sc.nextInt();
                              ob[i]=new fulltimestaff(name,add,dept,sal);
                        }
                        for(int i=0;i<n;i++) {
                            ob[i].disp();
                        }
                        break;
                case 2: for(int i=0;i<n;i++) {
                            System.out.println("Enter Name:");
                            String name=sc.next();
                            System.out.println("Enter address:");
                            String add=sc.next();
                            System.out.println("Enter Number of hours:");
                            int hours=sc.nextInt();
                            System.out.println("Enter Rate per hours:");
                            int rate=sc.nextInt();
                              ob1[i]=new parttimestaff(name,add,hours,rate);
                        }
                        for(int i=0;i<n;i++) {
                            ob1[i].disp();
                        }
                        break;
            }
        }while(ch<3);
    }
}
