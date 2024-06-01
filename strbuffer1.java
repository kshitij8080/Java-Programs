public class strbuffer1 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Mauli");
		StringBuffer s2=new StringBuffer("Mauli");
		StringBuffer s3=new StringBuffer("Mauli");
		StringBuffer s4=new StringBuffer("Mauli");
		
		s1.deleteCharAt(2);
		s2.insert(2,55);
		s3.append(55);
		s4.reverse();
		System.out.println("After Delete char="+s1);
		System.out.println("After insert="+s2);
		System.out.println("After append="+s3);
		System.out.println("After reverse="+s4);
		
	}
}
