public class mynumber {
	private int n;
	mynumber()
	{
		n=0;
	}
	mynumber(int n)
	{
		this.n=n;
	}
	int isNegative()
	{
		if(n<0)
			return 1;
		else
			return 0;
	}
	boolean isPositive()
	{
		if(n>0)
			return true;
		else
			return false;
	}
	boolean isZero()
	{
		if(n==0)
			return true;
		else
			return false;
	}
	boolean isOdd()
	{
		if(n%2==1)
			return true;
		else
			return false;
	}
	boolean isEven()
	{
		if(n%2==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		mynumber ob=new mynumber();
		if(ob.isNegative()==1)
			System.out.println("Number is -ve");
		if(ob.isPositive())
			System.out.println("Number is +ve");
		if(ob.isZero())
			System.out.println("Number is 0");
		if(ob.isOdd())
			System.out.println("Number is odd");
		if(ob.isEven())
		System.out.println("Number is Even");
		
		System.out.println("Calling Parameterized Constructor:");
		
		mynumber ob1=new mynumber(5);
		if(ob1.isNegative()==1)
			System.out.println("Number is -ve");
		if(ob1.isPositive())
			System.out.println("Number is +ve");
		if(ob1.isZero())
			System.out.println("Number is 0");
		if(ob1.isOdd())
			System.out.println("Number is odd");
		if(ob1.isEven())
		System.out.println("Number is Even");
	}
}
