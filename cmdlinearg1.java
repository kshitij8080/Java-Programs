public class cmdlinearg1 {
    public static void main(String arg[]) {
        int a=Integer.parseInt(arg[0]);
        int b=Integer.parseInt(arg[1]);
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        System.out.println("Addition="+c);
        System.out.println("Subtraction="+d);
        System.out.println("multiplication="+e);
        System.out.println("division="+f);
    }
}
