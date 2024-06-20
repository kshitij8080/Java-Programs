abstract class A
{
    int n;
     A()
     {
       n=5;
     }
   abstract void add(int a,int b);
    void square(int n)
    {
        int s=n*n;
        System.out.println("Square of number="+s);
    }
}
class B extends A
{
    void add(int a,int b)
    {
        int c=a+b;
        System.out.println("addition="+c);
    }
    public static void main(String args[])
    {
           B ob=new B();
           ob.square(5);
           ob.add(10,61);
    }
}