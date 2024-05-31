class funover {
    void area(float r) {
        float c = 3.14f*r*r;
        System.out.println("Area of circle:"+c);
    }
    void area(float h,float b) {
        float c = 0.5f*h*b;
        System.out.println("Area of triangle:"+c);
    }
    void area(double l,double b) {
        double c = l*b;
        System.out.println("Area of rectangle:"+c);
    }
    public static void main(String[] args) {
        funover ob=new funover();
        ob.area(5.5f);
        ob.area(5.5f,2.2f);
        ob.area(10.5,5.5);
    }
}