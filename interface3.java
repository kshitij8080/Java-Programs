interface shape {
	final float PI=3.14f;
	void area_circle(float r);
	void area_sphere(float r);
}
public class interface3 implements shape   {
	public void area_circle(float r) {
		float a = PI*r*r;
		System.out.println("Area of circle="+a);
	}
	public void area_sphere(float r) {
		float a = 4*PI*r*r;
		System.out.println("Area of sphere="+a);
	}
	public static void main(String[] args) {
		interface3 ob=new interface3();
		ob.area_circle(5.5f);
		ob.area_sphere(10.4f);
	}
}
