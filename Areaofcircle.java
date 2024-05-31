import java.util.*;
public class Areaofcircle {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        float r = sc.nextFloat();
        sc.close();
        float a = 3.14f*r*r;
        System.out.println("Area of circle="+a);
    }
}
