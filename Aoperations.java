import java.util.Scanner;
public class Aoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int a = sc.nextInt();
        System.out.println("Enter Number 2:");
        int b= sc.nextInt();
        sc.close();
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        System.out.println("Addition="+c);
        System.out.println("Subtraction="+d);
        System.out.println("Multiplication="+e);
        System.out.println("Division="+f);
    }
}