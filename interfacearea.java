interface Shape {
  void area();
}

class Rectangle implements Shape {
   double length;
   double width;

   Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
   }
    void area() {
    return length * width;
  }
}
class MD{
  public static void main(String[] args) {
    Rectangle ob = new Rectangle(5, 2);
    void area = rectangle.area();
    System.out.println("Area of rectangle: " + area);
  }
}
