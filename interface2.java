interface I1 {
	void add(int a,int b);
	void square(int n);
}
interface I2 {
	void cube(int n);
}
class I3 implements I1,I2 {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("Addition="+c);
	}
	public void square(int n) {
		int c=n*n;
		System.out.println("Square="+c);
	}
	public void cube(int n) {
		int c=n*n*n;
		System.out.println("Cube="+c);
	}
}
public class interface2 {
	public static void main(String[] args) {
		I3 ob=new I3();
		ob.add(10,20);
		ob.square(5);
		ob.cube(3);
	}
}
