import java.util.*;
public class strcmp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1:");
		String s1=sc.nextLine();
		System.out.println("Enter String 2:");
		String s2=sc.nextLine();
		sc.close();
		
		int k=s1.compareTo(s2);
		if (k == 0)
			System.out.println("Strings are same...");
		else if(k>0)
			System.out.println("Strin 1 is greater...");
		else
			System.out.println("String 2 is greater...");
	}
}
