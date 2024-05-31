import java.util.*;
public class add {
    public static void main(String[] arg) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number 1:");
        int a = sc.nextInt();
        System.out.println("Enter Number 2:");
        int b = sc.nextInt();
        sc.close();
        int c = a + b;
        System.out.print("Addition="+c);
    }
}
