interface I1
{
    void add(int a, int b);
}

interface I2
{
    void square(int n);
}

class C implements I1, I2
{
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition = " + c);
    }
    public void square(int n) {
        int s = n * n;
        System.out.println("Square = " + s);
    }
}

public class Multiple1 {
    public static void main(String[] args) {
        C ob = new C();
        ob.add(11, 22);
        ob.square(8);
    }
}