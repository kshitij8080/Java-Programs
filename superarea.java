import java.util.*;
class cylinder {
  float r,h;
  Scanner sc=new Scanner(System.in);
  void area() {
    System.out.println("Enter Radius & Height:");
    r=sc.nextFloat();
    h=sc.nextFloat();
    float c = 2*3.14f*r*h+2*3.14f*r*r;
    System.out.println("Area of Cylinder:"+c);
  }
}
class circle extends cylinder {
  void area() {
    System.out.println("Enter Radius:");
    float r=sc.nextFloat();
    float c = 3.14f*r*r;
    System.out.println("Area of circle:"+c+"\n");
    super.area();
  }
}
class MD {
  public static void main(String[] args) {
    circle ob=new circle();
    ob.area();
  }
}
