import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year To check:");
        int y = sc.nextInt();
        sc.close();
        if (y % 4 == 0) {
            System.out.println("Year is Leap.."+y);
        } else {
            System.out.println("Year is not Leap.."+y);
        }
    }
}