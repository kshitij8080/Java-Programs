import java.util.Scanner;

public class multitable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number For Multiplication Table:");
        int n = sc.nextInt();
        System.out.println("Multiplication table of: " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
        }
        sc.close();
    }
}