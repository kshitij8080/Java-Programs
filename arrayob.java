import java.util.*;
public class arrayob {
    public static void main(String[] args) {
        int[]a=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        int n=sc.nextInt();
        System.out.println("Enter n numbers:");
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Numbers:");
        for(int i=0;i<n;i++) {
            System.out.println(a[i]+" ");
        }
        sc.close();
    }
}
