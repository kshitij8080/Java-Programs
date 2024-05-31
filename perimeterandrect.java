public class perimeterandrect {
    void perimeter(float l,float b) {
        float n=l*b;
        System.out.println("perimeter of rectangle:"+n);
    }
    void area(float l,float b) {
        float n=2*(l+b);
        System.out.println("Area of rectangle:"+n);
    }
    public static void main(String[] args) {
        perimeterandrect ob = new perimeterandrect();
        ob.perimeter(10.4f, 5.5f);
        ob.area(5.10f, 04.3f);
    }
}