import java.util.*;
abstract class shape
{
    abstract void area();
    Scanner sc=new Scanner(System.in);
}
class Triangle extends shape
{
    void area()
    {
        System.out.println("enter base and height");
        float b=sc.nextFloat();
        float h=sc.nextFloat();
        float ans=(0.5f)*b*h;
        System.out.println("Area of triangle="+ans);
    }
}
class Reactangle extends shape
{
    void area()
    {
        System.out.println("enter length and breadth:");
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        float ans=l*b;
        System.out.println("area of reactangle="+ans);
    }
}
class MD
{
    public static void main(String args[])
    {
        Triangle ob=new Triangle();
        Reactangle ob1=new Reactangle();
        ob1.area();
        ob.area();

    }
}