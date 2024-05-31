import java.util.Scanner;

public class staticarmstrong {
    static void armstrong(int n) {
        int n1=n;
        int s=0;
        while(n>0) {
            int d=n%10;
            s=s+(d*d*d);
            n=n/10;
        }
        if(s==n1) {
            System.out.println("Number is armstrong:"+n1);
        } else {
            System.out.println("Number is not Armstromg:"+n1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        sc.close();
        armstrong(n);
    }
}