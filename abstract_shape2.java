abstract class shape
{
   abstract void calc_area();
    abstract void calc_volume();
}
class Sphere extends shape
{
    float r;
    Sphere(float r)
    {
         this.r=r;
    }
    public void calc_area()
    {
        float ans=4*3.14f*r*r;
        System.out.println("area of Spahere="+ans);
    }
  public  void calc_volume()
    {
        float ans=4/3*3.14f*r*r*r;
        System.out.println("volume of spahere="+ans);
    }
}
class Cone extends shape
{
    float r,h;
    Cone(float r,float h)
    {
        this.r=r;
        this.h=h;
    }
    void calc_area()
    {
        float ans=(float)3.14f*r*(r+h);
        System.out.println("area of Cone="+ans);
    }
    void calc_volume()
    {
        float ans=(float)(1/3)*3.14f*(r*r*h);
        System.out.println("volume of cone="+ans);
    }
}
class MD
{
    public static void main(String args[])
    {
    Sphere ob=new Sphere(3.5f);
    ob.calc_area();
    ob.calc_volume();
    Cone ob1=new Cone(4.5f,6.5f);
    ob1.calc_area();
    ob1.calc_volume();
    }
}