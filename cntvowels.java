import java.util.*;
public class cntvowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s1=sc.nextLine();
        sc.close();
        for (int i=0;i<s1.length();i++) {
            if(s1.charAt(i)=='A' || s1.charAt(i)=='a' || s1.charAt(i)=='E' || s1.charAt(i)=='e' ||
                    s1.charAt(i)=='I' || s1.charAt(i)=='i' || s1.charAt(i)=='O' || s1.charAt(i)=='o' ||
                    s1.charAt(i)=='U' || s1.charAt(i)=='u') {
                System.out.print(s1.charAt(i));
            }
        }
    }
}