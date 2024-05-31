import java.util.*;
 class menuedriven {
    void factorial(int n) {
        int f = 1,i;
        for( i=1;i<=n;i++) {
            f = f * i;
        }
        System.out.println("factorial:"+f);
    }
    void perfect(int n) {
        int s = 0,i,r;
        for(i=1;i<=n;i++) {
            r=n%i;
            if(r==0) {
               s=s+i;
            }
        }
        if(s==n){
            System.out.println("Number is perfect");
        }
        else {
            System.out.println("Number is not perfect");
        }
    }
    void armstrong(int n) {
        int s=0,r,temp;
        temp = n;
        while(n>0) {
            r=n%10;
            s=s+(r*r*r);
            n=n/10;
        }
        if(temp == s) {
            System.out.println("Number is Armstrong:");
        }
        else {
            System.out.println("Number is not Armstrong:");
        }
    }
    public static void main(String[] args) {
        menuedriven ob = new menuedriven();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1-factorial \n 2-perfect \n 3-armstrong \n 4-exit");
            System.out.println("Enter Choice:");
            ch = sc.nextInt();
            switch(ch) {

               case 1: System.out.println("Enter Number:");
                    int n=sc.nextInt();
                    ob.factorial(n);
                    break;
               case 2: System.out.println("Enter Number:");
                     n =sc.nextInt();
                    ob.perfect(n);
                    break;
               case 3: System.out.println("Enter Number:");
                    n =sc.nextInt();
                    ob.armstrong(n);
                    break;
               case 4: System.exit(0);
               sc.close();
            }
        }while(ch<5);
    }
}