public class replaceSTR {
	public static void main(String[] args) {
		String s1="Shrirampur";
		String s2=s1.replace("S","s");
		String s3=s1.replace("pur","city");
		
		String s4="India is my country";
		String s5=s4.replaceAll("India","Bharat");

		String s6=s4.replaceFirst("india","bharat");
		
		System.out.println("String="+s2);
		System.out.println("String="+s3);
		
		System.out.println("String="+s5);
		
		System.out.println("String="+s6);
	}
}
