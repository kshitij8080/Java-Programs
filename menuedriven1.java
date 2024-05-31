import java.util.*;
public class menuedriven1 {
    void cylinder(float r,float h) {
        float v = 3.14f*r*r*h;
        System.out.println("Volume of Cylinder:"+v);
    }
    void factorial(int n) {
        int i,f=1;
        for(i=1;i<=n;i++) {
            f=f*i;
        }
        System.out.println("Factorial of number:"+f);
    }
    void armstrong(int n) {
        int s,d,n1;
        n1=n;
        s=0;
        while(n>0) {
            d=n%10;
            s=s+(d*d*d);
            n=n/10;
        }
        if(s==n1)
          System.out.println("Number is Armstrong..");
        else
          System.out.println("Number is not Armstrong...");
    }
    public static void main(String[] args) {
        menuedriven1 ob=new menuedriven1();
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("1-cylinder \n 2-factorial \n 3-armstrong \n 4-exit");
            System.out.println("Enter Choice:");
            ch=sc.nextInt();
            switch(ch) {
                case 1: System.out.println("Enter Radius:");
                        int r=sc.nextInt();
                        System.out.println("Enter Height:");
                        int h=sc.nextInt();
                        ob.cylinder(r,h);
                        break;
                case 2: System.out.println("Enter Number:");
                        int n=sc.nextInt();
                        ob.factorial(n);
                        break;
                case 3: System.out.println("Enter Number:");
                        n=sc.nextInt();
                        ob.armstrong(n);
                        break;
                case 4: System.exit(0);
                        sc.close();
            }
        }while(ch<5);
    }
}
