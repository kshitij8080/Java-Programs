import java.util.*;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string 1:");
		StringBuffer s1=new StringBuffer(sc.nextLine());
		System.out.println("Enter string 2:");
		StringBuffer s2=new StringBuffer(sc.nextLine());
		StringBuffer s3=new StringBuffer();
		s3=s1.reverse();
		sc.close();
		
		int k=s3.compareTo(s2);
		
		if (k == 0) {
			System.out.println("String are palindrome..");
		} else {
			System.out.println("String are not palindrome..");
		}
	}
}
