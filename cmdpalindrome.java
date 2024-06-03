public class cmdpalindrome {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer(args[0]);
		StringBuffer s2=new StringBuffer(args[1]);
		StringBuffer s3=new StringBuffer();
		s3=s1.reverse();
		int k=s3.compareTo(s2);
		
		if (k == 0) {
			System.out.println("String are palindrome..");
		} else {
			System.out.println("String are not palindrome..");
		}
	}
}
    

