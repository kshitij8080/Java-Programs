class funover1 {
    void volume(float r) {
        float v = (4.0f/3.0f)*3.14f*r*r*r;
        System.out.println("Volume of sphere:"+v);
    }
    void volume(float r,float h) {
        float v = (1.0f/3.0f)*3.14f*r*r*h;
        System.out.println("Volume of cone:"+v);
    }
    void volume(double r,double h) {
        double v = 3.14*r*r*h;
        System.out.println("Volume of cylinder:"+v);
    }
    public static void main(String[] args) {
        funover1 ob = new funover1();
        ob.volume(5.5f);
        ob.volume(2.5f,4.6f);
        ob.volume(10.10,5.5);
    }
}