import java.util.Scanner;
public class Maxof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int a = sc.nextInt();
        System.out.println("Enter Number 2:");
        int b = sc.nextInt();
        System.out.println("Enter Number 3:");
        int c = sc.nextInt();
        sc.close();
        int max, min;
        if(a>=b && a>=c) {
            max = a;
        } else if (b>=a && b>=c) {
            max = b;
        } else {
            max = c;
        }
        if (a<=b && a<=c) {
            min = a;
        } else if (b<=a && b<=c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("Maximum number="+max);
        System.out.println("Minimum number="+min);
    }
}