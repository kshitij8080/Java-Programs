
public class classarea {
    float a;
    void circle (float r) {
        a = 3.14f*r*r;
        System.out.println("Area of circle="+a);
    }
    void rectangle (float l,float h) {
        a = l * h;
        System.out.println("Area of rectangle="+a);
    }
    void square (float s) {
        a = s * s;
        System.out.println("Area of Square="+a);
    }
    public static void main(String[] args) {
        classarea ob = new classarea();
        ob.circle(5.5f);
        ob.rectangle(5.5f,10.5f);
        ob.square(10.10f);
    }
}
